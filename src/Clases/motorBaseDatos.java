package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author jrpaz
 */

public class motorBaseDatos implements IWordle {

    private static String idioma;
    private java.util.Set<String> setPalabras;
    private static final String URL = "jdbc:sqlite:data/dbwordle.db";

    public motorBaseDatos(String idioma) {
        this.idioma = idioma;
    }

    /**
     *
     * @return @throws SQLException
     */
    @Override
    public String palabraAleatoria() throws SQLException {

        String palabraAleatoria = "";

        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement statement = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang= ? ORDER BY RANDOM() LIMIT 1")) {
            statement.setString(1, idioma);
            try ( ResultSet rs = statement.executeQuery()) {
                palabraAleatoria = rs.getString("palabra");
                return palabraAleatoria;
            }
        }
    }

    @Override
    public boolean anhadirPalabra(String palabra) throws SQLException {

        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement statement = conn.prepareStatement("INSERT INTO palabras (palabra,lang) VALUES(?,?)")) {

            statement.setString(1, palabra.toUpperCase().trim());
            statement.setString(2, idioma);
            int insertadas = statement.executeUpdate();
            return insertadas > 0;
        }

    }

    /**
     *
     * @param palabra
     * @return
     * @throws SQLException
     */
    @Override
    public boolean borrarPalabra(String palabra) throws SQLException {
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement statement = conn.prepareStatement("DELETE FROM palabras WHERE palabra=?")) {

            statement.setString(1, palabra.toUpperCase().trim());
            int borradas = statement.executeUpdate();
            return borradas > 0;
        }
    }

    @Override
    public boolean existe(String palabra) {
        PalabrasFileToSet();
        palabra = palabra.toUpperCase().trim();
        return setPalabras.contains(palabra);
    }

    private void PalabrasFileToSet() {
        setPalabras = new java.util.HashSet<>();
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement consulta = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ?")) {

            consulta.setString(1, idioma);
            try ( ResultSet rs = consulta.executeQuery()) {

                while (rs.next()) {
                    String word = rs.getString("palabra");
                    setPalabras.add(word);
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    @Override
    public void mostrar() {
        PalabrasFileToSet();
        System.out.println(setPalabras);
    }

}

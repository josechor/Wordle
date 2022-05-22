/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.*;
import java.util.Iterator;


/**
 *
 * @author jrpaz
 */

public class motorDeporte implements IWordle {

    private java.util.Set<String> palabras = new java.util.HashSet<>();

    private static File FICHERO;

    public motorDeporte(File fichero) {
        FICHERO = fichero;
        palabrasToSet();
    }

    @Override
    public String palabraAleatoria() {

        if (!FICHERO.exists()) {
            crearFichero();
        }

        String palabra = "";

        java.util.Random genNum = new java.util.Random();

        Iterator it = palabras.iterator();

        int numPalabraSeleccionada = genNum.nextInt(palabras.size());
        int contador = 0;

        while (contador <= numPalabraSeleccionada) {
            palabra = (String) it.next();
            contador++;
        }

        return palabra;
    }

    @Override
    public boolean anhadirPalabra(String p) {
        p = p.toLowerCase().trim();

        if (checkPalabra(p)) {
            if (!FICHERO.exists()) {
                crearFichero();
            }
            if (!palabras.contains(p)) {
                if (palabras.add(p)) {
                    if (setToFile()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean borrarPalabra(String p) {

        p = p.toLowerCase().trim();
        if (checkPalabra(p)) {
            if (!FICHERO.exists()) {
                crearFichero();
            }
            if (palabras.contains(p)) {
                if (palabras.remove(p)) {
                    if (setToFile()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean existe(String palabra) {
        palabrasToSet();
        palabra = palabra.toLowerCase().trim();
        return palabras.contains(palabra);
    }

    private boolean palabrasToSet() {

        try ( BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea = br.readLine();
            while (linea != null) {
                palabras.add(linea);
                linea = br.readLine();
            }
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(motorDeporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(motorDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void crearFichero() {

        FICHERO.getParentFile().mkdirs();
        try {
            FICHERO.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(motorDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private boolean checkPalabra(String p) {

        p = p.toLowerCase().trim();
        return p.matches("[A-Za-z]{5}");

    }

    private boolean setToFile() {

        if (!FICHERO.exists()) {
            crearFichero();
        }
        try ( Writer wr = new BufferedWriter(new FileWriter(FICHERO))) {
            wr.write("");
        } catch (IOException ex) {
            Logger.getLogger(motorDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        try ( Writer wr = new BufferedWriter(new FileWriter(FICHERO, true))) {

            StringBuilder sb = new StringBuilder();
            for (String aux : palabras) {
                sb.append(aux).append("\n");
            }
            wr.write(sb.toString());
            return true;
        } catch (IOException ex) {
            Logger.getLogger(motorDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public void mostrar() {
        System.out.println(palabras);
    }
}

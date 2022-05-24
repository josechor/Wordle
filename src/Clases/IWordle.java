/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author alumno
 */
public interface IWordle {
    public String palabraAleatoria() throws SQLException;
    public boolean existe(String p);
    public boolean anhadirPalabra(String p) throws IOException, SQLException;
    public boolean borrarPalabra(String p) throws  SQLException;
    public void mostrar();
}

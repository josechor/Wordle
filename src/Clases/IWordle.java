/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alumno
 */
public interface IWordle {
    public String palabraAleatoria();
    public boolean existe(String p);
    public boolean anhadirPalabra(String p);
    public boolean borrarPalabra(String p);
}

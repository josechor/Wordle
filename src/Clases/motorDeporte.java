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
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author jrpaz
 */
/*
        palabras.add("alero");
        palabras.add("alfil");
        palabras.add("apnea");
        palabras.add("arena");
        palabras.add("baile");
        palabras.add("arena");
        palabras.add("baile");
        palabras.add("banda");
        palabras.add("barco");
        palabras.add("barra");
        palabras.add("bogey");
        palabras.add("bolos");
        palabras.add("botas");
        palabras.add("boxeo");
        palabras.add("braza");
        palabras.add("buceo");
        palabras.add("calle");
        palabras.add("campo");
        palabras.add("canoa");
        palabras.add("casco");
        palabras.add("catch");
        palabras.add("ciclo");
        palabras.add("cinta");
        palabras.add("cross");
        palabras.add("danza");
        palabras.add("dardo");
        palabras.add("derbi");
        palabras.add("diana");
        palabras.add("disco");
        palabras.add("doble");
        palabras.add("falta");
        palabras.add("final");
        palabras.add("fuera");
        palabras.add("ganar");
        palabras.add("gorro");
        palabras.add("grada");
        palabras.add("green");
        palabras.add("hielo");
        palabras.add("hoyos");
        palabras.add("jaque");
        palabras.add("juego");
        palabras.add("kayak");
        palabras.add("lucha");
        palabras.add("marca");
        palabras.add("nadar");
        palabras.add("palas");
        palabras.add("parar");
        palabras.add("pasar");
        palabras.add("penal");
        palabras.add("pesas");
        palabras.add("pesca");
        palabras.add("pique");
        palabras.add("pista");
        palabras.add("pitar");
        palabras.add("playa");
        palabras.add("podio");
        palabras.add("rampa");
        palabras.add("relax");
        palabras.add("remar");
        palabras.add("ritmo");
        palabras.add("rival");
        palabras.add("rugbi");
        palabras.add("saque");
        palabras.add("sudor");
        palabras.add("tabla");
        palabras.add("tanto");
        palabras.add("tapiz");
        palabras.add("tenis");
        palabras.add("tongo");
        palabras.add("traje");
        palabras.add("trial");
        palabras.add("valla");
        palabras.add("veloz");
        palabras.add("visor");
        palabras.add("volar");
        palabras.add("voleo");
        palabras.add("yogui");
        palabras.add("yoqui");
        palabras.add("botar");
        palabras.add("turno");
        palabras.add("zumba");
        palabras.add("kendo");
        palabras.add("rally");
        palabras.add("fondo");
        palabras.add("batir");
        palabras.add("crack");
        palabras.add("wushu");
*/

public class motorDeporte implements IWordle {

    private java.util.Set<String> palabras = new java.util.HashSet<>();

    private static File FICHERO;

    public motorDeporte(File fichero) {
        FICHERO = fichero;
        cargarPalabrasFileToSet();
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
                    if(cargarPalabrasSetToFile()){
                        return true;
                    }
                }

            }
        }
        return false;
    }


    @Override
    public boolean borrarPalabra(String palabra) {

        palabra = palabra.toLowerCase().trim();

        if (checkPalabra(palabra)) {

            if (!FICHERO.exists()) {
                crearFichero();
            }

            if (palabras.contains(palabra)) {

                if (palabras.remove(palabra)) {
                    if(cargarPalabrasSetToFile()){
                        return true;
                    }
                }

            }
        }

        return false;

    }

    
    
    @Override
    public boolean existe(String palabra) {
        cargarPalabrasFileToSet();
        palabra = palabra.toLowerCase().trim();
        return palabras.contains(palabra);
    }

    private boolean cargarPalabrasFileToSet() {

        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
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

    private boolean checkPalabra(String palabra) {

        palabra = palabra.toLowerCase().trim();
        if (palabra.matches("[^a-z]{5}")) {
            return false;
        }
        return true;

    }
    
    
    private boolean cargarPalabrasSetToFile() {

        if (!FICHERO.exists()) {
            crearFichero();
        }

        try (Writer wr = new BufferedWriter(new FileWriter(FICHERO))) {
            wr.write("");
        } catch (IOException ex) {
            Logger.getLogger(motorDeporte.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Writer wr = new BufferedWriter(new FileWriter(FICHERO, true))) {

            StringBuilder sb = new StringBuilder();

            Iterator it = palabras.iterator();

            while (it.hasNext()) {

                String aux = (String) it.next();

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



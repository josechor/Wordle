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
public class motorTest implements IWordle{
    
    
    private java.util.List<String> palabras;

    public motorTest() {
        this.palabras = new java.util.ArrayList<>();
        palabras.add("ismae");
        palabras.add("samue");
        palabras.add("danie");
        palabras.add("anxoa");
        palabras.add("frana");
        palabras.add("xurxo");
        palabras.add("arona");
        palabras.add("jorge");
        palabras.add("juana");
        palabras.add("joser");
        palabras.add("breix");
        palabras.add("gonsa");
        palabras.add("marco");
        palabras.add("silvi");
        palabras.add("adria");
        palabras.add("ciclo");
    }
    
    @Override
    public String palabraAleatoria() {
        int a = (int) (Math.random() * ((3) - 0));
        if(a == 1){
            return "CICLO";
        }else{
            return "CIELO";
        }
    }

    @Override
    public boolean existe(String p) {
        p = p.toLowerCase();
        return palabras.contains(p);
    }

    @Override
    public boolean anhadirPalabra(String p) {
        
        p = p.toLowerCase();
        
        if(!p.matches("[A-Za-z]{5}")){
            System.out.println("no match");
            return false;
        }
        else if(existe(p)){
            return false;
        }else{
            palabras.add(p);
            System.out.println("añadida");
            return true;
            
        }
    }

    @Override
    public boolean borrarPalabra(String p) {
        p = p.toLowerCase();
        if(!p.matches("[A-Za-z]{5}")){
            return false;
        }
        else if(existe(p)){
            palabras.remove(p);
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrar(){
        System.out.println(palabras);
    }
    
    
    
}

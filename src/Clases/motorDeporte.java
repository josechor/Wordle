/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
 
/**
 *
 * @author jrpaz
 */
public class motorDeporte implements IWordle{
    private java.util.List<String> palabras;
    public motorDeporte(){
    this.palabras = new java.util.ArrayList<>();
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
        
}
    @Override
    public String palabraAleatoria() {
        int a = (int) (Math.random() * ((palabras.size()-1) - 0));
        return palabras.get(a);
    }

    @Override
    public boolean existe(String p) {
        p = p.toLowerCase();
        return palabras.contains(p);
    }

    @Override
    public boolean anhadirPalabra(String p) {
        p = p.toLowerCase();
        
        if(p.matches("[A-Za-z]{5}")){
            return false;
        }
        else if(existe(p)){
            return false;
        }else{
            palabras.add(p);
            return true;
        }
    }

    @Override
    public boolean borrarPalabra(String p) {
        p = p.toLowerCase();
        if(p.matches("[A-Za-z]{5}")){
            return false;
        }
        else if(existe(p)){
            palabras.remove(p);
            return true;
        }else{
            return false;
        }
    }
        
}

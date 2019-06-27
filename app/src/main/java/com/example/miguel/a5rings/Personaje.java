package com.example.miguel.a5rings;

import java.util.HashMap;
import java.util.Map;

public class Personaje {

    private Map<String, Integer> fisico = new HashMap<>();
    private String nombrePersonaje;


    public Personaje(){
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }


    public Map<String, Integer> getFisico() {
        return fisico;
    }

    public void añadirAtributo (String atributo, Integer valorAtributo){
       this.fisico.put(atributo,valorAtributo);
    }
}

package com.example.miguel.a5rings;

import java.util.HashMap;

public class Personaje {

    private HashMap<String, Integer> fisico;

    public Personaje(HashMap<String, Integer> fisico) {
        this.fisico = fisico;
    }

    public HashMap<String, Integer> getFisico() {
        return fisico;
    }

    public void setFisico(HashMap<String, Integer> fisico) {
        this.fisico = fisico;
    }

}

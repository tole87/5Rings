package com.example.miguel.a5rings.Personaje;

import com.example.miguel.a5rings.Enums.Habilidad;

import java.util.HashMap;
import java.util.Map;

public class Personaje {

    private Map<String, Integer> atributo = new HashMap<>();
    private Map<String, Integer> habilidad = new HashMap<>();
    private String nombrePersonaje;
    private Integer puntosRestantes;


    public Personaje(){

        for (Habilidad hab : Habilidad.values()) {
           this.habilidad.put(hab.getNombreHabilidad(), 0);
           this.puntosRestantes = 30;
        }

    }

    public Integer getPuntosRestantes() {
        return puntosRestantes;
    }

    public void setPuntosRestantes(Integer puntosRestantes) {
        this.puntosRestantes = puntosRestantes;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public Map<String, Integer> getHabilidad() {
        return habilidad;
    }

    public Map<String, Integer> getHabilidadPositiva(){
        Map<String, Integer> habilidadPositiva = new HashMap<>();
        for (Map.Entry<String, Integer> entry : this.habilidad.entrySet()) {
            if (entry.getValue()!=0){
             habilidadPositiva.put(entry.getKey(), entry.getValue());
            }
        }
        return habilidadPositiva;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public void añadirAtributo (String atributo, Integer valorAtributo){
       this.atributo.put(atributo,valorAtributo);
    }

    public void añadirHabilidad(String habilidad, Integer valorHabilidad){
        this.habilidad.put(habilidad,valorHabilidad);
    }
    public Integer obtenerValorAtributo(String atributo){
       return this.atributo.get(atributo);
    }
    public Integer obtenerValorHabilidad(String habilidad){
        return this.habilidad.get(habilidad);
    }
}

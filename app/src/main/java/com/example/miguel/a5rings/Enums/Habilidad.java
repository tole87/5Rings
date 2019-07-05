package com.example.miguel.a5rings.Enums;

public enum Habilidad {

    CAZAR("Cazar", Atributo.PERCEPCION),
    CONOCIMIENTOS("Conoc. Arcano", Atributo.INTELIGENCIA),
    TRADICION("Conoc. Mundano", Atributo.INTELIGENCIA),
    HISTORIA("Conoc. Especifico", Atributo.INTELIGENCIA),
    LIDERAZGO("Liderazgo", Atributo.VOLUNTAD),
    INVESTIGACION("Investigacion", Atributo.PERCEPCION),
    MANEJOANIMALES("Manejo Animales", Atributo.CONCIENCIA),
    BARDO("Bardo", Atributo.INTELIGENCIA),
    DEFENSAESCUDO("Defensa Escudo", Atributo.REFLEJOS),
    ARMAS1MANO("Armas 1 Mano", Atributo.INTELIGENCIA),
    ARMAS2MANOS("Armas 2 Manos", Atributo.INTELIGENCIA),
    ARMASARCANAS("Armas Arcanas", Atributo.CONCIENCIA),
    ARMAESPECIALISTA("Armas Especialista", Atributo.AGILIDAD),
    ARMASARROJADIZAS("Armas Arrojadizas", Atributo.AGILIDAD),
    ARCO("Arco", Atributo.REFLEJOS),
    LUCHA("Lucha", Atributo.AGILIDAD),
    COMERCIO("Comercio", Atributo.INTELIGENCIA),
    NAVEGACION("Navegacion", Atributo.CONCIENCIA),
    FORJARARMAS("Forjar Armas", Atributo.FUERZA),
    FALSIFICAR("Falsificar", Atributo.INTELIGENCIA),
    JUEGO("Juego", Atributo.INTELIGENCIA),
    INTIMIDAR("Intimidar", Atributo.FUERZA),
    SUPERVIVENCIA("Supervivencia", Atributo.VOLUNTAD),
    SIGILO("Sigilo", Atributo.AGILIDAD),
    TRAMPAS("Trampas", Atributo.PERCEPCION),
    SEDUCCION("Seduccion", Atributo.CONCIENCIA),
    VENENOS("Venenos", Atributo.PERCEPCION),
    SEGUIR("Seguir", Atributo.REFLEJOS),
    BATALLA("Batalla", Atributo.INTELIGENCIA),
    MENTIR("Mentir", Atributo.CONCIENCIA),
    EQUITACON("Equitacion", Atributo.REFLEJOS);




    private Atributo atributo;
    private String nombreHabilidad;

    Habilidad(String nombreHabilidad, Atributo atributo) {
        this.atributo = atributo;
        this.nombreHabilidad = nombreHabilidad;
    }

    public Atributo getAtributo() {
        return atributo;    }

    public String getNombreHabilidad() {
        return nombreHabilidad;    }
}

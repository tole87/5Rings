package com.example.miguel.a5rings.Enums;

public enum Habilidad {

    CAZAR("Cazar", Atributo.PERCEPCION),
    CONOCIMIENTOARCANO("Conoc. Arcano", Atributo.INTELIGENCIA),
    CONOCIMIENTOMUNDANO("Conoc. Mundano", Atributo.INTELIGENCIA),
    CONOCIMIENTOESPECIFICO("Conoc. Especifico", Atributo.INTELIGENCIA),
    TRADICION("Tradicion", Atributo.INTELIGENCIA),
    HISTORIA("Historia", Atributo.INTELIGENCIA),
    LIDERAZGO("Liderazgo", Atributo.VOLUNTAD),
    BUSCAR("Buscar/Investigar", Atributo.PERCEPCION),
    MANEJOANIMALES("Manejo Animales", Atributo.CONCIENCIA),
    BARDO("Bardo", Atributo.INTELIGENCIA),
    DEFENSAESCUDO("Defensa/Escudo", Atributo.REFLEJOS),
    ARMAS1MANO("Arma 1 Mano", Atributo.INTELIGENCIA),
    ARMAS2MANOS("Arma 2 Manos", Atributo.INTELIGENCIA),
    ARMASARCANAS("Armas Arcanas", Atributo.CONCIENCIA),
    ARMAESPECIALISTA("Armas Especialista", Atributo.AGILIDAD),
    ARMASARROJADIZAS("Armas Arrojadizas", Atributo.AGILIDAD),
    ARCO("Arco", Atributo.REFLEJOS),
    COMBATE("Lucha/Combate", Atributo.AGILIDAD),
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
    SEGUIR("Seguir/Acechar", Atributo.REFLEJOS),
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

package com.example.miguel.a5rings;

public enum Habilidad {

    CAZAR(Atributo.PERCEPCION),
    CONOCIMIENTOS(Atributo.INTELIGENCIA),
    TRADICION(Atributo.INTELIGENCIA),
    HISTORIA(Atributo.INTELIGENCIA),
    LIDERAZGO(Atributo.VOLUNTAD),
    INVESTIGACION(Atributo.PERCEPCION),
    MANEJOANIMALES(Atributo.CONCIENCIA),
    BARDO(Atributo.INTELIGENCIA),
    DEFENSAESCUDO(Atributo.REFLEJOS),
    ARMAS1MANO(Atributo.INTELIGENCIA),
    ARMAS2MANOS(Atributo.INTELIGENCIA),
    ARMASARCANAS(Atributo.CONCIENCIA),
    ARMAESPECIALISTA(Atributo.AGILIDAD),
    ARMASARROJADIZAS(Atributo.AGILIDAD),
    ARCO(Atributo.REFLEJOS),
    LUCHA(Atributo.AGILIDAD),
    COMERCIO(Atributo.INTELIGENCIA),
    NAVEGACION(Atributo.CONCIENCIA),
    FORJARARMAS(Atributo.FUERZA),
    FALSIFICAR(Atributo.INTELIGENCIA),
    JUEGO(Atributo.INTELIGENCIA),
    INTIMIDAR(Atributo.FUERZA),
    SUPERVIVENCIA(Atributo.VOLUNTAD),
    SIGILO(Atributo.AGILIDAD),
    TRAMPAS(Atributo.PERCEPCION),
    SEDUCCION(Atributo.CONCIENCIA),
    VENENOS(Atributo.PERCEPCION),
    SEGUIR(Atributo.REFLEJOS),
    BATALLA(Atributo.INTELIGENCIA),
    MENTIR(Atributo.CONCIENCIA),
    EQUITACON(Atributo.REFLEJOS);




    private Atributo atributo;

    Habilidad(Atributo atributo) {
        this.atributo = atributo;
    }

    public Atributo getAtributo() {
        return atributo;    }
}

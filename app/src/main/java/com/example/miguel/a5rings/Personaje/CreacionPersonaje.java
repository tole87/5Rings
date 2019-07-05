package com.example.miguel.a5rings.Personaje;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.miguel.a5rings.MainActivity;
import com.example.miguel.a5rings.R;

public class CreacionPersonaje extends AppCompatActivity {

    TextView puntosDisponiblesTextView;
    Personaje nuevoPersonaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_personaje);

        puntosDisponiblesTextView = findViewById(R.id.puntos_disponibles);
        nuevoPersonaje = new Personaje();

        findViewById(R.id.suma_fuerza).setOnClickListener(v -> modificarFuerza(R.id.suma_fuerza, findViewById(R.id.contador_fuerza_text_view)));
        findViewById(R.id.resta_fuerza).setOnClickListener(v -> modificarFuerza(R.id.resta_fuerza, findViewById(R.id.contador_fuerza_text_view)));
        findViewById(R.id.suma_agilidad).setOnClickListener(v -> modificarAgilidad(R.id.suma_agilidad, findViewById(R.id.contador_agilidad_text_view)));
        findViewById(R.id.resta_agilidad).setOnClickListener(v -> modificarAgilidad(R.id.resta_agilidad, findViewById(R.id.contador_agilidad_text_view)));
        findViewById(R.id.suma_reflejos).setOnClickListener(v -> modificarReflejos(R.id.suma_reflejos, findViewById(R.id.contador_reflejos_text_view)));
        findViewById(R.id.resta_reflejos).setOnClickListener(v -> modificarReflejos(R.id.resta_reflejos, findViewById(R.id.contador_reflejos_text_view)));
        findViewById(R.id.suma_resistencia).setOnClickListener(v -> modificarResistencia(R.id.suma_resistencia, findViewById(R.id.contador_resistencia_text_view)));
        findViewById(R.id.resta_resistencia).setOnClickListener(v -> modificarResistencia(R.id.resta_resistencia, findViewById(R.id.contador_resistencia_text_view)));
        findViewById(R.id.suma_voluntad).setOnClickListener(v -> modificarVoluntad(R.id.suma_voluntad, findViewById(R.id.contador_voluntad_text_view)));
        findViewById(R.id.resta_voluntad).setOnClickListener(v -> modificarVoluntad(R.id.resta_voluntad, findViewById(R.id.contador_voluntad_text_view)));
        findViewById(R.id.suma_percepcion).setOnClickListener(v -> modificarPercepcion(R.id.suma_percepcion, findViewById(R.id.contador_percepcion_text_view)));
        findViewById(R.id.resta_percepcion).setOnClickListener(v -> modificarPercepcion(R.id.resta_percepcion, findViewById(R.id.contador_percepcion_text_view)));
        findViewById(R.id.suma_inteligencia).setOnClickListener(v -> modificarInteligencia(R.id.suma_inteligencia, findViewById(R.id.contador_inteligencia_text_view)));
        findViewById(R.id.resta_inteligencia).setOnClickListener(v -> modificarInteligencia(R.id.resta_inteligencia, findViewById(R.id.contador_inteligencia_text_view)));
        findViewById(R.id.suma_conciencia).setOnClickListener(v -> modificarConciencia(R.id.suma_conciencia, findViewById(R.id.contador_conciencia_text_view)));
        findViewById(R.id.resta_conciencia).setOnClickListener(v -> modificarConciencia(R.id.resta_conciencia, findViewById(R.id.contador_conciencia_text_view)));
        findViewById(R.id.suma_trance).setOnClickListener(v -> modificarTrance(R.id.suma_trance, findViewById(R.id.contador_trance_text_view)));
        findViewById(R.id.resta_trance).setOnClickListener(v -> modificarTrance(R.id.resta_trance, findViewById(R.id.contador_trance_text_view)));
        findViewById(R.id.suma_berserker).setOnClickListener(v -> modificarBerserker(R.id.suma_berserker, findViewById(R.id.contador_berserker_text_view)));
        findViewById(R.id.resta_berserker).setOnClickListener(v -> modificarBerserker(R.id.resta_berserker, findViewById(R.id.contador_berserker_text_view)));
        findViewById(R.id.suma_cazar).setOnClickListener(v -> modificarCazar(R.id.suma_cazar, findViewById(R.id.contador_cazar_text_view)));
        findViewById(R.id.resta_cazar).setOnClickListener(v -> modificarCazar(R.id.resta_cazar, findViewById(R.id.contador_cazar_text_view)));
        findViewById(R.id.suma_tradicion).setOnClickListener(v -> modificarTradicion(R.id.suma_tradicion, findViewById(R.id.contador_tradicion_text_view)));
        findViewById(R.id.resta_tradicion).setOnClickListener(v -> modificarTradicion(R.id.resta_tradicion, findViewById(R.id.contador_tradicion_text_view)));
        findViewById(R.id.suma_historia).setOnClickListener(v -> modificarHistoria(R.id.suma_historia, findViewById(R.id.contador_historia_text_view)));
        findViewById(R.id.resta_historia).setOnClickListener(v -> modificarHistoria(R.id.resta_historia, findViewById(R.id.contador_historia_text_view)));
        findViewById(R.id.suma_liderazgo).setOnClickListener(v -> modificarLiderazgo(R.id.suma_liderazgo, findViewById(R.id.contador_liderazgo_text_view)));
        findViewById(R.id.resta_liderazgo).setOnClickListener(v -> modificarLiderazgo(R.id.resta_liderazgo, findViewById(R.id.contador_liderazgo_text_view)));
        findViewById(R.id.suma_buscar).setOnClickListener(v -> modificarBuscar(R.id.suma_buscar, findViewById(R.id.contador_buscar_text_view)));
        findViewById(R.id.resta_buscar).setOnClickListener(v -> modificarBuscar(R.id.resta_buscar, findViewById(R.id.contador_buscar_text_view)));
        findViewById(R.id.suma_animales).setOnClickListener(v -> modificarAnimales(R.id.suma_animales, findViewById(R.id.contador_animales_text_view)));
        findViewById(R.id.resta_animales).setOnClickListener(v -> modificarAnimales(R.id.resta_animales, findViewById(R.id.contador_animales_text_view)));
        findViewById(R.id.suma_bardo).setOnClickListener(v -> modificarBardo(R.id.suma_bardo, findViewById(R.id.contador_bardo_text_view)));
        findViewById(R.id.resta_bardo).setOnClickListener(v -> modificarBardo(R.id.resta_bardo, findViewById(R.id.contador_bardo_text_view)));
        findViewById(R.id.suma_escudo).setOnClickListener(v -> modificarEscudo(R.id.suma_escudo, findViewById(R.id.contador_escudo_text_view)));
        findViewById(R.id.resta_escudo).setOnClickListener(v -> modificarEscudo(R.id.resta_escudo, findViewById(R.id.contador_escudo_text_view)));
        findViewById(R.id.suma_una_mano).setOnClickListener(v -> modificarUnaMano(R.id.suma_una_mano, findViewById(R.id.contador_una_mano_text_view)));
        findViewById(R.id.resta_una_mano).setOnClickListener(v -> modificarUnaMano(R.id.resta_una_mano, findViewById(R.id.contador_una_mano_text_view)));
        findViewById(R.id.suma_dos_mano).setOnClickListener(v -> modificarDosManos(R.id.suma_dos_mano, findViewById(R.id.contador_dos_mano_text_view)));
        findViewById(R.id.resta_dos_mano).setOnClickListener(v -> modificarDosManos(R.id.resta_dos_mano, findViewById(R.id.contador_dos_mano_text_view)));
        findViewById(R.id.suma_arma_arcana).setOnClickListener(v -> modificarArmaArcana(R.id.suma_arma_arcana, findViewById(R.id.contador_arma_arcana_text_view)));
        findViewById(R.id.resta_arma_arcana).setOnClickListener(v -> modificarArmaArcana(R.id.resta_arma_arcana, findViewById(R.id.contador_arma_arcana_text_view)));
        findViewById(R.id.suma_arma_especialista).setOnClickListener(v -> modificarArmaEspecialista(R.id.suma_arma_especialista, findViewById(R.id.contador_arma_especialista_text_view)));
        findViewById(R.id.resta_arma_especialista).setOnClickListener(v -> modificarArmaEspecialista(R.id.resta_arma_especialista, findViewById(R.id.contador_arma_especialista_text_view)));
        findViewById(R.id.suma_arma_arrojadiza).setOnClickListener(v -> modificarArmaArrojadiza(R.id.suma_arma_arrojadiza, findViewById(R.id.contador_arma_arrojadiza_text_view)));
        findViewById(R.id.resta_arma_arrojadiza).setOnClickListener(v -> modificarArmaArrojadiza(R.id.resta_arma_arrojadiza, findViewById(R.id.contador_arma_arrojadiza_text_view)));
        findViewById(R.id.suma_arco).setOnClickListener(v -> modificarArco(R.id.suma_arco, findViewById(R.id.contador_arco_text_view)));
        findViewById(R.id.resta_arco).setOnClickListener(v -> modificarArco(R.id.resta_arco, findViewById(R.id.contador_arco_text_view)));
        findViewById(R.id.suma_combate).setOnClickListener(v -> modificarCombate(R.id.suma_combate, findViewById(R.id.contador_combate_text_view)));
        findViewById(R.id.resta_combate).setOnClickListener(v -> modificarCombate(R.id.resta_combate, findViewById(R.id.contador_combate_text_view)));
        findViewById(R.id.suma_comercio).setOnClickListener(v -> modificarComercio(R.id.suma_comercio, findViewById(R.id.contador_comercio_text_view)));
        findViewById(R.id.resta_comercio).setOnClickListener(v -> modificarComercio(R.id.resta_comercio, findViewById(R.id.contador_comercio_text_view)));
        findViewById(R.id.suma_navegacion).setOnClickListener(v -> modificarNavegacion(R.id.suma_navegacion, findViewById(R.id.contador_navegacion_text_view)));
        findViewById(R.id.resta_navegacion).setOnClickListener(v -> modificarNavegacion(R.id.resta_navegacion, findViewById(R.id.contador_navegacion_text_view)));
        findViewById(R.id.suma_forjar).setOnClickListener(v -> modificarForjar(R.id.suma_forjar, findViewById(R.id.contador_forjar_text_view)));
        findViewById(R.id.resta_forjar).setOnClickListener(v -> modificarForjar(R.id.resta_forjar, findViewById(R.id.contador_forjar_text_view)));
        findViewById(R.id.suma_falsificar).setOnClickListener(v -> modificarFalsificar(R.id.suma_falsificar, findViewById(R.id.contador_falsificar_text_view)));
        findViewById(R.id.resta_falsificar).setOnClickListener(v -> modificarFalsificar(R.id.resta_falsificar, findViewById(R.id.contador_falsificar_text_view)));
        findViewById(R.id.suma_juego).setOnClickListener(v -> modificarJuego(R.id.suma_juego, findViewById(R.id.contador_juego_text_view)));
        findViewById(R.id.resta_juego).setOnClickListener(v -> modificarJuego(R.id.resta_juego, findViewById(R.id.contador_juego_text_view)));
        findViewById(R.id.suma_intimidar).setOnClickListener(v -> modificarIntimidar(R.id.suma_intimidar, findViewById(R.id.contador_intimidar_text_view)));
        findViewById(R.id.resta_intimidar).setOnClickListener(v -> modificarIntimidar(R.id.resta_intimidar, findViewById(R.id.contador_intimidar_text_view)));
        findViewById(R.id.suma_supervivencia).setOnClickListener(v -> modificarSupervivencia(R.id.suma_supervivencia, findViewById(R.id.contador_supervivencia_text_view)));
        findViewById(R.id.resta_supervivencia).setOnClickListener(v -> modificarSupervivencia(R.id.resta_supervivencia, findViewById(R.id.contador_supervivencia_text_view)));
        findViewById(R.id.suma_sigilo).setOnClickListener(v -> modificarSigilo(R.id.suma_sigilo, findViewById(R.id.contador_sigilo_text_view)));
        findViewById(R.id.resta_sigilo).setOnClickListener(v -> modificarSigilo(R.id.resta_sigilo, findViewById(R.id.contador_sigilo_text_view)));
        findViewById(R.id.suma_trampas).setOnClickListener(v -> modificarTrampas(R.id.suma_trampas, findViewById(R.id.contador_trampas_text_view)));
        findViewById(R.id.resta_trampas).setOnClickListener(v -> modificarTrampas(R.id.resta_trampas, findViewById(R.id.contador_trampas_text_view)));
        findViewById(R.id.suma_seduccion).setOnClickListener(v -> modificarSeduccion(R.id.suma_seduccion, findViewById(R.id.contador_seduccion_text_view)));
        findViewById(R.id.resta_seduccion).setOnClickListener(v -> modificarSeduccion(R.id.resta_seduccion, findViewById(R.id.contador_seduccion_text_view)));
        findViewById(R.id.suma_venenos).setOnClickListener(v -> modificarVenenos(R.id.suma_venenos, findViewById(R.id.contador_venenos_text_view)));
        findViewById(R.id.resta_venenos).setOnClickListener(v -> modificarVenenos(R.id.resta_venenos, findViewById(R.id.contador_venenos_text_view)));
        findViewById(R.id.suma_seguir).setOnClickListener(v -> modificarSeguir(R.id.suma_seguir, findViewById(R.id.contador_seguir_text_view)));
        findViewById(R.id.resta_seguir).setOnClickListener(v -> modificarSeguir(R.id.resta_seguir, findViewById(R.id.contador_seguir_text_view)));
        findViewById(R.id.suma_batalla).setOnClickListener(v -> modificarBatalla(R.id.suma_batalla, findViewById(R.id.contador_batalla_text_view)));
        findViewById(R.id.resta_batalla).setOnClickListener(v -> modificarBatalla(R.id.resta_batalla, findViewById(R.id.contador_batalla_text_view)));
        findViewById(R.id.suma_mentir).setOnClickListener(v -> modificarMentir(R.id.suma_mentir, findViewById(R.id.contador_mentir_text_view)));
        findViewById(R.id.resta_mentir).setOnClickListener(v -> modificarMentir(R.id.resta_mentir, findViewById(R.id.contador_mentir_text_view)));
        findViewById(R.id.suma_equitacion).setOnClickListener(v -> modificarEquitacion(R.id.suma_equitacion, findViewById(R.id.contador_equitacion_text_view)));
        findViewById(R.id.resta_equitacion).setOnClickListener(v -> modificarEquitacion(R.id.resta_equitacion, findViewById(R.id.contador_equitacion_text_view)));
        findViewById(R.id.suma_conocimiento_arcano).setOnClickListener(v -> modificarConocimientoArcano(R.id.suma_conocimiento_arcano, findViewById(R.id.contador_conocimiento_arcano)));
        findViewById(R.id.resta_conocimiento_arcano).setOnClickListener(v -> modificarConocimientoArcano(R.id.resta_conocimiento_arcano, findViewById(R.id.contador_conocimiento_arcano)));
        findViewById(R.id.suma_conocimiento_mundano).setOnClickListener(v -> modificarConocimientoMundano(R.id.suma_conocimiento_mundano, findViewById(R.id.contador_conocimiento_mundano_text_view)));
        findViewById(R.id.resta_conocimiento_mundano).setOnClickListener(v -> modificarConocimientoMundano(R.id.resta_conocimiento_mundano, findViewById(R.id.contador_conocimiento_mundano_text_view)));
        findViewById(R.id.suma_conocimiento_especifico).setOnClickListener(v -> modificarConocimientoEspecifico(R.id.suma_conocimiento_especifico, findViewById(R.id.contador_conocimiento_especifico_text_view)));
        findViewById(R.id.resta_conocimiento_especifico).setOnClickListener(v -> modificarConocimientoEspecifico(R.id.resta_conocimiento_especifico, findViewById(R.id.contador_conocimiento_especifico_text_view)));


    }
    private void modificarConocimientoEspecifico(int id, TextView conocimientoEspecificoTextView) {
        if (id == R.id.suma_conocimiento_especifico && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(conocimientoEspecificoTextView.getText().toString()) + 1))) {
            conocimientoEspecificoTextView.setText(String.valueOf(Integer.parseInt(conocimientoEspecificoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(conocimientoEspecificoTextView.getText().toString())));
        }

        if (id == R.id.resta_conocimiento_especifico && Integer.parseInt(conocimientoEspecificoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(conocimientoEspecificoTextView.getText().toString())));
            conocimientoEspecificoTextView.setText(String.valueOf(Integer.parseInt(conocimientoEspecificoTextView.getText().toString()) - 1));
        }
    }

    private void modificarConocimientoMundano(int id, TextView conocimientoMundanoTextView) {
        if (id == R.id.suma_conocimiento_mundano && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(conocimientoMundanoTextView.getText().toString()) + 1))) {
            conocimientoMundanoTextView.setText(String.valueOf(Integer.parseInt(conocimientoMundanoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(conocimientoMundanoTextView.getText().toString())));
        }

        if (id == R.id.resta_conocimiento_mundano && Integer.parseInt(conocimientoMundanoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(conocimientoMundanoTextView.getText().toString())));
            conocimientoMundanoTextView.setText(String.valueOf(Integer.parseInt(conocimientoMundanoTextView.getText().toString()) - 1));
        }
    }

    private void modificarConocimientoArcano(int id, TextView conocimientoArcanoTextView) {
        if (id == R.id.suma_conocimiento_arcano && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(conocimientoArcanoTextView.getText().toString()) + 1))) {
            conocimientoArcanoTextView.setText(String.valueOf(Integer.parseInt(conocimientoArcanoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(conocimientoArcanoTextView.getText().toString())));
        }

        if (id == R.id.resta_conocimiento_arcano && Integer.parseInt(conocimientoArcanoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(conocimientoArcanoTextView.getText().toString())));
            conocimientoArcanoTextView.setText(String.valueOf(Integer.parseInt(conocimientoArcanoTextView.getText().toString()) - 1));
        }
    }

    private void modificarEquitacion(int id, TextView equitacionTextView) {
        if (id == R.id.suma_equitacion && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(equitacionTextView.getText().toString()) + 1))) {
            equitacionTextView.setText(String.valueOf(Integer.parseInt(equitacionTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(equitacionTextView.getText().toString())));
        }

        if (id == R.id.resta_equitacion && Integer.parseInt(equitacionTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(equitacionTextView.getText().toString())));
            equitacionTextView.setText(String.valueOf(Integer.parseInt(equitacionTextView.getText().toString()) - 1));
        }
    }

    private void modificarMentir(int id, TextView mentirTextView) {
        if (id == R.id.suma_mentir && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(mentirTextView.getText().toString()) + 1))) {
            mentirTextView.setText(String.valueOf(Integer.parseInt(mentirTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(mentirTextView.getText().toString())));
        }

        if (id == R.id.resta_mentir && Integer.parseInt(mentirTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(mentirTextView.getText().toString())));
            mentirTextView.setText(String.valueOf(Integer.parseInt(mentirTextView.getText().toString()) - 1));
        }
    }

    private void modificarBatalla(int id, TextView batallaTextView) {
        if (id == R.id.suma_batalla && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(batallaTextView.getText().toString()) + 1))) {
            batallaTextView.setText(String.valueOf(Integer.parseInt(batallaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(batallaTextView.getText().toString())));
        }

        if (id == R.id.resta_batalla && Integer.parseInt(batallaTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(batallaTextView.getText().toString())));
            batallaTextView.setText(String.valueOf(Integer.parseInt(batallaTextView.getText().toString()) - 1));
        }
    }

    private void modificarSeguir(int id, TextView seguirTextView) {
        if (id == R.id.suma_seguir && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(seguirTextView.getText().toString()) + 1))) {
            seguirTextView.setText(String.valueOf(Integer.parseInt(seguirTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(seguirTextView.getText().toString())));
        }

        if (id == R.id.resta_seguir && Integer.parseInt(seguirTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(seguirTextView.getText().toString())));
            seguirTextView.setText(String.valueOf(Integer.parseInt(seguirTextView.getText().toString()) - 1));
        }
    }

    private void modificarVenenos(int id, TextView venenosTextView) {
        if (id == R.id.suma_venenos && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(venenosTextView.getText().toString()) + 1))) {
            venenosTextView.setText(String.valueOf(Integer.parseInt(venenosTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(venenosTextView.getText().toString())));
        }

        if (id == R.id.resta_venenos && Integer.parseInt(venenosTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(venenosTextView.getText().toString())));
            venenosTextView.setText(String.valueOf(Integer.parseInt(venenosTextView.getText().toString()) - 1));
        }
    }

    private void modificarSeduccion(int id, TextView seduccionTextView) {
        if (id == R.id.suma_seduccion && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(seduccionTextView.getText().toString()) + 1))) {
            seduccionTextView.setText(String.valueOf(Integer.parseInt(seduccionTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(seduccionTextView.getText().toString())));
        }

        if (id == R.id.resta_seduccion && Integer.parseInt(seduccionTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(seduccionTextView.getText().toString())));
            seduccionTextView.setText(String.valueOf(Integer.parseInt(seduccionTextView.getText().toString()) - 1));
        }
    }

    private void modificarTrampas(int id, TextView trampasTextView) {
        if (id == R.id.suma_trampas && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(trampasTextView.getText().toString()) + 1))) {
            trampasTextView.setText(String.valueOf(Integer.parseInt(trampasTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(trampasTextView.getText().toString())));
        }

        if (id == R.id.resta_trampas && Integer.parseInt(trampasTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(trampasTextView.getText().toString())));
            trampasTextView.setText(String.valueOf(Integer.parseInt(trampasTextView.getText().toString()) - 1));
        }
    }

    private void modificarSigilo(int id, TextView sigiloTextView) {
        if (id == R.id.suma_sigilo && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(sigiloTextView.getText().toString()) + 1))) {
            sigiloTextView.setText(String.valueOf(Integer.parseInt(sigiloTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(sigiloTextView.getText().toString())));
        }

        if (id == R.id.resta_sigilo && Integer.parseInt(sigiloTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(sigiloTextView.getText().toString())));
            sigiloTextView.setText(String.valueOf(Integer.parseInt(sigiloTextView.getText().toString()) - 1));
        }
    }

    private void modificarSupervivencia(int id, TextView supervivenciaTextView) {
        if (id == R.id.suma_supervivencia && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(supervivenciaTextView.getText().toString()) + 1))) {
            supervivenciaTextView.setText(String.valueOf(Integer.parseInt(supervivenciaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(supervivenciaTextView.getText().toString())));
        }

        if (id == R.id.resta_supervivencia && Integer.parseInt(supervivenciaTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(supervivenciaTextView.getText().toString())));
            supervivenciaTextView.setText(String.valueOf(Integer.parseInt(supervivenciaTextView.getText().toString()) - 1));
        }
    }

    private void modificarIntimidar(int id, TextView intimidarTextView) {
        if (id == R.id.suma_intimidar && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(intimidarTextView.getText().toString()) + 1))) {
            intimidarTextView.setText(String.valueOf(Integer.parseInt(intimidarTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(intimidarTextView.getText().toString())));
        }

        if (id == R.id.resta_intimidar && Integer.parseInt(intimidarTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(intimidarTextView.getText().toString())));
            intimidarTextView.setText(String.valueOf(Integer.parseInt(intimidarTextView.getText().toString()) - 1));
        }
    }

    private void modificarJuego(int id, TextView juegoTextView) {
        if (id == R.id.suma_juego && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(juegoTextView.getText().toString()) + 1))) {
            juegoTextView.setText(String.valueOf(Integer.parseInt(juegoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(juegoTextView.getText().toString())));
        }

        if (id == R.id.resta_juego && Integer.parseInt(juegoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(juegoTextView.getText().toString())));
            juegoTextView.setText(String.valueOf(Integer.parseInt(juegoTextView.getText().toString()) - 1));
        }
    }

    private void modificarFalsificar(int id, TextView falsificarTextView) {
        if (id == R.id.suma_falsificar && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(falsificarTextView.getText().toString()) + 1))) {
            falsificarTextView.setText(String.valueOf(Integer.parseInt(falsificarTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(falsificarTextView.getText().toString())));
        }

        if (id == R.id.resta_falsificar && Integer.parseInt(falsificarTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(falsificarTextView.getText().toString())));
            falsificarTextView.setText(String.valueOf(Integer.parseInt(falsificarTextView.getText().toString()) - 1));
        }
    }


    private void modificarForjar(int id, TextView forjarTextView) {
        if (id == R.id.suma_forjar && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(forjarTextView.getText().toString()) + 1))) {
            forjarTextView.setText(String.valueOf(Integer.parseInt(forjarTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(forjarTextView.getText().toString())));
        }

        if (id == R.id.resta_forjar && Integer.parseInt(forjarTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(forjarTextView.getText().toString())));
            forjarTextView.setText(String.valueOf(Integer.parseInt(forjarTextView.getText().toString()) - 1));
        }
    }

    private void modificarNavegacion(int id, TextView navegacionTextView) {
        if (id == R.id.suma_navegacion && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(navegacionTextView.getText().toString()) + 1))) {
            navegacionTextView.setText(String.valueOf(Integer.parseInt(navegacionTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(navegacionTextView.getText().toString())));
        }

        if (id == R.id.resta_navegacion && Integer.parseInt(navegacionTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(navegacionTextView.getText().toString())));
            navegacionTextView.setText(String.valueOf(Integer.parseInt(navegacionTextView.getText().toString()) - 1));
        }
    }

    private void modificarComercio(int id, TextView comercioTextView) {
        if (id == R.id.suma_comercio && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(comercioTextView.getText().toString()) + 1))) {
            comercioTextView.setText(String.valueOf(Integer.parseInt(comercioTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(comercioTextView.getText().toString())));
        }

        if (id == R.id.resta_comercio && Integer.parseInt(comercioTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(comercioTextView.getText().toString())));
            comercioTextView.setText(String.valueOf(Integer.parseInt(comercioTextView.getText().toString()) - 1));
        }
    }

    private void modificarCombate(int id, TextView combateTextView) {
        if (id == R.id.suma_combate && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(combateTextView.getText().toString()) + 1))) {
            combateTextView.setText(String.valueOf(Integer.parseInt(combateTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(combateTextView.getText().toString())));
        }

        if (id == R.id.resta_combate && Integer.parseInt(combateTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(combateTextView.getText().toString())));
            combateTextView.setText(String.valueOf(Integer.parseInt(combateTextView.getText().toString()) - 1));
        }
    }

    private void modificarArco(int id, TextView arcoTextView) {
        if (id == R.id.suma_arco && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(arcoTextView.getText().toString()) + 1))) {
            arcoTextView.setText(String.valueOf(Integer.parseInt(arcoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(arcoTextView.getText().toString())));
        }

        if (id == R.id.resta_arco && Integer.parseInt(arcoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(arcoTextView.getText().toString())));
            arcoTextView.setText(String.valueOf(Integer.parseInt(arcoTextView.getText().toString()) - 1));
        }
    }

    private void modificarArmaArrojadiza(int id, TextView armaArrojadizaTextView) {
        if (id == R.id.suma_arma_arrojadiza && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(armaArrojadizaTextView.getText().toString()) + 1))) {
            armaArrojadizaTextView.setText(String.valueOf(Integer.parseInt(armaArrojadizaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(armaArrojadizaTextView.getText().toString())));
        }

        if (id == R.id.resta_arma_arrojadiza && Integer.parseInt(armaArrojadizaTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(armaArrojadizaTextView.getText().toString())));
            armaArrojadizaTextView.setText(String.valueOf(Integer.parseInt(armaArrojadizaTextView.getText().toString()) - 1));
        }
    }

    private void modificarArmaEspecialista(int id, TextView armaEspecialistaTextView) {
        if (id == R.id.suma_arma_especialista && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(armaEspecialistaTextView.getText().toString()) + 1))) {
            armaEspecialistaTextView.setText(String.valueOf(Integer.parseInt(armaEspecialistaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(armaEspecialistaTextView.getText().toString())));
        }

        if (id == R.id.resta_arma_especialista && Integer.parseInt(armaEspecialistaTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(armaEspecialistaTextView.getText().toString())));
            armaEspecialistaTextView.setText(String.valueOf(Integer.parseInt(armaEspecialistaTextView.getText().toString()) - 1));
        }
    }

    private void modificarArmaArcana(int id, TextView armaArcanaTextView) {
        if (id == R.id.suma_arma_arcana && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(armaArcanaTextView.getText().toString()) + 1))) {
            armaArcanaTextView.setText(String.valueOf(Integer.parseInt(armaArcanaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(armaArcanaTextView.getText().toString())));
        }

        if (id == R.id.resta_arma_arcana && Integer.parseInt(armaArcanaTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(armaArcanaTextView.getText().toString())));
            armaArcanaTextView.setText(String.valueOf(Integer.parseInt(armaArcanaTextView.getText().toString()) - 1));
        }
    }

    private void modificarDosManos(int id, TextView dosManoTextView) {
        if (id == R.id.suma_dos_mano && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(dosManoTextView.getText().toString()) + 1))) {
            dosManoTextView.setText(String.valueOf(Integer.parseInt(dosManoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(dosManoTextView.getText().toString())));
        }

        if (id == R.id.resta_dos_mano && Integer.parseInt(dosManoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(dosManoTextView.getText().toString())));
            dosManoTextView.setText(String.valueOf(Integer.parseInt(dosManoTextView.getText().toString()) - 1));
        }
    }

    private void modificarUnaMano(int id, TextView unaManoTextView) {
        if (id == R.id.suma_una_mano && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(unaManoTextView.getText().toString()) + 1))) {
            unaManoTextView.setText(String.valueOf(Integer.parseInt(unaManoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(unaManoTextView.getText().toString())));
        }

        if (id == R.id.resta_una_mano && Integer.parseInt(unaManoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(unaManoTextView.getText().toString())));
            unaManoTextView.setText(String.valueOf(Integer.parseInt(unaManoTextView.getText().toString()) - 1));
        }
    }

    private void modificarEscudo(int id, TextView escudoTextView) {
        if (id == R.id.suma_escudo && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(escudoTextView.getText().toString()) + 1))) {
            escudoTextView.setText(String.valueOf(Integer.parseInt(escudoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(escudoTextView.getText().toString())));
        }

        if (id == R.id.resta_escudo && Integer.parseInt(escudoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(escudoTextView.getText().toString())));
            escudoTextView.setText(String.valueOf(Integer.parseInt(escudoTextView.getText().toString()) - 1));
        }
    }

    private void modificarBardo(int id, TextView bardoTextView) {
        if (id == R.id.suma_bardo && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(bardoTextView.getText().toString()) + 1))) {
            bardoTextView.setText(String.valueOf(Integer.parseInt(bardoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(bardoTextView.getText().toString())));
        }

        if (id == R.id.resta_bardo && Integer.parseInt(bardoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(bardoTextView.getText().toString())));
            bardoTextView.setText(String.valueOf(Integer.parseInt(bardoTextView.getText().toString()) - 1));
        }
    }

    private void modificarAnimales(int id, TextView animalesTextView) {
        if (id == R.id.suma_animales && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(animalesTextView.getText().toString()) + 1))) {
            animalesTextView.setText(String.valueOf(Integer.parseInt(animalesTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(animalesTextView.getText().toString())));
        }

        if (id == R.id.resta_animales && Integer.parseInt(animalesTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(animalesTextView.getText().toString())));
            animalesTextView.setText(String.valueOf(Integer.parseInt(animalesTextView.getText().toString()) - 1));
        }
    }

    private void modificarBuscar(int id, TextView buscarTextView) {
        if (id == R.id.suma_buscar && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(buscarTextView.getText().toString()) + 1))) {
            buscarTextView.setText(String.valueOf(Integer.parseInt(buscarTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(buscarTextView.getText().toString())));
        }

        if (id == R.id.resta_buscar && Integer.parseInt(buscarTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(buscarTextView.getText().toString())));
            buscarTextView.setText(String.valueOf(Integer.parseInt(buscarTextView.getText().toString()) - 1));
        }
    }

    private void modificarLiderazgo(int id, TextView liderazgoTextView) {
        if (id == R.id.suma_liderazgo && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(liderazgoTextView.getText().toString()) + 1))) {
            liderazgoTextView.setText(String.valueOf(Integer.parseInt(liderazgoTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(liderazgoTextView.getText().toString())));
        }

        if (id == R.id.resta_liderazgo && Integer.parseInt(liderazgoTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(liderazgoTextView.getText().toString())));
            liderazgoTextView.setText(String.valueOf(Integer.parseInt(liderazgoTextView.getText().toString()) - 1));
        }
    }

    private void modificarHistoria(int id, TextView historiaTextView) {
        if (id == R.id.suma_historia && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(historiaTextView.getText().toString()) + 1))) {
            historiaTextView.setText(String.valueOf(Integer.parseInt(historiaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(historiaTextView.getText().toString())));
        }

        if (id == R.id.resta_historia && Integer.parseInt(historiaTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(historiaTextView.getText().toString())));
            historiaTextView.setText(String.valueOf(Integer.parseInt(historiaTextView.getText().toString()) - 1));
        }
    }

    private void modificarTradicion(int id, TextView tradicionTextView) {
        if (id == R.id.suma_tradicion && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(tradicionTextView.getText().toString()) + 1))) {
            tradicionTextView.setText(String.valueOf(Integer.parseInt(tradicionTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(tradicionTextView.getText().toString())));
        }

        if (id == R.id.resta_tradicion && Integer.parseInt(tradicionTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(tradicionTextView.getText().toString())));
            tradicionTextView.setText(String.valueOf(Integer.parseInt(tradicionTextView.getText().toString()) - 1));
        }
    }

    private void modificarCazar(int id, TextView cazarTextView) {
        if (id == R.id.suma_cazar && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= (Integer.parseInt(cazarTextView.getText().toString()) + 1))) {
            cazarTextView.setText(String.valueOf(Integer.parseInt(cazarTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - Integer.parseInt(cazarTextView.getText().toString())));
        }

        if (id == R.id.resta_cazar && Integer.parseInt(cazarTextView.getText().toString()) > 0) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + Integer.parseInt(cazarTextView.getText().toString())));
            cazarTextView.setText(String.valueOf(Integer.parseInt(cazarTextView.getText().toString()) - 1));
        }
    }

    private void modificarBerserker(int id, TextView berserkerTextView) {
        if (id == R.id.suma_berserker && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= 7)) {
            berserkerTextView.setText(String.valueOf(Integer.parseInt(berserkerTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - 7));
        }

        if (id == R.id.resta_berserker && Integer.parseInt(berserkerTextView.getText().toString()) > 1) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + 7));
            berserkerTextView.setText(String.valueOf(Integer.parseInt(berserkerTextView.getText().toString()) - 1));
        }
    }

    private void modificarTrance(int id, TextView tranceTextView) {
        if (id == R.id.suma_trance && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(tranceTextView.getText().toString()) + 1) * 2))) {
            tranceTextView.setText(String.valueOf(Integer.parseInt(tranceTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(tranceTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_trance && Integer.parseInt(tranceTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(tranceTextView.getText().toString()) * 2)));
            tranceTextView.setText(String.valueOf(Integer.parseInt(tranceTextView.getText().toString()) - 1));
        }
    }

    private void modificarConciencia(int id, TextView concienciaTextView) {
        if (id == R.id.suma_conciencia && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(concienciaTextView.getText().toString()) + 1) * 2))) {
            concienciaTextView.setText(String.valueOf(Integer.parseInt(concienciaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(concienciaTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_conciencia && Integer.parseInt(concienciaTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(concienciaTextView.getText().toString()) * 2)));
            concienciaTextView.setText(String.valueOf(Integer.parseInt(concienciaTextView.getText().toString()) - 1));
        }
    }

    private void modificarVoluntad(int id, TextView voluntadTextView) {
        if (id == R.id.suma_voluntad && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(voluntadTextView.getText().toString()) + 1) * 2))) {
            voluntadTextView.setText(String.valueOf(Integer.parseInt(voluntadTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(voluntadTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_voluntad && Integer.parseInt(voluntadTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(voluntadTextView.getText().toString()) * 2)));
            voluntadTextView.setText(String.valueOf(Integer.parseInt(voluntadTextView.getText().toString()) - 1));
        }
    }

    private void modificarPercepcion(int id, TextView percepcionTextView) {
        if (id == R.id.suma_percepcion && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(percepcionTextView.getText().toString()) + 1) * 2))) {
            percepcionTextView.setText(String.valueOf(Integer.parseInt(percepcionTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(percepcionTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_percepcion && Integer.parseInt(percepcionTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(percepcionTextView.getText().toString()) * 2)));
            percepcionTextView.setText(String.valueOf(Integer.parseInt(percepcionTextView.getText().toString()) - 1));
        }
    }

    private void modificarInteligencia(int id, TextView inteligenciaTextView) {
        if (id == R.id.suma_inteligencia && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(inteligenciaTextView.getText().toString()) + 1) * 2))) {
            inteligenciaTextView.setText(String.valueOf(Integer.parseInt(inteligenciaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(inteligenciaTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_inteligencia && Integer.parseInt(inteligenciaTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(inteligenciaTextView.getText().toString()) * 2)));
            inteligenciaTextView.setText(String.valueOf(Integer.parseInt(inteligenciaTextView.getText().toString()) - 1));
        }
    }

    private void modificarFuerza(int id, TextView fuerzaTextView) {
        if (id == R.id.suma_fuerza && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(fuerzaTextView.getText().toString()) + 1) * 2))) {
            fuerzaTextView.setText(String.valueOf(Integer.parseInt(fuerzaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(fuerzaTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_fuerza && Integer.parseInt(fuerzaTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(fuerzaTextView.getText().toString()) * 2)));
            fuerzaTextView.setText(String.valueOf(Integer.parseInt(fuerzaTextView.getText().toString()) - 1));
        }
    }

    private void modificarAgilidad(int id, TextView agilidadTextView) {
        if (id == R.id.suma_agilidad && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(agilidadTextView.getText().toString()) + 1) * 2))) {
            agilidadTextView.setText(String.valueOf(Integer.parseInt(agilidadTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(agilidadTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_agilidad && Integer.parseInt(agilidadTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(agilidadTextView.getText().toString()) * 2)));
            agilidadTextView.setText(String.valueOf(Integer.parseInt(agilidadTextView.getText().toString()) - 1));
        }
    }

    private void modificarReflejos(int id, TextView reflejosTextView) {
        if (id == R.id.suma_reflejos && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(reflejosTextView.getText().toString()) + 1) * 2))) {
            reflejosTextView.setText(String.valueOf(Integer.parseInt(reflejosTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(reflejosTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_reflejos && Integer.parseInt(reflejosTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(reflejosTextView.getText().toString()) * 2)));
            reflejosTextView.setText(String.valueOf(Integer.parseInt(reflejosTextView.getText().toString()) - 1));
        }
    }

    private void modificarResistencia(int id, TextView resistenciaTextView) {
        if (id == R.id.suma_resistencia && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(resistenciaTextView.getText().toString()) + 1) * 2))) {
            resistenciaTextView.setText(String.valueOf(Integer.parseInt(resistenciaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) - (Integer.parseInt(resistenciaTextView.getText().toString()) * 2)));
        }

        if (id == R.id.resta_resistencia && Integer.parseInt(resistenciaTextView.getText().toString()) > 2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString()) + (Integer.parseInt(resistenciaTextView.getText().toString()) * 2)));
            resistenciaTextView.setText(String.valueOf(Integer.parseInt(resistenciaTextView.getText().toString()) - 1));
        }
    }


    public void PopUp(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Por favor, introduzca nombre")
                .setTitle("NOMBRE PERSONAJE VACIO")
                .setCancelable(false)
                .setNeutralButton("Volver",
                        (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }


    public void botonGuardarPersonaje(View view) {
        if (((TextView) findViewById(R.id.nombre_personaje)).getText().toString().length() == 0) {
            PopUp(view);
            return;
        }
        nuevoPersonaje.setNombrePersonaje(((TextView) findViewById(R.id.nombre_personaje)).getText().toString());
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.fuerza_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_fuerza_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.resistencia_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_resistencia_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.reflejos_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_reflejos_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.agilidad_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_agilidad_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.voluntad_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_voluntad_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.percepcion_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_percepcion_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.inteligencia_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_inteligencia_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.conciencia_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_conciencia_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.trance_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_trance_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.berserker_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_berserker_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.cazar_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_cazar_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.tradicion_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_tradicion_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.historia_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_historia_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.liderazgo_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_liderazgo_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.buscar_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_buscar_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.animales_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_animales_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.bardo_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_bardo_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.escudo_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_escudo_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.una_mano_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_una_mano_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.dos_mano_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_dos_mano_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.arma_arcana_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_arma_arcana_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.arma_especialista_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_arma_especialista_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.arma_arrojadiza_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_arma_arrojadiza_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.arco_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_arco_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.combate_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_combate_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.comercio_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_comercio_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.navegacion_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_navegacion_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.forjar_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_forjar_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.falsificar_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_falsificar_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.juego_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_juego_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.intimidar_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_intimidar_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.supervivencia_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_supervivencia_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.sigilo_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_sigilo_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.trampas_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_trampas_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.seduccion_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_seduccion_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.venenos_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_venenos_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.seguir_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_seguir_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.batalla_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_batalla_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.mentir_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_mentir_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.equitacion_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_equitacion_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.conocimiento_arcano_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_conocimiento_arcano)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.conocimiento_mundano_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_conocimiento_mundano_text_view)).getText().toString()));
        nuevoPersonaje.añadirHabilidad(((TextView) findViewById(R.id.conocimiento_especifico_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_conocimiento_especifico_text_view)).getText().toString()));
        nuevoPersonaje.setPuntosRestantes(Integer.parseInt(((TextView) findViewById(R.id.puntos_disponibles)).getText().toString()));
        PersonajeUtilidadesGuardado.guardarPersonaje(nuevoPersonaje, this);

        startActivity(new Intent(this, MainActivity.class));
    }
}
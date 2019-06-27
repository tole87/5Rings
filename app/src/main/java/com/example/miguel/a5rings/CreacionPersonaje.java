package com.example.miguel.a5rings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Map;

public class CreacionPersonaje extends AppCompatActivity {

    TextView puntosDisponiblesTextView;
    Personaje nuevoPersonaje;
    Map<String, Integer> atributosPersonaje;

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
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.cazar_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_cazar_text_view)).getText().toString()));
        nuevoPersonaje.añadirAtributo(((TextView) findViewById(R.id.tradicion_text_view)).getText().toString(), Integer.parseInt(((TextView) findViewById(R.id.contador_tradicion_text_view)).getText().toString()));
        PersonajeUtilidadesGuardado.guardarPersonaje(nuevoPersonaje, this);

        startActivity(new Intent(this, MainActivity.class));
    }
}
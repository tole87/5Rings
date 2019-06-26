package com.example.miguel.a5rings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CreacionPersonaje extends AppCompatActivity {

    TextView puntosDisponiblesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_personaje);

        puntosDisponiblesTextView = findViewById(R.id.puntos_disponibles);

        findViewById(R.id.suma_fuerza).setOnClickListener(v -> modificarFuerza(R.id.suma_fuerza, findViewById(R.id.fuerza_text_view)));
        findViewById(R.id.resta_fuerza).setOnClickListener(v -> modificarFuerza(R.id.resta_fuerza, findViewById(R.id.fuerza_text_view)));
        findViewById(R.id.suma_agilidad).setOnClickListener(v -> modificarAgilidad(R.id.suma_agilidad, findViewById(R.id.agilidad_text_view)));
        findViewById(R.id.resta_agilidad).setOnClickListener(v -> modificarAgilidad(R.id.resta_agilidad, findViewById(R.id.agilidad_text_view)));
        findViewById(R.id.suma_reflejos).setOnClickListener(v -> modificarReflejos(R.id.suma_reflejos, findViewById(R.id.reflejos_text_view)));
        findViewById(R.id.resta_reflejos).setOnClickListener(v -> modificarReflejos(R.id.resta_reflejos, findViewById(R.id.reflejos_text_view)));
        findViewById(R.id.suma_resistencia).setOnClickListener(v -> modificarResistencia(R.id.suma_resistencia, findViewById(R.id.resistencia_text_view)));
        findViewById(R.id.resta_resistencia).setOnClickListener(v -> modificarResistencia(R.id.resta_resistencia, findViewById(R.id.resistencia_text_view)));

    }

    private void modificarFuerza(int id, TextView fuerzaTextView) {
        if (id == R.id.suma_fuerza && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(fuerzaTextView.getText().toString())+1)*2))) {
            fuerzaTextView.setText(String.valueOf(Integer.parseInt(fuerzaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())-(Integer.parseInt(fuerzaTextView.getText().toString())*2)));
        }

        if (id == R.id.resta_fuerza && Integer.parseInt(fuerzaTextView.getText().toString())>2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())+(Integer.parseInt(fuerzaTextView.getText().toString())*2)));
            fuerzaTextView.setText(String.valueOf(Integer.parseInt(fuerzaTextView.getText().toString()) - 1));
        }
    }
    private void modificarAgilidad(int id, TextView agilidadTextView) {
        if (id == R.id.suma_agilidad && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(agilidadTextView.getText().toString())+1)*2))) {
            agilidadTextView.setText(String.valueOf(Integer.parseInt(agilidadTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())-(Integer.parseInt(agilidadTextView.getText().toString())*2)));
        }

        if (id == R.id.resta_agilidad && Integer.parseInt(agilidadTextView.getText().toString())>2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())+(Integer.parseInt(agilidadTextView.getText().toString())*2)));
            agilidadTextView.setText(String.valueOf(Integer.parseInt(agilidadTextView.getText().toString()) - 1));
        }
    }

    private void modificarReflejos(int id, TextView reflejosTextView) {
        if (id == R.id.suma_reflejos && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(reflejosTextView.getText().toString())+1)*2))) {
            reflejosTextView.setText(String.valueOf(Integer.parseInt(reflejosTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())-(Integer.parseInt(reflejosTextView.getText().toString())*2)));
        }

        if (id == R.id.resta_reflejos && Integer.parseInt(reflejosTextView.getText().toString())>2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())+(Integer.parseInt(reflejosTextView.getText().toString())*2)));
            reflejosTextView.setText(String.valueOf(Integer.parseInt(reflejosTextView.getText().toString()) - 1));
        }
    }

    private void modificarResistencia(int id, TextView resistenciaTextView) {
        if (id == R.id.suma_resistencia && (Integer.parseInt(puntosDisponiblesTextView.getText().toString()) >= ((Integer.parseInt(resistenciaTextView.getText().toString())+1)*2))) {
            resistenciaTextView.setText(String.valueOf(Integer.parseInt(resistenciaTextView.getText().toString()) + 1));
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())-(Integer.parseInt(resistenciaTextView.getText().toString())*2)));
        }

        if (id == R.id.resta_resistencia && Integer.parseInt(resistenciaTextView.getText().toString())>2) {
            puntosDisponiblesTextView.setText(String.valueOf(Integer.parseInt(puntosDisponiblesTextView.getText().toString())+(Integer.parseInt(resistenciaTextView.getText().toString())*2)));
            resistenciaTextView.setText(String.valueOf(Integer.parseInt(resistenciaTextView.getText().toString()) - 1));
        }
    }
}
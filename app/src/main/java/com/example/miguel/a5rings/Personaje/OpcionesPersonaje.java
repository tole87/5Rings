package com.example.miguel.a5rings.Personaje;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.miguel.a5rings.R;

public class OpcionesPersonaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_personaje);
    }

    public void abrirCreacionPersonaje(View view) {
        Intent i = new Intent(this, CreacionPersonaje.class);
        startActivity(i);

    }

    public void abrirListaPersonaje(View view) {
        Intent i = new Intent(this, ListaPersonajesCreados.class);
        startActivity(i);

    }
}

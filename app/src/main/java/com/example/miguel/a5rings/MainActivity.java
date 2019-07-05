package com.example.miguel.a5rings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.miguel.a5rings.Personaje.OpcionesPersonaje;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void abrirOpcionesPersonaje(View view) {
        Intent i = new Intent(this, OpcionesPersonaje.class);
        startActivity(i);


    }
}

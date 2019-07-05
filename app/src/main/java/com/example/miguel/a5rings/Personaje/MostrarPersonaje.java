package com.example.miguel.a5rings.Personaje;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.miguel.a5rings.R;
import com.example.miguel.a5rings.ViewAdapters.MostrarTodasHabilidades;

import static com.example.miguel.a5rings.Personaje.PersonajeUtilidadesGuardado.leerArchivo;

public class MostrarPersonaje extends AppCompatActivity {

    Personaje personajeMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_personaje);

        leerArchivo(this);

        personajeMostrar = PersonajeUtilidadesGuardado.obtenerPersonajesPorNombre((String) getIntent().getExtras().get("personaje"));


        ((EditText) findViewById(R.id.nombre_personaje)).setText(personajeMostrar.getNombrePersonaje());
        ((TextView) findViewById(R.id.puntos_disponibles)).setText(String.valueOf(personajeMostrar.getPuntosRestantes()));
        ((TextView) findViewById(R.id.contador_fuerza_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Fuerza")));
        ((TextView) findViewById(R.id.contador_resistencia_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Resistencia")));
        ((TextView) findViewById(R.id.contador_reflejos_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Reflejos")));
        ((TextView) findViewById(R.id.contador_agilidad_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Agilidad")));
        ((TextView) findViewById(R.id.contador_voluntad_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Voluntad")));
        ((TextView) findViewById(R.id.contador_percepcion_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Percepción")));
        ((TextView) findViewById(R.id.contador_inteligencia_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Inteligencia")));
        ((TextView) findViewById(R.id.contador_conciencia_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Conciencia")));
        ((TextView) findViewById(R.id.contador_conciencia_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Conciencia")));
        ((TextView) findViewById(R.id.contador_trance_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Puntos De Trance")));
        ((TextView) findViewById(R.id.contador_berserker_text_view)).setText(String.valueOf(personajeMostrar.obtenerValorAtributo("Berserker")));

        MostrarTodasHabilidades itemsAdapter = new MostrarTodasHabilidades( personajeMostrar.getHabilidad());
        ListView listView = findViewById(R.id.lista_habilidades_personaje);

        listView.setAdapter(itemsAdapter);

        MostrarTodasHabilidades.setListViewHeightBasedOnChildren(listView);

    }


}

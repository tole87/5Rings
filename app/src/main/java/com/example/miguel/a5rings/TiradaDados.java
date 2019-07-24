package com.example.miguel.a5rings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.miguel.a5rings.Enums.Habilidad;

import java.util.ArrayList;

public class TiradaDados extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirada_dados);
        TextView texto = findViewById(R.id.seleccionBox);

        for (Habilidad habilidad : Habilidad.values()) {
            list.add(habilidad.getNombreHabilidad());
        }

        Spinner mySpinner = findViewById(R.id.accion_tirada);
        ArrayAdapter<String> accionAdapter = new ArrayAdapter<>(TiradaDados.this, android.R.layout.simple_list_item_1, list);
        accionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(accionAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {

                texto.setText(mySpinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }
        });

    }

}

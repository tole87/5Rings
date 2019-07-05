package com.example.miguel.a5rings.Personaje;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.miguel.a5rings.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.miguel.a5rings.Personaje.PersonajeUtilidadesGuardado.borrarPersonaje;
import static com.example.miguel.a5rings.Personaje.PersonajeUtilidadesGuardado.leerArchivo;
import static com.example.miguel.a5rings.Personaje.PersonajeUtilidadesGuardado.obtenerPersonajesLista;

public class ListaPersonajesCreados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personajes_creados);

        leerArchivo(this);
        MostrarPersonajesCreadosAdapter itemsAdapter = new MostrarPersonajesCreadosAdapter(this, new ArrayList<>(obtenerPersonajesLista().values()));
        ListView listView = findViewById(R.id.lista_personajes_creados);

        listView.setAdapter(itemsAdapter);

        setListViewHeightBasedOnChildren(listView);
    }


public class MostrarPersonajesCreadosAdapter extends ArrayAdapter<Personaje> {

    private class ViewHolder {
        TextView nombrePersonaje;
    }

    public MostrarPersonajesCreadosAdapter(Context context, List<Personaje> personajes) {
        super(context, 0, personajes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_personajes_creados, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.nombrePersonaje = convertView.findViewById(R.id.nombre_personaje_existente);
            convertView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) convertView.getTag();

        Personaje personaje = this.getItem(position);

        viewHolder.nombrePersonaje.setText(personaje.getNombrePersonaje());

        Button menuPersonajeExistenteButton = convertView.findViewById(R.id.menu_personaje_existente);
        menuPersonajeExistenteButton.setTag(position);
        menuPersonajeExistenteButton.setOnClickListener((View v) -> {
            PopupMenu popup = new PopupMenu(ListaPersonajesCreados.this, menuPersonajeExistenteButton);
            popup.getMenuInflater().inflate(R.menu.popup_menu_creacion_personaje, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> {

                switch (item.getItemId()) {
                    case R.id.borrar_personaje_existente:
                        borrarPersonaje(personaje.getNombrePersonaje(), ListaPersonajesCreados.this);
                        finish();
                        startActivity(getIntent());
                        return true;
                    case R.id.editar_personaje:
                            Intent intent = new  Intent(getApplicationContext(),MostrarPersonaje.class);
                            intent.putExtra("personaje",personaje.getNombrePersonaje());
                            startActivity(intent);
                        return true;
                    default:

                        return false;
                }


            });

            popup.show();//showing popup menu


        });
        return convertView;

    }

}
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
}


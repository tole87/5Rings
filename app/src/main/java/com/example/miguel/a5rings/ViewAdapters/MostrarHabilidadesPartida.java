package com.example.miguel.a5rings.ViewAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.miguel.a5rings.R;

import java.util.ArrayList;
import java.util.Map;

public class MostrarHabilidadesPartida extends BaseAdapter {
    private final ArrayList listaHabilidades;

    public MostrarHabilidadesPartida(Map<String, Integer> map) {
        listaHabilidades = new ArrayList();
        listaHabilidades.addAll(map.entrySet());
    }

    @Override
    public int getCount() {
        return listaHabilidades.size();
    }

    @Override
    public Map.Entry<String, Integer> getItem(int position) {
        return (Map.Entry) listaHabilidades.get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View result;

        if (convertView == null) {
            result = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_habilidades_personaje, parent, false);
        } else {
            result = convertView;
        }

        Map.Entry<String, Integer> item = getItem(position);

             ((TextView) result.findViewById(R.id.habilidades_text_view)).setText(item.getKey());
             ((TextView) result.findViewById(R.id.contador_habilidad_text_view)).setText(String.valueOf(item.getValue()));


        Button botonSumarJugador = result.findViewById(R.id.suma_habilidad);
        Button botonRestarJugador = result.findViewById(R.id.resta_habilidad);

        botonSumarJugador.setTag(position);
        botonRestarJugador.setTag(position);



        return result;
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



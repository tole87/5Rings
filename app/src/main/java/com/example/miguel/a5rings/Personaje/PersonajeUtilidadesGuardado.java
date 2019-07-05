package com.example.miguel.a5rings.Personaje;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class PersonajeUtilidadesGuardado {

    private static LinkedHashMap<String, Personaje> personajes = new LinkedHashMap<>();
    public static final String PERSONAJES_CREADOS_JSON = "PersonajesCreados.json";
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();

    public static void leerArchivo(Context context) {

        if (!new File(context.getFilesDir() + "/" + PERSONAJES_CREADOS_JSON).exists()) {
            return ;
        }
        try (FileInputStream inputStream = context.openFileInput(PERSONAJES_CREADOS_JSON)) {
            int size = inputStream.available();
            byte[] buffer = new byte[size];

            inputStream.read(buffer);
            String mResponse = new String(buffer);
            personajes = gson.fromJson(mResponse, new TypeToken<LinkedHashMap<String, Personaje>>() {
            }.getType());
        } catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: ", e);
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: ", e);
        }


    }

    public static void guardarPersonaje(Personaje personaje, Context context) {

        leerArchivo(context);
        personajes.put(personaje.getNombrePersonaje(), personaje);
        escribirPersonajes(context);
    }

    public static void borrarPersonaje(String nombrePersonaje, Context context) {
        leerArchivo(context);
        personajes.remove(nombrePersonaje);
        escribirPersonajes(context);
    }

    private static void escribirPersonajes(Context context) {
        try (FileOutputStream fos = context.openFileOutput("PersonajesCreados.json", Context.MODE_PRIVATE)) {
            fos.write(gson.toJson(personajes).getBytes());
        } catch (IOException e) {
            Log.e("Exception", "File write failed: ", e);
        }
    }

    public static Personaje obtenerPersonajesPorNombre(String nombreAlineacion){
        return personajes.get(nombreAlineacion);
    }
    public static LinkedHashMap<String, Personaje> obtenerPersonajesLista(){
        return personajes;
    }
}

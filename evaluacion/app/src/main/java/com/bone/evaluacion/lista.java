package com.bone.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class lista extends AppCompatActivity {

    private AdaptadorEstudiante adaptadorEstudiante;
    public static ArrayList<Estudiante> estudianteArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


       estudianteArrayList = new ArrayList<>();
        // inicializador del adaptador

        adaptadorEstudiante = new AdaptadorEstudiante(this, estudianteArrayList);
        ListView listView = (ListView) findViewById(R.id.lsta);

        // setear el adaptador el listview
        listView.setAdapter(adaptadorEstudiante);
//MainActivity.listaEst=null;


       Cargar();

    }


    public void Cargar(){
        String nombre= getIntent().getStringExtra("Nombre");
        String codigo= getIntent().getStringExtra("Codigo");
        String materia=getIntent().getStringExtra("Materia");
        Double p1= Double.parseDouble(getIntent().getStringExtra("Parcial1"));
        Double p2= Double.parseDouble(getIntent().getStringExtra("Parcial2"));
        Double p3= Double.parseDouble(getIntent().getStringExtra("Parcial3"));

         Estudiante c = new Estudiante(
                 nombre,
                 codigo,
                 materia,
                 p1,
                 p2,
                 p3
         );


        estudianteArrayList.add(c);
       adaptadorEstudiante.notifyDataSetChanged();

    }

}



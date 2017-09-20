package com.bone.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 private String contexto1;
    private String contexto2;
    private String contexto3;
    private EditText prueba;
  private Button btnnuevo, btnlista;
   // public static ArrayList<Estudiante> listaEst = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnuevo = (Button) findViewById(R.id.btnnuevo);
        contexto1 = getIntent().getStringExtra("Nombre");
        contexto2 = contexto1;
        btnlista = (Button) findViewById(R.id.btnlista);
        //listaEst = new ArrayList<>();
        Toast notificacion = Toast.makeText(this, contexto1, Toast.LENGTH_LONG);
        notificacion.show();

        btnnuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityEstudiante.class);
                // startActivityForResult(intent,GUARDADO);
                startActivity(intent);
            }
        });

        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lista.class);
                //intent= putExtraData("nombre");
                startActivity(intent);
            }
        });

    }
   @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==23 || resultCode==RESULT_OK){
            Estudiante estudiante = (Estudiante) data.getSerializableExtra("Est");
            lista.estudianteArrayList.add(estudiante);
            btnlista.setText("LISTA ESTUDIANTE");
        }
    }


}

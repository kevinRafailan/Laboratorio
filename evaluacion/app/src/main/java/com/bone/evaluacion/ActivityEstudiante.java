package com.bone.evaluacion;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class ActivityEstudiante extends AppCompatActivity {

    private EditText nombre,codigo,materia,p1,p2,p3;
    private Button btnguardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);
        nombre= (EditText) findViewById(R.id.txtnombre);
        codigo=(EditText) findViewById(R.id.txtcodigo);
        materia=(EditText) findViewById(R.id.txtmateria);
        p1=(EditText) findViewById(R.id.txtparcial1);
        p2=(EditText) findViewById(R.id.txtparcial2);
        p3= (EditText) findViewById(R.id.txtparcial3);
        btnguardar=(Button) findViewById(R.id.btnguardar);



  btnguardar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

          Intent intent = new Intent();
        intent.putExtra("Nombre",nombre.getText().toString());
          intent.putExtra("Codigo",codigo.getText().toString());
          intent.putExtra("Materia",materia.getText().toString());
          intent.putExtra("Parcial1",p1.getText().toString());
          intent.putExtra("Parcial2",p2.getText().toString());
          intent.putExtra("Parcial3",p3.getText().toString());
          startActivity(intent);

      }

  });
//finish();
    }
}

package com.bone.evaluacion;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by devin on 17/09/2017.
 */

public class AdaptadorEstudiante extends ArrayAdapter<Estudiante> {

    public AdaptadorEstudiante(@NonNull Context context, @NonNull List<Estudiante> objects) {
        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
       //obteniendo el dato
        Estudiante estudiante = getItem(position);
        // Toda inicializacion del layout correspodiente al item(Estudiante)
      if(convertView== null){
         convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante,parent,false);

      }
      //inicializamos los botones
        TextView lblNombre=(TextView) convertView.findViewById(R.id.lblNombre);
        TextView lblCodigo=(TextView) convertView.findViewById(R.id.lblcodigo);
        TextView lblMateria= (TextView) convertView.findViewById(R.id.lblmateria);
    lblNombre.setText(estudiante.nombre);
     lblCodigo.setText(estudiante.codigo);
     lblMateria.setText(estudiante.materia + estudiante.Promedio().toString());
         return convertView;
    }


}

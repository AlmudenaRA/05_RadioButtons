package com.example.a05_radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroupAv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupAv = (RadioGroup) findViewById(R.id.radioGroupAverias);
    }

    public void tipoAveriaClicked(View view) {
        //Como todos los checkBox apuntan al mismo método hay que diferenciarlos aquí

        String tipo = "";

        //Sobre qué checkbos se ha hecho click
        switch (view.getId()){
            case R.id.checkBoxChapa:
                tipo = "Chapa y pintura";
                break;
            case R.id.checkBoxCristal:
                tipo = "Cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo = "Avería mecánica";
                break;

        }

        Toast toast1 = Toast.makeText(this, tipo, Toast.LENGTH_SHORT);
        toast1.show();
    }

    //Método para mostrar un mensaje cuando se seleccione alguno de los RadioButtons
    public void conocerOpcionMarcada(View view) {
        int idSeleccionado = radioGroupAv.getCheckedRadioButtonId();
        String tipo = "";

        if(idSeleccionado==R.id.checkBoxChapa){
            tipo = "Has seleccionado Chapa y pintura";
        }else if(idSeleccionado==R.id.checkBoxCristal){
            tipo = "Has seleccionado rotura de cristal";
        }else{
            tipo = "Has seleccionado Avería mecanicca";
        }

        Toast toas1 = Toast.makeText(this, tipo, Toast.LENGTH_SHORT);
        toas1.show();
    }
}

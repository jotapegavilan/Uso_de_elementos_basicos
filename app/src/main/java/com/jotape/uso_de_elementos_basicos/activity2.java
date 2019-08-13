package com.jotape.uso_de_elementos_basicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class activity2 extends AppCompatActivity {

    private RadioGroup rg;
    private RadioButton rbM;
    private RadioButton rbF;
    private Switch swSoltero;
    private Spinner sPais;
    private Button btnGuardar;
    private String genero;
    private  boolean soltero;
    private String pais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        rg = (RadioGroup) findViewById(R.id.Grupo);
        rbM = (RadioButton) findViewById(R.id.rbM);
        rbF = (RadioButton) findViewById(R.id.rbF);
        swSoltero = (Switch) findViewById(R.id.swSoltero);
        sPais = (Spinner) findViewById(R.id.sPais);
        btnGuardar = (Button) findViewById(R.id.btnRegistrar);


        cargarSpinner();
        rbF.setChecked(true);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbM.isChecked()){
                    genero = rbM.getText().toString();
                }else if(rbF.isChecked()){
                    genero = rbF.getText().toString();
                }else{
                    Toast.makeText(activity2.this,"Seleccione un género por favor", Toast.LENGTH_LONG).show();
                    return;
                }
                soltero = swSoltero.isChecked();
                pais = sPais.getSelectedItem().toString();
                String texto = "Género : "+genero+"\nPaís : "+pais;
                if(soltero){
                    texto+="\nEs soltero";
                }else{
                    texto+="\nEs casado";
                }
                Toast.makeText(activity2.this,texto,Toast.LENGTH_LONG).show();
            }
        });
    }

    void cargarSpinner(){
        List<String> Paises = new ArrayList<>();
        Paises.add("Argentina");
        Paises.add("Bolivia");
        Paises.add("Chile");
        Paises.add("Paraguay");
        Paises.add("Perú");

        ArrayAdapter<String> PaisesAdapter = new ArrayAdapter<>(activity2.this,android.R.layout.simple_dropdown_item_1line,Paises);
        sPais.setAdapter(PaisesAdapter);
    }


}

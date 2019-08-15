package com.jotape.uso_de_elementos_basicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private EditText txtNombre;
    private EditText txtEdad;
    private EditText txtCorreo;
    private EditText txtComentario;
    private Button btnSiguiente;
    private String nombre, correo, comentario;
    private int edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtNombre = findViewById(R.id.txtNombre);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtComentario = findViewById(R.id.txtComentario);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nombre = txtNombre.getText().toString();
                correo = txtCorreo.getText().toString();
                comentario = txtComentario.getText().toString();
                edad = Integer.parseInt(txtEdad.getText().toString());
                String texto = "Nombre : "+nombre+"\nCorreo electrónico : "+correo+"\nEdad : "+edad+" años\nComentario : "+comentario;
                FancyToast.makeText(MainActivity.this,texto,FancyToast.LENGTH_LONG,FancyToast.SUCCESS,R.drawable.corazon,false).show();
                Intent intent = new Intent(MainActivity.this,activity2.class);
                //startActivity(intent);
            }
        });
    }
}

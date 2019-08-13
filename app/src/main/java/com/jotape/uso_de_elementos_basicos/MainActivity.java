package com.jotape.uso_de_elementos_basicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtComentario);
        txtComentario = (EditText) findViewById(R.id.txtComentario);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nombre = txtNombre.getText().toString();
                correo = txtCorreo.getText().toString();
                comentario = txtComentario.getText().toString();
                edad = Integer.parseInt(txtEdad.getText().toString());
                String texto = "Nombre : "+nombre+"\nCorreo electrónico : "+correo+"\nEdad : "+edad+" años\nComentario : "+comentario;
                Toast.makeText(MainActivity.this, texto,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,activity2.class);
                startActivity(intent);
            }
        });
    }
}

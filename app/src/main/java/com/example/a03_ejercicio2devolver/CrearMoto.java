package com.example.a03_ejercicio2devolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a03_ejercicio2devolver.modelos.Coche;
import com.example.a03_ejercicio2devolver.modelos.Moto;

public class CrearMoto extends AppCompatActivity {

    // ATRIBUTOS DE LAS VISTAS
    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtCilindrada;
    private Button btnCrearMoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_moto);

        inicializaVistas();

        btnCrearMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear coche
                Moto moto = new Moto(txtMarca.getText().toString(), txtModelo.getText().toString(), Integer.parseInt(txtCilindrada.getText().toString()));

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("MOTO", moto);
                intent.putExtras(bundle);
                // Devolver
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private void inicializaVistas() {
        txtMarca = findViewById(R.id.txtMarcaCrearMoto);
        txtModelo = findViewById(R.id.txtModeloCrearMoto);
        txtCilindrada = findViewById(R.id.txtCilindradaCrearMoto);
        btnCrearMoto = findViewById(R.id.btnCrearCrearMoto);
    }
}
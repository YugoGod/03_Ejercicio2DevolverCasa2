package com.example.a03_ejercicio2devolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a03_ejercicio2devolver.modelos.Coche;

public class CrearCoche extends AppCompatActivity {

    // ATRIBUTOS DE LAS VISTAS
    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtColor;
    private Button btnCrearCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_coche);

        inicializaVistas();

        btnCrearCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear coche
                Coche coche = new Coche(
                        txtMarca.getText().toString(),
                        txtModelo.getText().toString(),
                        txtColor.getText().toString()
                );

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("COCHE", coche);
                intent.putExtras(bundle);
                // Devolver
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private void inicializaVistas() {
        txtMarca = findViewById(R.id.txtMarcaCrearCoche);
        txtModelo = findViewById(R.id.txtModeloCrearCoche);
        txtColor = findViewById(R.id.txtColorCrearCoche);
        btnCrearCoche = findViewById(R.id.btnCrearCrearCoche);
    }
}
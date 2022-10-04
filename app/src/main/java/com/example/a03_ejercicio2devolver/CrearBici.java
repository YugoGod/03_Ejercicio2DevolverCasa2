package com.example.a03_ejercicio2devolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a03_ejercicio2devolver.modelos.Bici;
import com.example.a03_ejercicio2devolver.modelos.Coche;

public class CrearBici extends AppCompatActivity {

    // ATRIBUTOS DE LAS VISTAS
    private EditText txtMarca;
    private EditText txtPulgadas;
    private Button btnCrearCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_bici);

        inicializaVistas();

        btnCrearCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear coche
                Bici bici = new Bici(txtMarca.getText().toString(), Float.parseFloat(txtPulgadas.getText().toString()));

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("BICI", bici);
                intent.putExtras(bundle);
                // Devolver
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private void inicializaVistas() {
        txtMarca = findViewById(R.id.txtMarcaCrearBici);
        txtPulgadas = findViewById(R.id.txtPulgadasCrearBicis);
        btnCrearCoche = findViewById(R.id.btnCrearCrearBici);
    }
}
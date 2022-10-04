package com.example.a03_ejercicio2devolver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a03_ejercicio2devolver.modelos.Bici;
import com.example.a03_ejercicio2devolver.modelos.Coche;
import com.example.a03_ejercicio2devolver.modelos.Moto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Atributos para Vistas
    private TextView lblCoche;
    private TextView lblMoto;
    private TextView lblBici;
    private Button btnCoche;
    private Button btnMoto;
    private Button btnBici;

    // Atributos para Lógica
    private ArrayList<Coche> coches;
    private ArrayList<Moto> motos;
    private ArrayList<Bici> bicis;

    // ActivityResultLaunchers
    private ActivityResultLauncher<Intent> launcherCrearCoches;
    private ActivityResultLauncher<Intent> launcherCrearMotos;
    private ActivityResultLauncher<Intent> launcherCrearBicis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visualizaVistas();
        iniciarLaunchers();

        btnCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CrearCoche.class);
                launcherCrearCoches.launch(intent);
            }
        });

        btnMoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CrearMoto.class);
                launcherCrearMotos.launch(intent);
            }
        });

        btnBici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CrearBici.class);
                launcherCrearBicis.launch(intent);
            }
        });
    }

    private void iniciarLaunchers() {
        // RegisterForActivityResult
        // 1. Modo en que se lanza el Intent
        // 2. Acciones a realizar DESPUÉS de que se cierre el Intent.
        launcherCrearCoches = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK){
                    if (result.getData() != null && result.getData().getExtras() != null){
                        Bundle bundle = result.getData().getExtras();
                        Coche coche = (Coche) bundle.getSerializable("COCHE");
                        if (coche != null){
                            coches.add(coche);

                            // LÓGICA para trabajar con la dirección
                            lblCoche.setText("Coches: " + coches.size() + ".");
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "Nó están los datos", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Acción cancelada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        launcherCrearBicis = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK){
                    if (result.getData() != null && result.getData().getExtras() != null){
                        Bundle bundle = result.getData().getExtras();
                        Bici bici = (Bici) bundle.getSerializable("BICI");
                        if (bici != null){
                            bicis.add(bici);

                            // LÓGICA para trabajar con la dirección
                            lblBici.setText("Bicis: " + bicis.size() + ".");
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "Nó están los datos", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Acción cancelada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        launcherCrearMotos = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK){
                    if (result.getData() != null && result.getData().getExtras() != null){
                        Bundle bundle = result.getData().getExtras();
                        Moto moto = (Moto) bundle.getSerializable("MOTO");
                        if (moto != null){
                            motos.add(moto);

                            // LÓGICA para trabajar con la dirección
                            lblMoto.setText("Motos: " + motos.size() + ".");
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "Nó están los datos", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Acción cancelada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void visualizaVistas() {
        lblCoche = findViewById(R.id.lblCochesMain);
        lblMoto = findViewById(R.id.lblMotoMain);
        lblBici = findViewById(R.id.lblBiciMain);
        btnCoche = findViewById(R.id.btnCocheMain);
        btnMoto = findViewById(R.id.btnMotoMain);
        btnBici = findViewById(R.id.btnBiciMain);

        coches = new ArrayList<>();
        motos = new ArrayList<>();
        bicis = new ArrayList<>();
    }
}
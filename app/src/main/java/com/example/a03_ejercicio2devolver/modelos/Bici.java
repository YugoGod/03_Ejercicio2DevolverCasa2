package com.example.a03_ejercicio2devolver.modelos;

import java.io.Serializable;

public class Bici implements Serializable {
    // ATRIBUTOS
    private String marca;
    private float pulgadas;

    // CONSTRUCTORES

    public Bici(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    // GETTERS AND SETTERS
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    // MÉTODOS GENÉRICOS Y PROPIOS

}

package com.example.a03_ejercicio2devolver.modelos;

import java.io.Serializable;

public class Moto implements Serializable {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int cilindrada;

    // CONSTRUCTORES
    public Moto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
    // GETTERS AND SETTERS

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // MÉTODOS GENÉRICOS Y PROPIOS
}

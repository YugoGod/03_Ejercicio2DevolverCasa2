package com.example.a03_ejercicio2devolver.modelos;

import java.io.Serializable;

public class Coche implements Serializable {

    // ATRIBUTOS
    private String marca;
    private String modelo;
    private String color;

    // CONSTRUCTORES
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
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

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // MÉTODOS GENÉRICOS Y PROPIOS


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

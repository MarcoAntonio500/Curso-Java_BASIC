package com.marco.cursojava.aula46.labs;

public class Circulo extends Figura2D {
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (raio * raio) * Math.PI;
    }
    
    
}

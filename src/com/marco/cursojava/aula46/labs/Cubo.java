package com.marco.cursojava.aula46.labs;

public class Cubo extends Figura3D {
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return 6 * (lado*lado);
    }

    public double calcularVolume() {
        return lado * lado * lado;
    }
    
    
}

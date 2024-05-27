package com.marco.cursojava.aula46.labs;

import com.marco.cursojava.aula46.labs.Figura2D;


public class Quadrado extends Figura2D {
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
    
    
}

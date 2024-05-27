package com.marco.cursojava.aula46.labs;

import com.marco.cursojava.aula46.labs.Figura2D;

public class Triangulo extends Figura2D {
    
    private double base;
    private double altura;

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return ((altura * base)/2);
    }
    
    
}

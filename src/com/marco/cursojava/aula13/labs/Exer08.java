package com.marco.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor ganho por hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com a quantidade de horas trabalhadas no mês:");
        double horas = scan.nextDouble();
        
        double salario = valorHora * horas;
        
        System.out.println("O salário é de: " + salario);
    }
}

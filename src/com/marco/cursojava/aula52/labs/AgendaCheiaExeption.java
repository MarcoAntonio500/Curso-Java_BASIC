package com.marco.cursojava.aula52.labs;

public class AgendaCheiaExeption extends Exception {

    public String getMessage() {
       return "Agenda já está cheia";
    }
 
}

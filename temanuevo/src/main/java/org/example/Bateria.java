package org.example;

import java.util.Scanner;

public class Bateria {
    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = entrada.next();

        System.out.println("Frase original " + frase);

        int longitud = frase.length();
        System.out.println("El tamaño de la frase es " + longitud);
    }
}

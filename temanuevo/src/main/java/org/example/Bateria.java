package org.example;

import java.util.Scanner;

public class Bateria {
    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = entrada.nextLine();

        System.out.println("Frase original " + frase);

        int longitud = frase.length();
        System.out.println("El tamaño de la frase es " + longitud);

        String reemplazar_espacios = frase.replace(" ","");
        System.out.println("La frase sin espacios es " + reemplazar_espacios);

        int mitad = longitud / 2;
        String mitad1 = frase.substring(0, mitad);
        String mitad2 = frase.substring(mitad);
        System.out.println("Primera mitad del texto es ´" + mitad1 + "´ y la segunda mitad del texto es ´" + mitad2 + "´");

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayusculas es " + mayusculas);
    }

    public void ejercicio2(){
        
    }
}

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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String caracteres = entrada.nextLine();

        System.out.println("Dime otra frase");
        String caracteres2 = entrada.nextLine();

        int resultado1 = caracteres.length();
        int resultado2 = caracteres2.length();

        if (resultado1 > resultado2){
            System.out.println("La frase mas grande es: " + caracteres);
        }else{
            System.out.println("La frase mas grande es: " + caracteres2);
        }


    }

    public void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un conjunto de numeros");
        int N = teclado.nextInt();

        System.out.println("Cuantos quieres quitar");
        int M = teclado.nextInt();

        String n_string = Integer.toString(N);

        n_string = n_string.substring(0, n_string.length()-M);
        System.out.println("El numero sin las las " + M + " ultimas es " + n_string);

    }

    public void ejercicio4(){



    }
}

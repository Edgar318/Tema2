package org.example;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public void random() {
        Random aleatorio1 = new Random();
        int numero = aleatorio1.nextInt();
        System.out.println("numero = " + numero);

        numero = aleatorio1.nextInt(899) + 100;
        System.out.println("numero = " + numero);


    }

    public void ejercicio1() {
        Random aleatorio1 = new Random();
        int dado1 = aleatorio1.nextInt(6) + 1;
        System.out.println("A salido el numero: " + dado1);

        int dado2 = aleatorio1.nextInt(6) + 1;
        System.out.println("A salido el numero: " + dado2);

    }

    public void ejercicio2() {
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contrasenya = "";
        int posicion;
        for (int i = 0; i < longitud; i++) {
            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);

        }
        System.out.println("contrasenya = " + contrasenya);

    }

    public void ejercicio3() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int max = 2;
        int min = 3;
        int cantidad;
        int numeros;
        while (min > max) {
            System.out.println("Dime el rango minimo: ");
            min = teclado.nextInt();
            System.out.println("Dime el rango maximo: ");
            max = teclado.nextInt();
            System.out.println("Dime cuantos numeros random quieres: ");
            cantidad = teclado.nextInt();
            if (min > max) {
                System.out.println("Error");
            } else {
                for (int i = 0; i < cantidad; i++) {
                    numeros = aleatorio.nextInt(max - min + 1) + min;
                    System.out.println(" " + numeros);
                }
            }


        }
    }

    public void ejercicio4(){
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = aleatorio.nextInt(3)+6;

        String contrasenya = "";
        int posicion;
        for (int i = 0; i < longitud; i++) {
            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);

        }
        System.out.println("contrasenya = " + contrasenya);

    }

}




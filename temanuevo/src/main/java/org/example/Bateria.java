package org.example;

import java.util.Scanner;

public class Bateria {
    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = entrada.nextLine();

        System.out.println("Frase original " + frase);

        int longitud = frase.length();
        System.out.println("El tamaño de la frase es " + longitud);

        String reemplazar_espacios = frase.replace(" ", "");
        System.out.println("La frase sin espacios es " + reemplazar_espacios);

        int mitad = longitud / 2;
        String mitad1 = frase.substring(0, mitad);
        String mitad2 = frase.substring(mitad);
        System.out.println("Primera mitad del texto es ´" + mitad1 + "´ y la segunda mitad del texto es ´" + mitad2 + "´");

        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en mayusculas es " + mayusculas);
    }

    public void ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String caracteres = entrada.nextLine();

        System.out.println("Dime otra frase");
        String caracteres2 = entrada.nextLine();

        int resultado1 = caracteres.length();
        int resultado2 = caracteres2.length();

        if (resultado1 > resultado2) {
            System.out.println("La frase mas grande es: " + caracteres);
        } else {
            System.out.println("La frase mas grande es: " + caracteres2);
        }


    }

    public void ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un conjunto de numeros");
        int N = teclado.nextInt();

        System.out.println("Cuantos quieres quitar");
        int M = teclado.nextInt();

        String n_string = Integer.toString(N);

        n_string = n_string.substring(0, n_string.length() - M);
        System.out.println("El numero sin las las " + M + " ultimas es " + n_string);

    }

    public void ejercicio4() {


    }

    public void excepcion() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("dividendo: ");
        int dividendo = 0;

        if (teclado.hasNextInt()){
            dividendo = teclado.nextInt();
        }else{
            System.out.println("Has introducido un formato incorrecto no es un numero");
        }

        System.out.println("divisor: ");
        String divisor = teclado.next();
        int divisor_entero = 0;
        try{
            divisor_entero = Integer.parseInt(divisor);
        }catch(NumberFormatException e1){
            System.out.println("El divisor introducido no es un número" + e1.getMessage());
        }
        int resultado = 0;
        try{
            resultado = dividendo / divisor_entero;

        }catch (ArithmeticException e2){
            System.out.println("No se pùede dividir entre 0: " + e2.getMessage());
        }

        System.out.println("El resultado es: " +resultado );
    }

}




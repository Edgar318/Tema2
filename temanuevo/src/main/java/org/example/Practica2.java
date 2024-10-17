package org.example;

import java.util.Scanner;

public class Practica2 {
    public void calculadora() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu primer numero de la operacion: ");

        int num1 = teclado.nextInt();

        System.out.println("Dime la operacion que quieres: ");

        String operacion = teclado.next();

        String raiz = "r";

        if (operacion == raiz) {
            int resultado11 = num1 * num1;
            System.out.println("El resultado es: " + resultado11);
        } else {

            System.out.println("Dime tu segundo numero para hacer la operacion: ");
            int num2 = teclado.nextInt();

            switch (operacion) {
                case ("+"):
                    int resultado = num1 + num2;
                    System.out.println("El resultado es " + resultado);
                    break;
                case ("-"):
                    int resultado2 = num1 - num2;
                    System.out.println("El resultado es " + resultado2);
                    break;
                case ("/"):
                    int resultado3 = num1 / num2;
                    System.out.println("El resultado es " + resultado3);
                    break;
                case ("*"):
                    int resultado4 = num1 * num2;
                    System.out.println("El resultado es " + resultado4);
                    break;
                default:
                    System.out.println("Esa operacion no esta en esta calculadora");
                    break;
            }
        }
    }
}

package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {
   public void calculadora(){
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String operacion;

        boolean entrada = false;
        while (!entrada) {
            System.out.print("Introduce el primer numero: ");
            try {
                num1 = Integer.parseInt(teclado.nextLine());
                if (num1 <= 0) {
                    System.out.println("Error El número debe ser positivo y mayor a 0.");
                } else {
                    entrada = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error pon un numero valido.");
            }
        }

        System.out.print("Introduce la operacion que quieras hacer (+,-,*,/,r): ");
        operacion = teclado.nextLine();

        if (!operacion.equals("r")) {
            entrada = false;
            while (!entrada) {
                System.out.print("Introduce el segundo numero: ");
                try {
                    num2 = Integer.parseInt(teclado.nextLine());
                    if (num2 <= 0) {
                        System.out.println("Error El numero debe ser positivo y mayor a 0.");
                    } else {
                        entrada = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error pon un numero valido.");
                }
            }
        }
        switch (operacion) {
            case "+":
                int resultado1 = num1 + num2;
                System.out.println("Resultado: " + resultado1);
                break;
            case "-":
                int resultado2 = num1 - num2;
                System.out.println("Resultado: " + resultado2);
                break;
            case "*":
                int resultado3 = num1 * num2;
                System.out.println("Resultado: " + resultado3);
                break;
            case "/":
                 int resultado4 = num1 / num2;
                 System.out.println("El resultado de la división es: " + resultado4);
                break;
            case "r":
                int resultado5 = num1 * num2;
                System.out.println("Resultado: " + resultado5);
                break;
            default:
                System.out.println("No existe la operacion que quieres.");
        }
    }
}


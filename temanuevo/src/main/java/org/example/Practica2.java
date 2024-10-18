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
                entrada = true;
            } catch (NumberFormatException e) {
                System.out.println("Error introduce un numero.");
            }
        }

        System.out.print("Introduce la operacion que quieras hacer (+,-,*,/, r): ");
        operacion = teclado.nextLine();

        if (!operacion.equals("r")) {
            entrada = false;
            while (!entrada) {
                System.out.print("Introduce el segundo numero: ");
                try {
                    num2 = Integer.parseInt(teclado.nextLine());
                    entrada = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error introduce un numero.");
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
                while (num2 == 0) {
                    System.out.println("No puede ser 0 , dime un numero nuevo:  ");
                    num2 = teclado.nextInt();
                }
                int resultado4 = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado4);
                break;
            case "r":
                int resultado5 = num1 * num2;
                System.out.println("Resultado: " + resultado5);
                break;
            case "suma":
                int resultado6 = num1 + num2;
                System.out.println("Resultado: " + resultado6);
                break;
            case "resta":
                int resultado7 = num1 - num2;
                System.out.println("Resultado: " + resultado7);
                break;
            case "multiplicacion":
                int resultado8 = num1 * num2;
                System.out.println("Resultado: " + resultado8);
                break;
            case "division":
                    while (num2 == 0) {
                        System.out.println("No puede ser 0 , dime un numero nuevo: ");
                        num2 = teclado.nextInt();
                    }
                int resultado9 = num1 / num2;
                System.out.println("Resultado: " + resultado9);
                break;
            case "raiz":
                int raiz = num1*num2;
                System.out.println("Resultado: " + raiz);
                break;
            default:
                System.out.println("No existe la operacion que quieres.");
                break;
        }
    }
}


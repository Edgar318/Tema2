package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {
    public void calculadora() {
    Scanner teclado = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    String operacion;

    boolean entrada = false;
    while (!entrada) {
        System.out.print("Introduce el primer número: ");
        try {
            num1 = Integer.parseInt(teclado.nextLine());
            entrada = true; 
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un número válido.");
        }
    }

    System.out.print("Introduce la operación (suma, resta, multiplicación, división, r para raíz): ");
    operacion = teclado.nextLine();

    if (!operacion.equals("r")) {
        entrada = false; 
        while (!entrada) {
            System.out.print("Introduce el segundo número: ");
            try {
                num2 = Integer.parseInt(teclado.nextLine());
                entrada = true; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número válido.");
            }
        }
    }

    switch (operacion) {
        case "suma":
            int resultado1 = num1 + num2;
            System.out.println("Resultado: " + resultado1);
            break;
        case "resta":
            int resultado2 = num1 - num2;
            System.out.println("Resultado: " + resultado2);
            break;
        case "multiplicación":
            int resultado3 = num1 * num2;
            System.out.println("Resultado: " + resultado3);
            break;
        case "división":
            if (num2 == 0) {
                System.out.println("Error: División por cero.");
            } else {
                int resultado4 = num1 / num2;
                System.out.println("El resultado de la división sería: " + resultado4);
            }
            break;
        case "r":
            int resultado5 = num1 * num2;
            System.out.println("Resultado de la raíz: " + resultado5);
            break;
        default:
            System.out.println("No esta la operacion que quieres.");
    }
}


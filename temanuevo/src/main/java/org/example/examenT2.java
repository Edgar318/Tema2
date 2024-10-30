package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class examenT2 {

    public void ejercicio1() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(100);
        int num;

        System.out.println("Vamos a jugar a un Juego");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Te digo el numero para que puedas decir el correcto y comprobar que se termina eljuego " + numero);
            System.out.println("Dime el numero que crees que es entre el 0 y 100 tienes 10 intentos: ");
            num = teclado.nextInt();
            if (num == numero) {
                System.out.println("Has acertado.");
                break;
            } else if (num < numero) {
                System.out.println("El numero que as introducido es menor que el oculto");

            } else if (num > numero) {
                System.out.println("El numero que as introducido es mayor que el oculto");
            }
        }

    }
}

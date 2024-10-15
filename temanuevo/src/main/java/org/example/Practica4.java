package org.example;

import java.util.Scanner;

public class Practica4 {
    public void practica4() {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;

        while (!error) {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fecha = scanner.nextLine();

            try {
                String[] partes = fecha.split("/");

                if (partes.length != 3) {
                    System.out.println("Formato incorrecto, debe ser dd/mm/aaaa.");
                    continue;
                }

                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int año = Integer.parseInt(partes[2]);

                if (dia <= 0 || mes <= 0 || año <= 0) {
                    System.out.println("Los números deben ser positivos y mayores que cero.");
                }

                error = true;

                int suma = dia + mes + año;
                System.out.println(dia + " + " + mes + " + " + año + " = " + suma);

                String sumaComoString = String.valueOf(suma);
                int numerosuerte = sumaComoString.chars()
                        .map(Character::getNumericValue)
                        .sum();

                System.out.println("Tu número de la suerte es: " + numerosuerte);

            } catch (NumberFormatException e) {
                System.out.println("Error: introduce solo números.");
            }
        }
        }
    }


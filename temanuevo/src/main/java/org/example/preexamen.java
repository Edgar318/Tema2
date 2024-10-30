package org.example;

import java.util.Scanner;

public class preexamen {

    public void preexamen1() {
        Scanner scanner = new Scanner(System.in);

        int mayores = 0;
        int menores = 0;
        int iguales = 0;

        while (true) {
            System.out.print("Introduce numeros: ");
            String input = scanner.nextLine();

            String[] numeros = input.split(" ");

            for (String numStr : numeros) {
                try {
                    int numero = Integer.parseInt(numStr);

                    if (numero > 0) {
                        mayores++;
                    } else if (numero < 0) {
                        menores++;
                    } else {
                        iguales++;
                    }
                } catch (NumberFormatException er) {
                    System.out.println("Entrada no válida: " + numStr);
                }
            }

            System.out.println("Números mayores que 0: " + mayores);
            System.out.println("Números menores que 0: " + menores);
            System.out.println("Números iguales a 0: " + iguales);
        }
    }

    public void preexamen2(){

        Scanner scanner = new Scanner(System.in); // Pedimos la base y el exponente al usuario System.out.print("Introduce la base (número real): ");
        double base = scanner.nextDouble();
        System.out.print("Introduce el exponente (entero positivo): ");

        int exponente = scanner.nextInt();

        // Verificamos que el exponente sea positivo

        if (exponente < 0) {
            System.out.println("El exponente debe ser un entero positivo.");
        } else {
            double resultado = 1;

            // Calculamos la potencia mediante un bucle
            for (int i = 0; i < exponente; i++) {

                resultado *= base; }

            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado); }

    }

    public void preexamen3(){

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de meses de financiación

        System.out.print("Introduce el número de meses de financiación: ");

        int meses = scanner.nextInt();
        int pagoMensual = 10;
        int totalAPagar = 0;

        // Calcular el pago mensual y el total para cada mes
        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pagoMensual + "€");
            totalAPagar += pagoMensual;
            pagoMensual *= 2; // Duplicar el pago cada mes
        }

        System.out.println("Total a pagar: " + totalAPagar + "€"); scanner.close(); }

    public void preexamen4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una nota numérica (0-10): ");

        int nota = scanner.nextInt();
        String resultado;

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                resultado = "INSUFICIENTE";
                break;
            case 5:
                resultado = "SUFICIENTE";
                break;
            case 6:
                resultado = "BIEN";
                break;
            case 7:
                resultado = "NOTABLE";
                break;
            case 8:
                resultado = "NOTABLE";
                break;
            case 9:
                resultado = "SOBRESALIENTE";
                break;
            case 10:
                resultado = "SOBRESALIENTE";
                break;
            default:
                resultado = "no válido";
        }

        System.out.println(resultado);
    }

    public void preexamen5(){
        Scanner scanner = new Scanner(System.in);
        double sueldoMaximo = 0;
        int contadorMasDeMil = 0;

        // Solicitar los sueldos
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el sueldo #" + (i + 1) + ": ");
            double sueldo = scanner.nextDouble();

            // Verificar el sueldo máximo
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }

            // Contar sueldos mayores a 1000€
            if (sueldo > 1000) {
                contadorMasDeMil++;
            }
        }

        // Mostrar resultados
        System.out.println("El sueldo más alto es: " + sueldoMaximo + "€");
        System.out.println("Número de sueldos mayores a 1000€: " + contadorMasDeMil);

    }

    public void preexamen6(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de alumnos: ");
        int n = scanner.nextInt();

        int sumaEdades = 0;
        int sumaAlturas = 0;
        int mayoresDe18 = 0;
        int altos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Edad del alumno #" + (i + 1) + ": ");
            int edad = scanner.nextInt();
            sumaEdades += edad;

            System.out.print("Altura del alumno #" + (i + 1) + " (cm): ");
            int altura = scanner.nextInt();
            sumaAlturas += altura;

            if (edad > 18) mayoresDe18++;
            if (altura > 175) altos++;
        }

        double edadMedia = (double) sumaEdades / n;
        double alturaMedia = (double) sumaAlturas / n;

        // Mostrar resultados
        System.out.println("Edad media: " + edadMedia);
        System.out.println("Altura media: " + alturaMedia + " cm");
        System.out.println("Alumnos mayores de 18 años: " + mayoresDe18);
        System.out.println("Alumnos que miden más de 175 cm: " + altos);


    }

    public void preexamen7(){

        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar un número positivo
        do {
            System.out.print("Introduce un número entero positivo de términos: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: Debes introducir un número positivo.");
            }
        } while (n <= 0);

        // Calcular y mostrar la secuencia de Fibonacci
        System.out.print("Secuencia de Números: ");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        System.out.println(); // Nueva línea al final

    }

    public void ibsn(){
        Scanner teclado = new Scanner(System.in);
        String numero;
        while (true) {
            System.out.println("Dime el ISBN que quieras comprobar: ");
            numero = teclado.next();
            if (numero.length() == 10) {
                break;
            } else {
                System.out.println("El ISBN esta mal.");
            }
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(numero.charAt(i));
            sum += (10 - i) * digito;
        }
        char digito2 = numero.charAt(9);
        if (digito2 == 'X' || digito2 == 'x') {
            sum += 10;
        } else {
            int digito = Character.getNumericValue(digito2);
            sum += digito;
        }
        if (sum % 11 == 0) {
            System.out.println("El " + numero + " es válido.");
        } else {
            System.out.println("El " + numero + " no es válido.");
        }
    }

    public void sumardig(){
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número: ");
        String numero = scanner.nextLine();

        int suma = 0;

        // Sumar los dígitos del número utilizando char
        for (int i = 0; i < numero.length(); i++) {
            // Obtener el carácter en la posición i
            char digitoChar = numero.charAt(i);

            // Convertir el carácter a dígito (su valor numérico)
            // Restamos '0' para convertir el char a int
            int digito = digitoChar - '0';
            suma += digito;
        }

        // Mostrar el resultado
        System.out.println("La suma de los dígitos es: " + suma);

    }

}





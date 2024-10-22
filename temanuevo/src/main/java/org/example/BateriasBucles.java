package org.example;

import java.util.Scanner;

public class BateriasBucles {
    public void bucles() {
        for (int i = 0; i <= 100 ; i ++){
            System.out.println("i= " + i);
        }

    }

    public void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        String psw_usuario;;
        String psw = "entornos";
        do{

            System.out.println("Introduce tu contraseña: ");
            psw_usuario = teclado.next();

        }while(!psw_usuario.equals(psw));{
            System.out.println("Bienvenido.");
        }

    }

    public void ejercicio2() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        for (int i = num; i >= 1; i--) {
            if(i%2==0){
                System.out.println(i);
            }
        }

    }

    public void ejercicio3(){
        System.out.println("Los numeros que son multiplo de 3 son estos: ");

        for(int i = 0; i <=50 ; i++){
            if(i % 3 == 0){
                System.out.println(i + " Es multiplo de 3");
            }
        }


    }

    public void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una palabra: ");
        String palabra = teclado.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }

    public void ejercicio5(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: " );
        int num = teclado.nextInt();
        for (int i = 0;i<=10;i++){
            int resultado = i*num;
            System.out.println("El resultado de " + num + "x" + i + "=" + resultado);
        }
    }

    public void ejercicio6(){
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        for (int i = 1;i<=10;i++){
            System.out.println("Inserta nº"+i + " :");
            int num2 = teclado.nextInt();
            System.out.println("num2 = " + num2);
        }
        

    }

}

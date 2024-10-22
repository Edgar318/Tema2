package org.example;

import java.util.Scanner;

public class Practica3 {
    public void ibsn(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el IBSN que quieras comprobar: ");

        String numero = teclado.next();
        int sum = 0 ;
        for (int i = 0; i < 10;i++){
            int digito = numero.charAt(i);
            sum += (10 - i) * digito;
        }
        if (sum%11==0){
            System.out.println("El " + numero + " es valido.");
        }else{
            System.out.println("El " + numero + " no es valido.");
        }

    }
}

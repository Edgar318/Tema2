package org.example;

import java.util.Scanner;

public class Practica3 {
    public void ibsn(){
        Scanner teclado = new Scanner(System.in);
        String numero;
        while (true) {
            System.out.println("Dime el ISBN que quieres comprobar: ");
            numero = teclado.next();
            if (numero.length() == 10){
                break;
            }else{
                System.out.println("El ISBN esta mal.");
            } 
        }

        int sum = 0;
        for (int i = 0 ; i < 9; i++){
        int digito = Character.getNumericValue(numero.charAt(i));
        sum += (10 - i) * digito;
        }

        char digito2 = numero.charAt(9);
        if (digito2 = "X" || digito2 = "x"){
            sum += 10;
        }else{
            int digito = Character.getNumericValue(digito2);
            sum += digito ;
        
        }    

        if (sum % 11 == 0){
                System.out.println("El " + numero + " es valido.");
        }else{
                System.out.println("El " + numero + " es valido.");
        }      
    }
}

package org.example;

import java.util.Scanner;

public class Bateria2 {

    public void altura(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu altura: ");
        int altura = teclado.nextInt();

        if (altura<=150){
            System.out.println("Persona de altura baja un minion.");
        }else if(altura>151 && altura<=175){

            System.out.println("Persona de altura media eres muy comun");

        }else if (altura>=176){

            System.out.println("Persona alta dedicate al baloncesto");

        }


    }

    public void semana(){

    }



}

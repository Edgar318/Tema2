package org.example;
public class CosasStrings {
    public void caracteres(){
        String frase = "No me porto mal en clase y no lo reconozco.";

        int tamaño = frase.length();
        System.out.println("El tamaño de la frase es " + tamaño);

        char letra = frase.charAt(33);
        System.out.println("La letra en el caracter 33 es la " + letra);

        String palabra = frase.substring(9,13);
        System.out.println("palabra con substring es " + palabra);

        String palabra2 = " Parte.";
        String concatenacion = frase.concat(palabra2);
        System.out.println("La concatenacion de la frase con la palabra es " + palabra2 + " es: " + concatenacion);

        int posicion = concatenacion.indexOf(palabra2);
        System.out.println("La palabra " + palabra2 + "esta en la posicion " + posicion);

        int posicion2 = concatenacion.indexOf("no",8);

        System.out.println("La posicion de la palabra no si no tenemos en cuenta las 8 primeras posiciones es la " + posicion2);

        int posicion3 = concatenacion.lastIndexOf("no");
        System.out.println("La posicion de la ultima aparicion de la palabra ,no, es " + posicion3);

        String mayusculas = frase.toUpperCase();
        String minisculas = frase.toLowerCase();
        System.out.println("La frase en mayusculas es " + mayusculas + " y en minusculas es " + minisculas);


        String nombre = "Edgar                   ";
        nombre = nombre.trim();
        System.out.println("Tu nombre sin espacios es " + nombre);

        String reemplazar = frase.replace("mal","bien");
        System.out.println("La frase con la palabra ´mal´ con la palabra ´bien´ queda asi " + reemplazar);
        String remplazar_espacios = reemplazar.replace(" ","");
        System.out.println("La frase sin espacios es " + remplazar_espacios);

        String palabra3 = "hola";
        String palabra4 = "Hola";

        if(palabra3.equals(palabra4)==true){
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        }else{
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son distintas");
        }


        if(palabra3.equalsIgnoreCase(palabra4)==true){
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        }else{
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son distintas");
        }





    }


}

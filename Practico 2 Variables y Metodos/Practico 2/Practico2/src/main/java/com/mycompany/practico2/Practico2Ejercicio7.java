/*
 Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt)
 */
package com.mycompany.practico2;

import java.util.Scanner;


public class Practico2Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Pido al usuario que ingrese una oracion y la guardo
        System.out.println("Ingrese una oracion");
        String oracion = sc.nextLine();
    //Creo las variables del tamaño de la cadena y el contador de vocales
        int tamanoCadena = oracion.length();
        int contadorVocales = 0;
    //Creo un bucle for para iterar con el string y asi sumar las vocales
        for (int i = 0; i < tamanoCadena; i++) {
            char caracter = oracion.charAt(i);
            if (esVocal(caracter)) {
                contadorVocales++;
            }
        }
    //Imprimo por pantalla el tamaño de la cadena y la cantidad de vocales
        System.out.println("Tamaño de la cadena: " + tamanoCadena);
        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
    //Creo un metodo booleano para verificar cada caracter del string y ver cual es vocal
    //Se modifican las vocales a minuscula para que sea mas sencillo contarlas
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
        
    }


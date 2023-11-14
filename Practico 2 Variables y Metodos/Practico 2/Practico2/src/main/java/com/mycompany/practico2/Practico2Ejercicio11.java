/*
Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
package com.mycompany.practico2;

import java.util.Scanner;


public class Practico2Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
            String palabra = sc.nextLine();
        System.out.println("Ingrese la segunda palabra");
            String palabra2 = sc.nextLine();
    //Primera forma compareTo
        //Creo variable resultado para poder trabajar con el string
        int resultado = palabra.compareTo(palabra2);
        if (resultado < 0){
            System.out.println("La primer palabra es menor que la segunda usando compareTo");
        } else if (resultado > 0) {
            System.out.println("La primer palabra es mayor que la segunda usando compareTo");
        } else if (resultado == 0){
            System.out.println("Ambas palabras son iguales usando compareTo");
        }
    //Segunda forma usando compareToIgnoreCase
        //Creo otra variable de resultado para poder trabajar con el segundo metodo
        int resultadoIgnoreCase = palabra.compareToIgnoreCase(palabra2);
        if (resultadoIgnoreCase < 0){
            System.out.println("La primer palabra es menor que la segunda,ignorando mayusculas y minusculas");
        } else if (resultadoIgnoreCase > 0) {
            System.out.println("La primer palabra es mayor que la segunda, ignorando mayusculuas y minusculas");
        } else if (resultadoIgnoreCase == 0){
            System.out.println("Ambas palabras son iguales, ignorando mayusculas y minusculas");
        }
    //Tercer forma equals
        //Creo el booleano isEquals para trabajar con el T or F
        boolean isEquals = palabra.equals(palabra2);
        if (isEquals) {
            System.out.println("Las palabras son iguales usando equals");
        } else {
            System.out.println("Las palabras no son iguales usando equals");
        }
    }
    }
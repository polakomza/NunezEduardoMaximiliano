/*
 Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
ejemplo:
45-9-8-6-45-23-21-74-96-32-45-25
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.
 */
package com.mycompany.practico3;

import java.util.Scanner;
public class Practico3Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese una cadena de numeros separados por guiones medio");
        String cadenaDeNumeros = sc.nextLine();
        
        String[] arreglo = cadenaDeNumeros.split("-");
        int[] arregloDeEnteros = arregloStringToInt(arreglo, arreglo.length);

        System.out.println(sumaArregloInt(arregloDeEnteros, arregloDeEnteros.length));
        System.out.println(promedioArregloInt(arregloDeEnteros, arregloDeEnteros.length));
    }
    public static int sumaArregloInt (int [] arregloInt, int dimension) {
        
        int suma = 0;
        for (int i = 0; i < dimension; i++) {
            suma += arregloInt[i];
       }
        return suma;
    }
    public static double promedioArregloInt (int [] arregloInt, int dimension) {
        
        double promedio = 0;
        for (int i = 0; i < dimension; i++) {
            promedio += arregloInt[i];
       }

        return promedio/arregloInt.length;
    }
     public static int[] arregloStringToInt (String [] arregloString, int dimension) {
        int arregloInt [] = new int [dimension];
        for (int i = 0; i < dimension; i++){
            arregloInt[i] = Integer.parseInt(arregloString[i]);
        }
        return arregloInt;
    }
}

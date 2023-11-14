/*Codifique un programa que pida el ingreso de un numero decimal y asigne el mismo a 
una variable llamada valorDecimal de tipo double, aplique
operaciones de CASTING para convertir la variable a los siguientes tipos de datos:
short,int,long,String,float*/

package com.mycompany.practico2;

import java.util.Scanner;

public class Practico2Ejercicio1 {

    public static void main(String[] args) {
    //Uso de clase Scanner para recibir datos
        Scanner sc = new Scanner (System.in);   
        
        System.out.println("Ingrese un numero decimal");
    //Creo variable donde guardo el numero ingresado
        double valorDecimal = sc.nextDouble();
    //Casteo a int
        int numInt = (int) valorDecimal;
        System.out.println("El numero en valor entero es: " + numInt);
    //Casteo a long
        long numLong = (long) valorDecimal;
        System.out.println("El numero en valor long es: " + numLong);
    //Casteo a short
        short numShort = (short) valorDecimal;
        System.out.println("El numero en valor short es: " + numShort);
    //Casteo a float
        float numFloat = (float) valorDecimal;
        System.out.println("El numero en valor float es: " + numFloat);
    //Casteo a String utilizando Double.toString
        String valorString = Double.toString(valorDecimal);
        System.out.println("El numero en String es: " + valorString);
    //Casteo a String utilizando String.format
        String valorStringFormat = String.format("%2f",valorDecimal);
        System.out.println("El numero en String .format es: " + valorStringFormat);
    }
}

/*
Cree una clase OperacionesFraccion que contenga un método main donde se
solicite al usuario el ingreso de 4 valores numéricos enteros con los cuales se
crearan 2 objetos Fracción y finalizada la creación de los mismos se ejecutaran
los 4 métodos implementados anteriormente asignando el resultado a una
nueva variable de tipo Fracción y mostrando por pantalla el resultado de las
operaciones realizadas.
 */
package com.mycompany.practico2;

import java.util.Scanner;

public class OperacionesFraccion {
    public static void main(String[] args) {
        int numerador1,numerador2,denominador1,denominador2;
        System.out.println("Ingrese un numero entero para el numerador de la primer fraccion");
        numerador1 = new Scanner(System.in).nextInt();
        System.out.println("Ingrese un numero entero para el denominador de la primer fraccion");
        denominador1 = new Scanner(System.in).nextInt();
        System.out.println("Ingrese un numero entero para el numerador de la segunda fraccion");
        numerador2 = new Scanner(System.in).nextInt();
        System.out.println("Ingrese un numero entero para el denominador de la segunda fraccion");
        denominador2 = new Scanner(System.in).nextInt();
        
        Fraccion f1 = new Fraccion(numerador1,denominador1);
        Fraccion f2 = new Fraccion(numerador2,denominador2);
        
        Fraccion suma = f1.sumarFracciones(f1, f2);
        Fraccion resta = f1.restarFracciones(f1, f2);
        Fraccion multiplicacion = f1.multiplicarFracciones(f1, f2);
        Fraccion division = f1.dividirFracciones(f1, f2);
        
        System.out.println("El resultado de la suma es: " + suma.obtenerRepresentacion());
        System.out.println("El resultado de la resta es: " + resta.obtenerRepresentacion());
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion.obtenerRepresentacion());
        System.out.println("El resultado de la division es: " + division.obtenerRepresentacion());      
    }
}

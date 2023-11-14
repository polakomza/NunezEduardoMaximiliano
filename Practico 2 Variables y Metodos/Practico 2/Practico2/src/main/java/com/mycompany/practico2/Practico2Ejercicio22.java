/*
Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
 */
package com.mycompany.practico2;

import java.util.Scanner;


public class Practico2Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero positivo");
        int n = new Scanner(System.in).nextInt();
        if (n < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int suma = sumaDigitos(n);
            System.out.println("La suma de los dígitos es: " + suma);
        }
    }
        // Método recursivo para sumar los dígitos de un número
    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        // Obtener el último dígito del número
        int ultimoDigito = n % 10;
        // Recursivamente suma los dígitos restantes
        return ultimoDigito + sumaDigitos(n / 10);
    }
        
}
    


/*
Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf
*/
package com.mycompany.practico2;

import java.util.Scanner;


public class Practico2Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para convertirlo a String");
    //Ingreso el numero que me dio el usuario
        int numero = sc.nextInt();
    //Convierto el numero int a string mediante String.valueOF
        String stringNumero = String.valueOf(numero);
    //Muestro por pantalla el numero ya en formato string
        System.out.println("El numero en formato String es: " + stringNumero);
    }
}

/*Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.*/
package com.mycompany.practico2;

/*Si se asigna un valor fuera de rango a una variable provocara un desbordamiento
haciendo que el programa lance una exception.
Una forma de resolverlo seria realizar validaciones de entrada antes de asignar a las variables.
*/

import java.util.Scanner;

public class Practico2Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Defino valores de entrada
        int valorMinimo = 0;
        int valorMaximo = 100;
        //Pido al usuario que ingrese un numero dentro de los valores permitidos
        System.out.println("Ingrese un valor entre " + valorMinimo + " y " + valorMaximo + ": ");
        int valorIngresado = scanner.nextInt();
        //Realizo validacion
        if (valorIngresado >= valorMinimo && valorIngresado <= valorMaximo) {
            System.out.println("El valor ingresado es válido: " + valorIngresado);
        } else {
            System.out.println("El valor ingresado está fuera del rango válido.");
        }
    }
}
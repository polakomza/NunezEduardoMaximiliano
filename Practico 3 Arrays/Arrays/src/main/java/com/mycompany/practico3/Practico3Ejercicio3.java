/*
Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
*/
package com.mycompany.practico3;



import java.util.Scanner;

public class Practico3Ejercicio3 {
    public static void main(String[] args) {
        Scanner tamanio = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        //El tamaño del arreglo es dictado por el usuario
        int arreglo[] = new int [tamanio.nextInt()];

        System.out.print("Ingrese el número cuyos múltiplos desea agregar al arreglo: ");
        int numero = tamanio.nextInt();

        // Llenar el arreglo con los múltiplos del número ingresado
        llenarArregloConMultiplos(arreglo, numero);

        // Mostrar los elementos del arreglo
        System.out.println("Elementos del arreglo:");
        mostrarArreglo(arreglo);
    }

    // Función para llenar el arreglo con múltiplos de un número dado
    public static void llenarArregloConMultiplos(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numero * (i + 1);
        } 
    }

    // Función para mostrar los elementos del arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Multiplo numero " + (i + 1) + ": " + arreglo[i]);
        }
    }
}



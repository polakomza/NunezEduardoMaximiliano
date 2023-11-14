/*
Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree
dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.
 */
package com.mycompany.practico3;

import java.util.Scanner;
public class Practico3Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arregloOriginal = new int[10];
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.println("Ingrese un numero para cargar el arreglo en la posicion: " + (i + 1));
            arregloOriginal[i] = sc.nextInt();
        }
        System.out.println("El arreglo ya cargado queda asi: ");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.println(arregloOriginal);
        }
        int[] arregloAscendente = ordenAscendente(arregloOriginal);
        System.out.println("El arreglo original ordenado de forma ascendente queda");
        for (int i = 0; i < arregloAscendente.length; i++) {
            System.out.println(arregloAscendente[i]);
        }

        int[] arregloDescendente = ordenDescendente(arregloOriginal);
        System.out.println("El arreglo original ordenado de forma descendente queda");
        for (int i = 0; i < arregloDescendente.length; i++) {
            System.out.println(arregloDescendente[i]);
        }
    }

    static int[] ordenAscendente(int[] arregloAscendente) {

        for (int i = 0; i < arregloAscendente.length - 1; i++) {
            int menorNumero = i;

            for (int j = i + 1; j < arregloAscendente.length; j++) {
                if (arregloAscendente[j] < arregloAscendente[menorNumero]) {
                    menorNumero = j;
                }
            }

            if (i != menorNumero) {

                int variableauxiliar = arregloAscendente[i];
                arregloAscendente[i] = arregloAscendente[menorNumero];
                arregloAscendente[menorNumero] = variableauxiliar;
            }
        }
        return arregloAscendente;
    }

    static int[] ordenDescendente(int[] arregloDescendente) {
        for (int i = 0; i < (arregloDescendente.length - 1); i++) {
            for (int j = i + 1; j < arregloDescendente.length; j++) {
                if (arregloDescendente[i] < arregloDescendente[j]) {

                    int variableauxiliar = arregloDescendente[i];
                    arregloDescendente[i] = arregloDescendente[j];
                    arregloDescendente[j] = variableauxiliar;

                }
            }
        }
        return arregloDescendente;
    }
}

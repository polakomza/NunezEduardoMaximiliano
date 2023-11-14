/*
Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, pedir los
valores numéricos enteros para cargar cada uno de los arreglos, cree un tercer arreglo de
tamaño 10 que contenga en casa posición la suma de la multiplicación de cada elemento
del array uno por cada elemento del array 2
ARRAY3 = (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1
* posición 1 del arreglo 2) + (posición 0 del arreglo 1 * posición 2 del arreglo 2) +
………….+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores
en el 3 array.
 */
package com.mycompany.practico3;

import java.util.Scanner;
public class Practico3Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int arreglo1[] = new int[5];
        int arreglo2[] = new int[10];
        int arreglo3[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor para el arreglo 1 posicion " + i);
            arreglo1[i] = leer.nextInt();
        }
        System.out.println(" ---------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor para el arreglo 2 posicion " + i);
            arreglo2[i] = leer.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                arreglo3[i] += arreglo1[i] * arreglo2[j];
            }
        }

        System.out.println(" ");

        System.out.println("El primer arreglo queda asi: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo1[i] + "  ");
        }
        
        System.out.println(" ");

        System.out.println("El segundo arreglo queda asi: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo2[i] + "  ");
        }
       
        System.out.println(" ");

        System.out.println("El tercer arreglo con cada posicion queda asi: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo3[i] + "  ");

        }
        
    }
}

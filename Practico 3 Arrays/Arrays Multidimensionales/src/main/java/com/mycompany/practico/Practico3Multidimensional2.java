/*
Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
entero que deberá ser ingresado por el usuario. A continuación cree un segundo
array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
el resultante de multiplicar cada una de las posiciones de las filas del array uno por
cada una de las posiciones de las columnas del array 2.
Muestre por pantalla cada uno de los arrays con sus valores.
 */
package com.mycompany.practico;

import java.util.Scanner;
public class Practico3Multidimensional2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor numerico de X");
        int X = teclado.nextInt();
        System.out.println("Ingrese un valor numerico de Y");
        int Y = teclado.nextInt();

        int[][] matriz = arrayValoresDeXY(X, Y);
        int[][] matriz2 = arrayValoresDeXY(Y, X);
        int[][] matriz3 = arrayMultiplicaXporY(matriz, matriz2);
        imprimirArregloMultiIntEnLinea(matriz);
        imprimirArregloMultiIntEnLinea(matriz2);
        imprimirArregloMultiIntEnLinea(matriz3);

    }

    public static int[][] arrayValoresDeXY(int dimensionFila, int dimensionColumna) {
        Scanner teclado = new Scanner(System.in);
        int arregloMultiInt[][] = new int[dimensionFila][dimensionColumna];
        for (int i = 0; i < dimensionFila; i++) {
            for (int j = 0; j < dimensionColumna; j++) {
                System.out.println("Ingrese numero entero en fila " + i + ", columna " + j);
                arregloMultiInt[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Fin carga matriz");
        return arregloMultiInt;
    }

    public static int[][] arrayMultiplicaXporY(int[][] arreglo1, int[][] arreglo2) {
        int arregloMultiplicacion[][] = new int[arreglo1.length][arreglo1[0].length];

        for (int i = 0; i < arregloMultiplicacion.length; i++) {
            for (int j = 0; j < arregloMultiplicacion[0].length; j++) {
                arregloMultiplicacion[i][j] += arreglo1[i][j] * arreglo2[j][i];
            }
        }
        return arregloMultiplicacion;
    }


    

    public static void imprimirMatrizStringEnLinea(String[][] arreglo) {
        System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
    }

    public static void imprimirArregloMultiIntEnLinea(int[][] arreglo) {
        System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
    }
}

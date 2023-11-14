/*
 Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los
valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
pantalla la matriz resultante.
Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
en una nueva matriz de una dimensión, finalmente sume los valores de esta última
matriz y muestre el resultado por pantalla.
 */
package com.mycompany.practico;

import java.util.Scanner;
public class Practico3Multidimensional3 {
    public static void main(String[] args) {

        int X;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero entero X mayor o igual a 3 y menor o igual a 10");
            X = sc.nextInt();
        }
        while(X<3 || X>10);

        int [][] matriz = arregloIntConMultidimension(X, X);
        imprimirArregloMultiIntEnLinea(matriz);
        
        int [][] matriz2 = new int [1][matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++){
            for (int[] matriz1 : matriz) {
                matriz2[0][j] += matriz1[j];
            }
        }
        imprimirArregloMultiIntEnLinea(matriz2);
        
        int suma = 0;
        System.out.println("Suma de los valores de la Matriz de " + matriz2.length + " fila/s y " + matriz2[0].length + " columna/s");
        for (int j = 0; j < matriz2[0].length; j++){
            for (int[] matriz1 : matriz) {
                suma = suma + matriz1[j];
            }
                
        }

        System.out.println("La suma es " + suma);

        }





        public static int[][] arregloIntConMultidimension (int dimFila, int dimColumna) {
            Scanner sc = new Scanner(System.in);
            int arregloMultiInt [][] = new int [dimFila][dimColumna];
            for (int i = 0; i < dimFila; i++) {
                for (int j = 0; j <dimColumna; j++) {
                    System.out.println("Ingrese numero entero en fila " + i + ", columna " + j);
                    arregloMultiInt[i][j] = sc.nextInt();
                }
            }
            System.out.println("Fin carga matriz");
            return arregloMultiInt;
        }
        
        public static int[][] matrizMultFilasyColumnas (int [][] arreglo1, int [][] arreglo2) {
            int arregloMultiplicacion [][] = new int [arreglo1.length][arreglo1[0].length];
    
            for (int i = 0; i < arregloMultiplicacion.length; i++) {
                for (int j = 0; j < arregloMultiplicacion[0].length; j++) {
                    arregloMultiplicacion[i][j] += arreglo1[i][j] * arreglo2[j][i];    
                }
            }
            return arregloMultiplicacion;
        }


               

        public static void imprimirMatrizStringEnLinea (String [][] arreglo) {
            System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (String[] arreglo1 : arreglo) {
            for (int j = 0; j < arreglo1.length; j++) {
                System.out.print(arreglo1[j] + " ");
            }
            System.out.println("");
        }
            System.out.println("");
        }

        public static void imprimirArregloMultiIntEnLinea (int [][] arreglo) {
            System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int[] arreglo1 : arreglo) {
            for (int j = 0; j < arreglo1.length; j++) {
                System.out.print(arreglo1[j] + " ");
            }
            System.out.println("");
        }
            System.out.println("");
        

}
}

/*
Crea un programa que pida por pantalla cuatro países y a continuación tres
ciudades de cada uno de estos países. Los nombres de ciudades deben
almacenarse en un array multidimensional cuyo primer índice sea el número
asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
el array deberá tener un tamaño de 4x4
Ejemplo de resultados que debe mostrar el programa:
País: Argentina Ciudades: Buenos Aires Cordoba La Plata
País: España Ciudades: Madrid Lugo Sevilla
País: Francia Ciudades: Paris Niza Lyon
País: Italia Ciudades: Roma Napoles Sicilia
 */

package com.mycompany.practico;

import java.util.Scanner;
public class Practico3Multidimensional1 {
public static void main(String[] args) {
    
        String [][] matrizPaisYCiudad = getMatrizString(4, 4);
        imprimirMatrizStringEnLinea(matrizPaisYCiudad);
        }


        public static String [][] getMatrizString (int dimensionFila, int dimensionColumna) {
            Scanner sc = new Scanner(System.in);
            String matrizString [][] = new String [dimensionFila][dimensionColumna];
            for (int i = 0; i < dimensionFila; i++) {
                System.out.println("Ingrese nombre del pais en fila " + (i+1));
                matrizString[i][0] = sc.nextLine();
            }
            System.out.println("----------------------------------------");
            for (int i = 0; i <dimensionFila; i++) {
                for (int j = 1; j < dimensionColumna; j++) {
                    System.out.println("Ingrese ciudad del pais " + matrizString[i][0]);
                    matrizString[i][j] = sc.nextLine();
                    }
            }
            return matrizString;
        }

        public static void imprimirMatrizStringEnLinea (String [][] arreglo) {
            System.out.println("El programa muestra como quedan los  " + arreglo.length + " paises con sus " + arreglo[0].length + " ciudades ingresadas");
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++){
                    System.out.print(arreglo[i][j] + " ");
                }
                System.out.println("");
    
            }
            System.out.println("");
    }
    
}

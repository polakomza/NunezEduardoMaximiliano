/*
. Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.
 */
package com.mycompany.practico3;

import java.util.Scanner;

public class Practico3Ejercicio2 {
       public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           //Declaro el arreglo
      int numeros [] = new int [5];
           //Creo un bucle for donde ire guardando los numeros dentro del indice del arreglo
          for (int i = 0; i < 5 ;i++){
              System.out.println((i + 1)+ ". Digite un numero:");
              numeros[i] = teclado.nextInt();
          }     
           System.out.println("\nLos numeros del arreglo son: ");
           for (int i = 0; i < numeros.length;i++){
               System.out.print(numeros[i]);
           }
    }
}
        
        
        


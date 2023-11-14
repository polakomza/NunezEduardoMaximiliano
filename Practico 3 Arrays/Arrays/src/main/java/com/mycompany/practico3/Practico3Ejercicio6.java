/*
Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
primera vez.
 */
package com.mycompany.practico3;

import java.util.Scanner;
import java.util.Random;

public class Practico3Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean elNumeroEsta = false;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = getNumeroAleatorio();
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("Ingrese el numero que quiere buscar dentro del arreglo");
        int numParaBuscar = sc.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            
            if (arreglo[i] == numParaBuscar) {
                System.out.println("Se encontro el numero " + numParaBuscar + " en la posicion " + (i + 1));
                elNumeroEsta = true;

            }
        }

        if (elNumeroEsta == false) {
            System.out.println("No se encontro el numero " + numParaBuscar + " en el arreglo");
        }

    }

    public static int getNumeroAleatorio() {
        Random numAleatorio = new Random();
        return numAleatorio.nextInt();
    }
}

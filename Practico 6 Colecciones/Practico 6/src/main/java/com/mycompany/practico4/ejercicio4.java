/*
Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
50 elementos generados aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así
sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
con un mensaje apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en
la lista por primera vez.
 */
package com.mycompany.practico4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            int numeroRandom = random.nextInt(100 + 1);
            numeros.add(numeroRandom);
        }
        System.out.println("Ingrese el número que desea buscar en la lista: ");
        int numeroBuscado = entrada.nextInt();
        int resultado = busquedaSecuencial(numeros, numeroBuscado);
        System.out.println("Lista de números: " + numeros);
        if (resultado != -1) {
            System.out.println("El número " + numeroBuscado + " se encontró en la posición " + resultado);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en la lista.");
        }
    }

    public static int busquedaSecuencial(ArrayList<Integer> numeros, int numeroBuscado) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }
}



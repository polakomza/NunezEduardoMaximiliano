/*
Escriba una aplicación que solicite y cargue en una ArrayList<Integer> 10
dígitos enteros, luego cree dos nuevas ArrayList<Integer> y asigne a la
primera los números ingresados por el usuario de forma ascendente y en la
segunda de forma descendente. Muestre las 2 listas por pantalla.
Investigue como ordenar una Lista(List<>)
*/
package com.mycompany.practico4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosAsce = new ArrayList<>();
        ArrayList<Integer> numerosDesce = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero entero: ");
            int numero = entrada.nextInt();
            numeros.add(numero);
        }
        numerosAsce.addAll(numeros);
        numerosDesce.addAll(numeros);
        Collections.sort(numerosAsce);//Lista ordenada de forma ascendente
        Collections.sort(numerosDesce, Collections.reverseOrder()); //Lista ordenada de forma descendente
        System.out.println("Lista natural: "+numeros);
        System.out.println("-------------------");
        System.out.println("Lista ordenada de forma ascendente: "+numerosAsce);
        System.out.println("-------------------");
        System.out.println("Lista ordenada de forma descendente: "+numerosDesce);
    }
}

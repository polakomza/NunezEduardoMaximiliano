/*
Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los
coloque en un ArrayList<Integer>.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y
muestre el rango (diferencia entre el mayor y el menor) de los
elementos en el arreglo
 */
package com.mycompany.practico4;

import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 20; i++){
            System.out.println("Ingrese un numero decimal: ");
            double numeroDecimal = entrada.nextDouble();
            numeros.add(numeroDecimal);
        }
        double mayor = 0;
        double menor = 0;
        for (double i : numeros) {
    if (mayor < i) {
        mayor = i;
    } else if (menor > i) {
        menor = i;
    }
}
        double rango = (mayor - menor);
        System.out.println("El mayor: " + mayor);
        System.out.println("El menor: " + menor);
        System.out.println("El rango entre " + mayor + " y " + menor + " es: "+rango);
        }
    }


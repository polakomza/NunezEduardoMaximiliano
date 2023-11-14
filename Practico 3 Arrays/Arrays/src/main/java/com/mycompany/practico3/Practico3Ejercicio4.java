/*
 Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo 
 */
package com.mycompany.practico3;

import java.util.Scanner;


public class Practico3Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaro longitud del array
        double num [] = new double [20];
        //Bucle for para ingresar los datos en el array
        for (int i = 0; i < num.length ;i++){
           System.out.println((i + 1)+ ". Digite un numero:");
            num[i] = entrada.nextDouble();
        }
        //Declaro 2 variables para los numeros mayor y menor, las inicializo en la posicion 0 del array
        double numMayor = num[0];
        double numMenor = num[0];
        //Bucle for para determinar el mayor y menor
        for (int j = 0; j < num.length; j++){
            if (num [j] >= numMayor){
                numMayor = num[j];
            }else{
                if (num [j] <= numMenor){
                    numMenor = num[j];
                }
            }
        }
        //Determino el rango entre los numeros
        double rangoNumeros = numMayor - numMenor;
        
        System.out.println("El numero mayor de los ingresados es: "+ numMayor);
        System.out.println("El numero menor de los ingresados es: "+ numMenor);
        System.out.println("El rango entre el numero mayor y el menor es: "+ rangoNumeros);
    }
}

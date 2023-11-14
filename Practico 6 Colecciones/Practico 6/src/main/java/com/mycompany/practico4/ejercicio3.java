/*
Escriba una aplicación para almacenar en un ArrayList<Integer>
aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético 
 */
package com.mycompany.practico4;

import java.util.ArrayList;
import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        //Relleno el arraylist con 20 numeros random.
        for(int i = 0; i < 20; i++){
            int numeroRandom = random.nextInt(100) + 1;
        numeros.add(numeroRandom);
        }
        double promedio = 0;
        int numIgualPromedio = 0;
        int numMayoresPromedio = 0;
        int numMenoresPromedio = 0;
        int sumatoria = 0;
        for(int i : numeros){
            sumatoria = (sumatoria + i);
        }
        promedio = (sumatoria / 20);
        for(int j : numeros){
            if(j == promedio){
            numIgualPromedio += 1;
        }else if(j > promedio){
            numMayoresPromedio += 1;
        }else if (j < promedio){
            numMenoresPromedio += 1;
        }
        }
        System.out.println("Numeros elegidos: "+numeros);
        System.out.println("El promedio de los numeros elegidos es: "+ promedio);
        System.out.println("Hay "+numIgualPromedio+" numeros iguales al promedio aritmetico.");
        System.out.println("Hay "+numMayoresPromedio+" numeros mayores al promedio aritmetico.");
        System.out.println("Hay "+numMenoresPromedio+" numeros menores al promedio artimetico.");
    }
}

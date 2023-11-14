/*
Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
 */
package com.mycompany.practico3;


import java.util.Random;

public class Practico3Ejercicio5 {
    public static void main(String[] args) {
        Random numRandom = new Random();
		int numero;
		int arrayNumsPares [] = new int[20];
		int contNumsMedia = 0;
		int contNumsMayoresMedia = 0;
		int contNumsMenoresMedia = 0;
		int total = 0;
		double mediaAritmetica;
		
		//Lleno el array de números pares (si da 0 le asigno 2, si da impar le sumo 1, si da par le asigno ese número
		for(int i=0; i<arrayNumsPares.length;i++) {
			numero = numRandom.nextInt(101);
			if(numero==0) arrayNumsPares[i] = 2;
			else if(numero%2!=0) arrayNumsPares[i] = numero+1;
			else arrayNumsPares[i] = numero;
			total+=numero;
		}
		
		//Calculo la media aritmética
		mediaAritmetica=total/arrayNumsPares.length;
		
		//Muestro el array
		System.out.println("El array se compone de los siguientes números:");
		for(int i=0; i<arrayNumsPares.length;i++) {
			if(i==(arrayNumsPares.length-1)) System.out.println(arrayNumsPares[i]);
			else System.out.print(arrayNumsPares[i] + " - ");
		}
		
		//Contabilizo los números iguales, mayores y menores a la media;
		for(int i=0; i<arrayNumsPares.length;i++) {
			if(arrayNumsPares[i]==mediaAritmetica) contNumsMedia++;
			else if(arrayNumsPares[i]>mediaAritmetica) contNumsMayoresMedia++;
			else contNumsMenoresMedia++;
		}
		
		//Muestro la información
		if(contNumsMedia>0) System.out.println("Hay " + contNumsMedia + " número/s igual/es a la media aritmética");
		else System.out.println("No hay números iguales a la media aritmética");
		
		if(contNumsMayoresMedia>0) System.out.println("Hay " + contNumsMayoresMedia + " números mayores a la media aritmética");
		else System.out.println("No hay números mayores a la media aritmética");
		
		if(contNumsMenoresMedia>0) System.out.println("Hay " + contNumsMenoresMedia + " números menores a la media aritmética");
		else System.out.println("No hay números menores a la media aritmética");
		
	}
        
    }

        

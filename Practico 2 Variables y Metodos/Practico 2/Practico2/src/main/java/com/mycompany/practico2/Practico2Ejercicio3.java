/*
Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14
*/

package com.mycompany.practico2;


import java.util.Scanner;

public class Practico2Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de 3 dígitos (100-999): ");
        //guardo el numero ingresado en la variable numero
        int numero = scanner.nextInt();
        
        if (numero >= 100 && numero <= 999) {
            int digito1 = numero / 100;          // Obtener el primer dígito
            int digito2 = (numero / 10) % 10;    // Obtener el segundo dígito
            int digito3 = numero % 10;           // Obtener el tercer dígito

            int sumaNumeros = digito1 + digito2 + digito3;

            System.out.println("La suma de los dígitos es: " + sumaNumeros);
        } else {
            System.out.println("El número ingresado no está en el rango válido.");
        }
    }
}


/*
Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
 */
package com.mycompany.practico2;

import java.util.Scanner;

public class Practico2Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero mayor a 0");
        int n = new Scanner(System.in).nextInt();
        
        if(n <= 0 ){
            System.out.println("El numero ingresado no es valido");
        }else{
            int suma = 0;
                for (int i = n; i >= 1; i--) {
                    suma += i;
            }
            System.out.println("La suma de sus antecesores es: " + suma);
        }
    }
}


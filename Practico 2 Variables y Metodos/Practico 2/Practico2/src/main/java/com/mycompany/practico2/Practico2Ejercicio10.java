/*
 Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
 */
package com.mycompany.practico2;

import java.util.Scanner;

public class Practico2Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Pido al usuario que ingrese una frase y guardo el string
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
    //Declaro la variable para trabajar la opcion 1 y 2 al elegir minusculas o mayusculas
        int opcionMinuOMayu;
    //Creo un bucle do while el cual hara que salga un mensaje de error si el numero ingresado no es 1 o 2
        do {
            System.out.println("Si desea que su frase se imprima en minúsculas presione 1, en mayúsculas presione 2.");
            opcionMinuOMayu = sc.nextInt();
    //Si el numero es distinto de 1 o de 2 muestra mensaje de error        
            if (opcionMinuOMayu != 1 && opcionMinuOMayu != 2) {
                System.out.println("Opción inválida. Ingrese 1 para minúsculas o 2 para mayúsculas.");
            }
    //El while hace que el bucle sea infinito hasta que el numero coincida con el numero 1 o el 2        
        } while (opcionMinuOMayu != 1 && opcionMinuOMayu != 2);
        
        if (opcionMinuOMayu == 1) {
            frase = frase.toLowerCase();
            System.out.println("Su frase en minúsculas es: " + frase);
        } else {
            frase = frase.toUpperCase();
            System.out.println("Su frase en mayúsculas es: " + frase);
        }
    }
}

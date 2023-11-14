/*
 Reemplaza todas las a del String anterior por una e. (aplique replace)
 */
package com.mycompany.practico2;

import java.util.Scanner;

public class Practico2Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pido que ingresen una oracion
        System.out.println("Ingrese una oracion para ser alterada");
        //Guardo la orcion
        String oracion = sc.nextLine();
        //Utilizando replace creo una nueva string y modifico todas las vocales
        String nuevaCadena = oracion.replace('a', 'e')
                                    .replace('i', 'e')
                                    .replace('o', 'e')
                                    .replace('u', 'e')
                                    .replace('A', 'e')
                                    .replace('I', 'e')
                                    .replace('O', 'e')
                                    .replace('U', 'e');
        //Muestro por pantalla el resultado final
        System.out.println("Oración alterada: " + nuevaCadena);
    }   
}

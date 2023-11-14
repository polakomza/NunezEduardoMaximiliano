/*
Pedir el ingreso de dos cadenas por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
 */
package com.mycompany.practico2;

import java.util.Scanner;


public class Practico2Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String oracion1 = sc.nextLine();
        System.out.println("Ingrese otra palabra");
        String oracion2 = sc.nextLine();
    //Metodo indexOf    
        int index1 = oracion2.indexOf(oracion1);
        if (index1 == -1) {
            System.out.println("La segunda palabra no se encuentra dentro de la primera");
        } else {
            System.out.println("La segunda palabra si se encuentra dentro de la primera");
        }
    //Metodo contains
        boolean contiene = oracion2.contains(oracion1);
        if (contiene == false) {
            System.out.println("La segunda palabra no se encuentra dentro de la primera usando metodo " + '\''+"contains" + '\'');
        } else {
            System.out.println("La segunda palabra si se encuentra dentro de la primera usando metodo " + '\''+"contains" + '\'');
        }
    }
}

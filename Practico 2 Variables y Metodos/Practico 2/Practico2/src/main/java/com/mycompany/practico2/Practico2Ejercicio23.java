/*
 Crea un programa donde se pida el ingreso de una cadena y por medio de
recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc”
 */
package com.mycompany.practico2;

import java.util.Scanner;

public class Practico2Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String cadena = sc.nextLine();
        
        System.out.println(revertir(cadena));
    }
    
    static String revertir(String cadena){
        if (cadena.length() == 1)
            return cadena;
        else 
            return revertir(cadena.substring(1)) + cadena.charAt(0);
    }
}

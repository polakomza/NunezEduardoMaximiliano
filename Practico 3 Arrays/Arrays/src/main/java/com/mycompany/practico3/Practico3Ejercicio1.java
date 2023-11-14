/*

 */

package com.mycompany.practico3;
/*
¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
*/

public class Practico3Ejercicio1 {

    public static void main(String[] args) {
        /*
        Si tratamos de acceder un elemento fuera del tamaño del array tendremos un
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        Esto quiere decirnos que estamos intentando acceder a una posicion fuera del rango del array
        */
        
        int array[] = {0,1,2,3};
        System.out.println("Accedemos fuera de rango" +array[4]);
        
    }
}

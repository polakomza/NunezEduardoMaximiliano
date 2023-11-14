/*
Del siguiente String “La lluvia en Mendoza es escasa” indique cual es el tamaño
de la cadena es decir su número de caracteres
*/
package com.mycompany.practico2;


public class Practico2Ejercicio6 {
    public static void main(String[] args) {
       String cadena = "La lluvia en Mendoza es escasa";
    //Creo una variable de tipo int (es el mismo tipo que el metodo length)
    //Utilizo el metodo lenght el cual lee la cantidad de caracteres.
       int cantidadCaracteres = cadena.length();
        System.out.println("La cantidad de caracteres es: " + cantidadCaracteres);
    }
}

/*
Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable?
 */
package com.mycompany.practico2;

public class Practico2Ejercicio15 {
    public static void main(String[] args) {
        /*
        Al intentar crear la variable numero y asignarle el valor null me dice que no se puede
        ya que no puede convertir null a tipo int. Dado que los primitivos no admiten valores nulos.
        int numero = null; Esto provoca un error de compilacion, entonces directamente debo utilizar la clase Integer
        */
        Integer numero = null;
        System.out.println("El valor de numero es: " + numero);   
    }
}

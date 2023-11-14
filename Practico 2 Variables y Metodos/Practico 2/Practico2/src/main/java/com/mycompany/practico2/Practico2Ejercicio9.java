/*
Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter
 */
package com.mycompany.practico2;


public class Practico2Ejercicio9 {
    public static void main(String[] args) {
        String texto = "La lluvia en Mendoza es escasa";
    //Convierto el string en un array de caracter
    char[] arrayDeCaracteres = texto.toCharArray();
    //Hago un for each que transforme cada caracter en codigo ASCII y lo imprima
    for (char c : arrayDeCaracteres) {
    //Pongo un if para evitar que los espacios sean transformados a codigo ASCII
        if (c != ' ') {
            int asciiValor = (int) c;
            System.out.print("El codigo ASCII de "+ '\'' + c + '\'' + " es " + '\'' + asciiValor + '\'' + " ");
        }
        }
    }
}

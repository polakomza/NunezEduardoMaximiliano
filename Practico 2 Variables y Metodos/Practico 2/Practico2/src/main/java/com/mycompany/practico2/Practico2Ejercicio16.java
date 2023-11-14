/*
 Como transformo una variable tipo Double a una variable tipo double?
 */
package com.mycompany.practico2;


public class Practico2Ejercicio16 {
    public static void main(String[] args) {
/*
    Existen dos maneras de hacerlo: 
        1) De forma implicita donde se realiza automaticamente la conversion 
        gracias al autounboxing de clases sobre su primitivo correspondiente.
*/
    Double variableTipoDouble = 3.14159; // Variable tipo Double
    double variableTipoPrimitivo = variableTipoDouble; // Conversión implícita (autounboxing)
        System.out.println("La variable double es: " + variableTipoPrimitivo);
        /*
        2) De manera explicita usando el metodo "doubleValue" que se encuentra disponible
        en el objeto tipo Double.
        */
        Double variableTipoDouble2 = 2.14159; // Variable tipo Double
        double variableTipoPrimitivo1 = variableTipoDouble2.doubleValue(); // Conversión explícita
        System.out.println("La variable double explicita es: " + variableTipoPrimitivo1);
    }
}

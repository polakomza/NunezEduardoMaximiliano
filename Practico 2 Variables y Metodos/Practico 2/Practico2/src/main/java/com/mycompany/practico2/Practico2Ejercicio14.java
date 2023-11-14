/*
Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int
y su contraparte por referencia ejemplo Integer.
 */
package com.mycompany.practico2;



public class Practico2Ejercicio14 {
    public static void main(String[] args) {
        
        // Datos primitivos (por valor)
        int valorPrimitivo = 10;
        int copiaValorPrimitivo = valorPrimitivo;

        valorPrimitivo = 20; // La copia no se ve afectada

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Copia del primitivo: " + copiaValorPrimitivo);

        // Clases (por referencia)
        Integer valorReferencia = 30;
        Integer copiaValorReferencia = valorReferencia;
        // La copia sí se ve afectada aunque hace referencia
        //al Integer que es el objeto original por lo que la salida mostrara 30
        valorReferencia = 40; 
        

            System.out.println("Valor por referencia: " + valorReferencia);
            System.out.println("Copia por referencia: " + copiaValorReferencia);
    }
}

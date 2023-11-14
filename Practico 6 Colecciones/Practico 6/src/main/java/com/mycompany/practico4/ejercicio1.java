/*
Crea un ArrayList<Integer>, asignar los valores numéricos manualmente
(los que tú quieras) hasta ingresar un valor menor a 0, mostrar los
números por pantalla. Solicite los números mediante un bucle.
*/
package com.mycompany.practico4;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números enteros (ingrese un número negativo para detenerse):");

        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            numeros.add(numero);
        }

        // Mostrar los números ingresados
        System.out.println("Números ingresados:");
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}

/*
Desarrolle un programa que ayude a una cajera a determinar el número de
billetes y monedas que se necesitan de cada una de las siguientes
denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y
0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es
1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2
billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos.
*/
package com.mycompany.practico2;

import java.util.Scanner;

public class Practico2Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pido el ingreso del dinero y guardo el valor en la variable double cantidad
        System.out.print("Ingrese la cantidad de dinero: ");
        double cantidad = sc.nextDouble();
        //Llamo a mi metodo calcularCambio
        calcularCambio(cantidad);
    }
        //Declaro el metodo calcularCambio
    public static void calcularCambio(double cantidad) {
        //Creo arrays donde guardar las denominaciones de billetes y monedas
        int[] denominaciones = {200, 100, 50, 20, 10, 5, 2, 1};
        double[] monedas = {0.50, 0.25, 0.10, 0.05};
        //Muestro mensaje para dar inicio al calculo del cambio
        System.out.println("El cambio para " + cantidad + " es:");
        //Creo un bucle for each para los billetes
        for (int denominacion : denominaciones) {
        //Divido la cantidad ingresada por el array denominaciones
            int cantidadDenominacion = (int)(cantidad / denominacion);
        //Creo un if donde verifique que si la cantidad de billetes es mayor a 0, calcule cuantos necesito de cada uno
            if (cantidadDenominacion > 0) {
                System.out.println(cantidadDenominacion + " billetes de " + denominacion);
        //Resto la cantidad total representada
                cantidad -= cantidadDenominacion * denominacion;
            }
        }
        //Creo un bucle for each para las monedas
        for (double moneda : monedas) {
        //Divido la cantidad ingresada por el array monedas
            int cantidadMoneda = (int)(cantidad / moneda);
        //Creo un if donde verifique que si la cantidad de monedas es mayor a 0, calcule cuantos necesito de cada uno
            if (cantidadMoneda > 0) {
                System.out.println(cantidadMoneda + " monedas de " + moneda);
        //Resto la cantidad total representada
                cantidad -= cantidadMoneda * moneda;
            }
        }
    }
}

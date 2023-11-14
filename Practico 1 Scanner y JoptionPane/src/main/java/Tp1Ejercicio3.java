/*Actividad 3: Declara dos variables numéricas (con el valor que desees),
muestra por consola la suma, resta,multiplicación, división y módulo 
(resto de la división).*/


import java.util.Scanner;


public class Tp1Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio realizado con clase "Scanner".
        System.out.println("Ingrese 2 numeros");
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double modulo = numero1 % numero2;
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Resta de los valores: " + resta);
        System.out.println("Multiplicacion de los valores: " + multiplicacion);
        System.out.println("Division de los valores: " + division);
        System.out.println("Modulo de los valores: " + modulo);
    }
}

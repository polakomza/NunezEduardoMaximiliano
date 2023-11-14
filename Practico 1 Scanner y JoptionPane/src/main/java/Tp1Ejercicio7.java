/*Actividad 7: Muestra los números del 1 al 100 (ambos incluidos). 
Usa un bucle while.*/


import java.util.Scanner;


public class Tp1Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio realizado con clase "Scaneer".
        int numero=1;
        while (numero<=100){
        System.out.println(numero);
        numero++;
        }
    }
}
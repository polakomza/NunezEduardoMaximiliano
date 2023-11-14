/*Actividad 1: Declara un String que contenga tu nombre, después muestra un
mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me
aparezca “Bienvenido Fernando”.*/


import java.util.Scanner;


public class Tp1Ejercicio1 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "Scanner".
        Scanner sc = new Scanner(System.in);
        
        String nombre = "Maximiliano";
        System.out.println("Bienvenido " + nombre);
    }
}

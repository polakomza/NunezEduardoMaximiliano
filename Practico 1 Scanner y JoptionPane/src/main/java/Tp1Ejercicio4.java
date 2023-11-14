/*Actividad 4: Declara 2 variables numéricas (con el valor que desees),
he indica cual es mayor de los dos. Si son iguales indicarlo también. 
Ver cambiando los valores para comprobar que funciona.*/


import java.util.Scanner;


public class Tp1Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio realizado con clase "Scanner".
        System.out.println("Ingrese el primer n°");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo n°");
        int numero2 = sc.nextInt();
        
        if(numero1>numero2){
            System.out.println("El n°: "+numero1+" es el mayor.");
        }
        else if(numero2>numero1){
        System.out.println("El n°: "+numero2+" es el mayor.");
        }
        else{
        System.out.println("Los numeros son iguales");
        }
    }
}
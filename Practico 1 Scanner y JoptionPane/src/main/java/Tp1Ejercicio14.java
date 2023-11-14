/*Actividad 14: Codifique un porograma de consola en java que permita realizar las siguientes acciones:
Generar un numero aleatorio entre 0 y 100, una vez generado el umero codifique la logica necesaria para
encontrar el numero aleatorio ayudando el usuario informando al mismo si el numero ingresado es mayor
o menor al numero aleatorio buscado. Una vez encontrado el numero muestre la cantidad de intentos para lograrlo.*/


import java.util.Scanner;

public class Tp1Ejercicio14 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "Scanner".
        Scanner sc = new Scanner(System.in);
        
        int NumRandom = Double.valueOf(Math.random()*100).intValue();
        boolean condision = false;
        int intentos = 1;
        
        System.out.println("Ingrese un numero entre el 0 y el 100");
        int numero = sc.nextInt();
        
        while(condision==false){
            if(numero==NumRandom){
                condision=true;
            }
            else if(numero>NumRandom){
                System.out.println("Muy Alto");
                intentos=intentos+1;
                numero = sc.nextInt();
            }else{
                System.out.println("Muy Bajo");
                intentos=intentos+1;
                numero = sc.nextInt();
            }
        }
        
        System.out.println("Numero encontrado. Cantidad de intentos= "+intentos);
    } 
} 


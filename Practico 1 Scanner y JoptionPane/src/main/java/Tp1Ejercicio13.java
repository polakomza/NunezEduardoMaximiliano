/*Actividad 13: Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel 
solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible 
entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e 
ir comprobando que si es divisible desde ese número hasta 1.
NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.*/


import java.util.Scanner;

public class Tp1Ejercicio13 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "Scanner".
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Ingrese un nº");
        int numero = sc.nextInt();
        
        if(numero>1){
        for(int x=numero;x>=1;x--){
            if(numero%x==0){
                contador=contador+1;
            }
        }
        if(contador==2){
            System.out.println("El nº ingresado ES Primo");
        }
        else{
            System.out.println("El nº ingresado NO es Primo");
        }
        }
    } 
} 

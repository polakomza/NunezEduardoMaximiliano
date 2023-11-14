/*Actividad 10: Lee un número por teclado y compruebe que este número es mayor 
o igual que cero, si no lo es lo volverá a pedir (do while), después muestra
ese número por consola.*/


import java.util.Scanner;

public class Tp1Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio realizado con clase "Scaneer".
        int numero;
        do{
            System.out.println("Ingrese un número mayor o igual a 0:");
            numero = sc.nextInt();
        }while(numero<0);
        System.out.println("El numero ingresado es: "+numero);
    }
}

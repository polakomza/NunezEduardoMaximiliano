/*Actividad 2: Modifica la aplicación anterior, para que nos pida el nombre
que queremos introducir (aplica Scanner y JOptionPane).*/


import java.util.Scanner;
import javax.swing.JOptionPane;


public class Tp1Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ejercicio realizado con clase "Scanner".
        System.out.println("Ingrese su Nombre:");
        String nombre1 = sc.nextLine();
        System.out.println("Bienvenido " + nombre1 + ".");
        
        //Ejercicio realizado con clase "JOptionPane".
        String nombre2 = JOptionPane.showInputDialog("Ingrese su nombre:");
        System.out.println("Bienvenido " + nombre2 + ".");

    }
}

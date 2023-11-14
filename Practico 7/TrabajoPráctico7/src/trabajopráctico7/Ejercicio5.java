
package trabajopráctico7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> ascendente = new ArrayList<Integer>();
        ArrayList<Integer> descendente = new ArrayList<Integer>();
        
        System.out.println("Ingrese los valores del arreglo:");
        for(int i=0; i<10; i++){
            System.out.print("numeros[" + i + "] = ");
            numeros.add(sc.nextInt());            
        }
        
        Collections.sort(numeros);
        ascendente.addAll(numeros);
        Collections.reverse(numeros);
        descendente.addAll(numeros);
             
        System.out.println("\n-Ascendente-");
        for(int i:ascendente){
            System.out.print("[" + i + "]");
        }
        System.out.println("");               
        
        System.out.println("-Descendente-");
        for(int i:descendente){
            System.out.print("[" + i + "]");
        }
        System.out.println("");        
    }    
}

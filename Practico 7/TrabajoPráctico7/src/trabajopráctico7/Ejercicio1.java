
package trabajopráctico7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Integer num;        
        
        System.out.println("Ingrese los números para el arreglo:");
        do{
            num = entrada.nextInt();
            if(num>0){
                numeros.add(num);
            }
        } while(num>0);
                        
        for(Integer i:numeros){
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }    
}

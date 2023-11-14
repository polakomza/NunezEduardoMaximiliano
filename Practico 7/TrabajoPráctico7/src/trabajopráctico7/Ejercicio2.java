
package trabajopráctico7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Double> arreglo = new ArrayList<Double>();
                     
        System.out.println("Ingrese los números para el arreglo:");
        for(int i=0; i<20; i++){   
            System.out.print("arreglo[" + i + "] = ");
            arreglo.add(entrada.nextDouble());            
        }
        System.out.println();
        
        double mayor=arreglo.get(0), menor=arreglo.get(0);
        for(int i=0; i<20; i++){
            System.out.print("[" + arreglo.get(i) + "]");
            
            if(arreglo.get(i) > mayor){
                mayor = arreglo.get(i);
            }
            if(arreglo.get(i) < menor){
                menor = arreglo.get(i);
            }
        }
        System.out.println("\n---------------------");
        System.out.println("El mayor número del arreglo es " + mayor + ", y el menor número del arreglo es " + menor);
        System.out.println("El rango entre ambos valores es " + (mayor-menor));               
    }    
}


package trabajopráctico7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> valores = new ArrayList<Integer>();
        for(int i=0; i<50; i++){
            valores.add((int)Math.floor(100* Math.random()));
            System.out.print("[" + valores.get(i) + "]");
        }
        System.out.println("");
        System.out.println("¿Qué valor desea buscar?");
        int num = sc.nextInt();
        
        boolean condicion = false;        
        int indice = 1;
        
        for(Integer valor: valores){
            if(num == valor){
                condicion = true;                
                break;
            }                
            indice++;            
        }
        
        if(condicion == true){
            System.out.println("El número ingresado se encuentra dentro del arreglo, en la posición N°" + indice);
        } else{
            System.out.println("No se encuentró dicho número");
        }
    }       
}
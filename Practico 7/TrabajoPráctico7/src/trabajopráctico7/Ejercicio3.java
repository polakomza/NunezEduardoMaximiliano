
package trabajopráctico7;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int suma=0, mayor=0, menor=0, igual=0, n;        
        
        for(int i=0; i<20; i++){                        
            do{
                n = (int)Math.floor(100* Math.random());                                       
            } while(n%2 != 0);   
            
            numeros.add(n);
            suma += n;
        }              
        int promedio = suma/20;
        
        for(Integer num:numeros){
            System.out.print("[" + num + "]");
            
            if(num == promedio){
                igual++;
            } else if(num > promedio){
                mayor++;
            } else{
                menor++;
            }           
        }
        System.out.println("\n-----------------------------");
        System.out.println("El promedio de los números generados es " + promedio);
        System.out.println(igual + " números son iguales al promedio");
        System.out.println(mayor + " números son mayores al promedio");
        System.out.println(menor + " números son menores al promedio");                        
    }    
}

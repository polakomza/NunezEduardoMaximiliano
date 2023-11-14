
package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {
    static Scanner texto = new Scanner(System.in);        
    static Scanner num = new Scanner(System.in);
    
    public static void main(String[] args){        
        
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
        String valor;
        int fila, columna;
        boolean salida = false;
        
        System.out.println("Indique que valor desea agregar a la matriz, o ingrese 'FIN' para salir del programa");
        do{            
            System.out.print("Valor -> ");
            valor = texto.nextLine().toUpperCase();            
            
            if(valor.equals("FIN")){                                
                mostrarMatriz(matrizCuadrada);                
                salida = true;
            } else{
                
                System.out.print("Fila: ");
                fila = num.nextInt();
                System.out.print("Columna: ");
                columna = num.nextInt();    
                System.out.println();
                
                matrizCuadrada.add(new Celda(fila, columna, valor));
            }                        
        } while(salida == false);
        
        buscarValor(matrizCuadrada);
    }    
    
    public static void buscarValor(ArrayList<Celda> matrizCuadrada){
        boolean condicion;
        int fila, columna, opcion;
        
        do{            
            System.out.println("Ingrese los datos de fila y columna para conocer el valor de la celda"); 
            System.out.print("Fila: ");
            fila = num.nextInt();
            System.out.print("Columna: ");        
            columna = num.nextInt();
            
            condicion = false;
            for(Celda celda:matrizCuadrada){
                if(fila==celda.getFila() && columna==celda.getColumna()){
                    System.out.println("\n- El valor ubicado en la posición ingresada es: " + celda.getValor() + " -");
                    condicion = true;                
                    break;
                }                       
            }                      
            
            if(condicion == false){
                System.out.println("\n- A dicha posición no se le ha asignado ningún valor -");
            }
            
            System.out.print("\n1.Para buscar otro dato\n2.Para finalizar el programa\n-> ");
            opcion = num.nextInt();            
            
        } while(opcion == 1);        
    }
    
    public static void mostrarMatriz(ArrayList<Celda> matrizCuadrada){
        System.out.println("-----------------------------");
        System.out.println("-MATRIZ-");
        
        for(Celda celda:matrizCuadrada){
            System.out.println(celda.mostrarContenidoCelda());  
        }
        
        System.out.println("-----------------------------");
    }
}

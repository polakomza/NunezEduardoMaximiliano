
package Ejercicio1;

import java.util.Scanner;
import java.util.HashMap;

public class TrabajoPráctico9 {    
    
    static Scanner texto = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    static HashMap<String,Long> agenda = new HashMap<String,Long>();    
    
    public static void main(String[] args) {                               
        while(true){            
            System.out.println("────── CONTACTOS ──────");
            System.out.print("1. Cargar datos en la agenda \n2. Buscar teléfono por nombre \n3. Ver agenda \n4. Salir del programa \n→ ");
            int opcion = num.nextInt();
                        
            switch(opcion){
                case 1:                                
                    cargarDatos();
                    break;
                case 2:
                    buscarTelefono();
                    break;
                case 3:
                    mostrarAgenda();
                    break;                                
            }
            
            if(opcion==4){
                break;
            }                                    
        }    
    }    
    
    public static void cargarDatos(){
        System.out.println("\nIngrese la información del contacto en formato 'Nombre Apellido Número' o bien 'Nombre Número'\nPara finalizar la carga, presione enter:\n");        
        
        while(true){
            String infoContacto = texto.nextLine();
                                    
            if(infoContacto.equals("")){
                break;
            }
            
            String[] datos = infoContacto.split(" ");
            
            String nombre = "";
            for(int i=0; i<datos.length-1; i++){
                nombre += datos[i] + " ";
            }
            
            Long numero = Long.parseLong(datos[datos.length-1]);
                                                            
            if(agenda.containsKey(nombre) || agenda.containsValue(numero)){
                System.out.println("(El nombre o número ya fue agendado)");
                continue;
            }            
            agenda.put(nombre, numero);            
        }                
    }
    
    public static void buscarTelefono(){
        System.out.print("\nNombre: ");
        String nombreBuscado = texto.nextLine() + " ";
                
        if(agenda.containsKey(nombreBuscado)){
            System.out.println("Número de teléfono: " + agenda.get(nombreBuscado));
        } else{
            System.out.println("(Esa persona no se encuentra en tu agenda)");
        }
        System.out.println();
    }
    
    public static void mostrarAgenda(){
        System.out.println("\nAGENDA");
        for(String i:agenda.keySet()){
            System.out.println("." + i + completarEspacios(i) + agenda.get(i));            
        }
        System.out.println();
    }
    
    public static String completarEspacios(String nombre){
        int espaciosNum = 20 - nombre.length();
        String espacios = "";
        for(int i=0; i<espaciosNum; i++){
            espacios = espacios + " ";
        }        
        return espacios;
    }    
}   


package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    static Scanner texto = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    
    public static void main(String[] args){
        
        ArrayList<Plato> platosMenu = new ArrayList<Plato>();
        
        int opcion = 1;
        do{
            System.out.println("-Ingrese los datos del plato-");
            System.out.print("Nombre: ");
            String nombreCompleto = texto.nextLine();
            System.out.print("Precio: ");
            double precio = num.nextDouble();
            
            System.out.print("¿Es bebida? (Si/No)\n-> ");        
            String entrada = texto.nextLine();
            boolean esBebida = false;                      
                
            if(entrada.equals("si")){
                esBebida = true;
            } else if (entrada.equals("no")){
                esBebida = false;
            }
            
            if(esBebida == false){
                ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
                cargarIngredientes(ingredientes);
                
                platosMenu.add(new Plato(nombreCompleto,precio,esBebida,ingredientes));                                                   
            } else{
                platosMenu.add(new Plato(nombreCompleto,precio,esBebida));
            }                                              
            
            System.out.print("\n1. Para cargar otro plato \n2. Para mostrar menú\n-> ");
            opcion = num.nextInt();
            System.out.println();            
            
        } while(opcion == 1);        
        
        System.out.println("-------------------- MENÜ --------------------");                
        mostrarMenu(platosMenu);        
    }
    
    public static void cargarIngredientes(ArrayList<Ingrediente> ingredientes){
        System.out.print("¿Cuántos ingredientes lleva el plato? ");
        int cantIngredientes = 0;
        do{
            cantIngredientes = num.nextInt();
            if(cantIngredientes<1){
                System.out.println("Debe ingresar al menos una nota");
            }
        } while(cantIngredientes<1);
        System.out.println();
        
        for(int i=0; i<cantIngredientes; i++){
            System.out.print("Ingrediente: ");
            String nombre = texto.nextLine();
            System.out.print("Unidad de medida: ");
            String unidadDeMedida = texto.nextLine();
            System.out.print("Cantidad: " );
            double cantidad = num.nextDouble();
            
            ingredientes.add(new Ingrediente(nombre,unidadDeMedida,cantidad));
        }
    }
    
    public static void mostrarMenu(ArrayList<Plato> platosMenu){
        for(Plato i:platosMenu){            
            i.mostrarDatos();
            System.out.println("----------------------------------------------");
        }
    }
}

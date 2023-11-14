
package Ejercicio2;

import Ejercicio1.TrabajoPráctico9;
import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {
    static Scanner texto = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    
    public static void main(String[] args){
        int opcion = 1;
        
        while(opcion==1){            
            Computadora pc = new Computadora();
            
            System.out.println("\n-Ingrese los datos de la computadora-");
            
            System.out.print("Marca: ");
            String marca = texto.nextLine();
            pc.setMarca(marca);
                        
            System.out.print("Modelo: ");
            String modelo = texto.nextLine();
            pc.setModelo(modelo);
            
            HashSet<ComponenteCPU> partes = cargarComponentes();
            pc.setPartes(partes);
            
            System.out.println("-----------------------------------------------------------");            
            pc.mostrarComponentes();
            calcularPrecios(partes);
            System.out.println("-----------------------------------------------------------");            
            
            System.out.print("Seleccione una opción \n1. Para cotizar otra computadora \n2. Para salir \n→ ");
            opcion = num.nextInt();
        }                           
    }
    
    public static HashSet<ComponenteCPU> cargarComponentes(){
        System.out.print("\nIndique la cantidad de componentes que va a llevar: \n→ ");
        int cantPartes = num.nextInt();
        
        HashSet<ComponenteCPU> partes = new HashSet<ComponenteCPU>();
                
        for(int i=0; i<cantPartes; i++){
            System.out.println("\nCOMPONENTE N°" + (i+1));
            System.out.print("   Componente: ");
            String componente = texto.nextLine();
            
            System.out.print("   Marca: ");
            String marca = texto.nextLine();
            
            System.out.print("   Cantidad: ");
            int cantidad = num.nextInt();
            
            System.out.print("   Precio: ");
            double precio = num.nextDouble();
            
            partes.add(new ComponenteCPU(componente,marca,cantidad,precio));            
        }                
        return partes;
    }
    
    public static void calcularPrecios(HashSet<ComponenteCPU> partes){
        double total, subTotal = 0;
        
        for(ComponenteCPU i:partes){
            subTotal += i.getCantidad()*i.getPrecio();
        }
        System.out.println("\nTotal componenetes _______ $" + subTotal);
                
        if(subTotal<50000){
            total = subTotal*1.4;
            System.out.println("Recargo __________________ $" + subTotal*0.4);
        } else{
            total = subTotal*1.3;
            System.out.println("Recargo __________________ $" + subTotal*0.3);       
        System.out.println("Monto final ______________ $" + total);
        }
    }
}


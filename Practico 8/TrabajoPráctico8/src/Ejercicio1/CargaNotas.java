
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    static Scanner texto = new Scanner(System.in);
    static Scanner num = new Scanner(System.in);
    
    public static void main(String[] args){        
                
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        int opcion = 1;
        do{
            System.out.println("-Ingrese los datos del alumno-");
            System.out.print("Nombre y apellido: ");
            String nombreCompleto = texto.nextLine();
            System.out.print("Número de legajo: ");
            long legajo = num.nextLong();
            
            ArrayList<Nota> notas = new ArrayList<Nota>();
            cargarNotas(notas);
            
            alumnos.add(new Alumno(nombreCompleto,legajo,notas));                                   
            
            System.out.print("\n1. Para cargar otro alumno \n2. Para mostrar datos \n-> ");
            opcion = num.nextInt();
            System.out.println();
            
        } while(opcion == 1);        
        
        System.out.println("----------------------------------------");
        mostrarInformacionAlumno(alumnos);
    }    
    
    public static void cargarNotas(ArrayList<Nota> notas){        
        System.out.print("\n¿Cuántas notas desea cargar? ");        
        
        int cantNotas = 0;
        do{
            cantNotas = num.nextInt();
            if(cantNotas<1){
                System.out.println("Debe ingresar al menos una nota");
            }
        } while(cantNotas<1);
        
        for(int i=0; i<cantNotas; i++){
            System.out.print("Cátedra: ");
            String catedra = texto.nextLine();
            System.out.print("Nota exámen: ");
            double notaExamen = num.nextDouble();
                       
            notas.add(new Nota(catedra,notaExamen));            
        }
    }
    
    public static void mostrarInformacionAlumno(ArrayList<Alumno> alumnos){
        for(Alumno i:alumnos){
            i.mostrarDatos();            
            System.out.println("----------------------------------------");
        }
    }
}

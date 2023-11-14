/*
3- Modifique los algoritmos de ordenamiento anteriores (inserción, burbuja, selección)
para que además de la lista a ordenar revisan como parámetro un “String orden”, cuyo
valor será “ASC” o “DESC”, que permita definir si la lista debe ordenarse de forma
ASCENDENTE o DESCENDENTE.
*/
import java.util.Scanner;

public class Ejer_3 {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ASC o DESC para que le mostremos los numeros del arreglo en forma Ascendente o Descendente");
        String forma = sc.nextLine();
        
            int arreglo[] = {3,8,6,1,4,2}; 
        
    switch (forma.toLowerCase()) {
            case "asc":
                mostrarArreglo(arreglo);
                ordenamientoInsercion(arreglo);
                mostrarArreglo(arreglo);
                ordenamientoSeleccion(arreglo);
                mostrarArreglo(arreglo);
                burbuja(arreglo);
                mostrarArreglo(arreglo);
                break;
            case "desc":
                mostrarArreglo(arreglo);
                ordenamientoInsercion(arreglo);
                mostrarArregloDesc(arreglo);
                ordenamientoSeleccion(arreglo);
                mostrarArregloDesc(arreglo);
                burbuja(arreglo);
                mostrarArregloDesc(arreglo);
                break;
            default:
                break;
        }
    }    
    
    public static void mostrarArreglo(int arre[]){
        System.out.println("El arreglo esta de la siguiente manera: ");
        for (int i = 0; i < arre.length; i++){
            System.out.print("[" +arre[i]+"]");
        }        
        System.out.println("");
    }
    public static void mostrarArregloDesc(int arre[]){
        System.out.println("El arreglo esta de la siguiente manera: ");
        for (int i = (arre.length-1); i >= 0; i--){
            System.out.print("[" +arre[i]+"]");
        }        
        System.out.println("");
    }       
    public static void ordenamientoInsercion(int[] a) {
        System.out.println("Ordenamiento por insercion");
        for (int i = 0; i < a.length; i++){
            int valor = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > valor){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = valor;
        }
    }
//    public static void ordenamientoInsercionDesc(int[] a) {
//        System.out.println("Ordenamiento por insercion");
//        for (int i = 0; i < a.length; i++){
//            int valor = a[i];
//            int j = i-1;
//            while (j >= 0 && a[j] < valor){
//                a[j+1] = a[j];
//                j--;
//            }
//            a[j+1] = valor;
//        }
//    }
    public static void burbuja(int[] a) {
        System.out.println("Algoritmo de burbuja");
        int n = a.length;
        boolean intercambio = false;  
        do{          
            for (int i = 1; i < n; i++){
                if(a[i-1] > a[i]){
                    int aux = a[i-1];
                    a[i-1] = a[i];
                    a[i] = aux;
                    intercambio = true;
                }
            }
        } while (intercambio == true); 
    }
//    public static void burbujaDesc(int[] a) {
//        System.out.println("Algoritmo de burbuja");
//        int n = a.length;
//        boolean intercambio = false;  
//        do{          
//            for (int i = 1; i < n; i++){
//                if(a[i-1] < a[i]){
//                    int aux = a[i-1];
//                    a[i-1] = a[i];
//                    a[i] = aux;
//                    intercambio = true;
//                }
//            }
//        } while (intercambio == true); 
//    }
    public static void ordenamientoSeleccion(int[] a) {
        System.out.println("Ordenamiento por seleccion");
        int n = a.length;
        for (int i = 1; i < n-1; i++){
            int minimo = i;
            for (int j = i+1; j < n; j++){
                if(a[j]< a[minimo]){
                    minimo = j;
                }
            }
            int aux = a[minimo];
                a[minimo] = a[i];
                a[i] = aux;
        }
    }
}
//    public static void ordenamientoSeleccionDesc(int[] a) {
//        System.out.println("Ordenamiento por seleccion");
//        int n = a.length;
//        for (int i = 1; i < n-1; i++){
//            int minimo = i;
//            for (int j = i+1; j < n; j++){
//                if(a[j]> a[minimo]){
//                    minimo = j;
//                }
//            }
//            int aux = a[minimo];
//                a[minimo] = a[i];
//                a[i] = aux;
//        }
//    }


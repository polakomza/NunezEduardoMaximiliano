/*
2- Codifique mediante código JAVA los pseudocódigos de los algoritmos fundamentales
presentados en el apunte “Algoritmos Fundamentales” correspondiente.
 Ordenamiento por inserción
 Algoritmo de la burbuja
 Ordenamiento por selección
 Búsqueda secuencial
 */
import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int arreglo[] = {3,8,6,1,4,2}; 
        System.out.println("El arreglo esta de la siguiente manera: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("[" +arreglo[i]+"]");
        }
        System.out.println("");
        OrdenamientoInsercion(arreglo);
        System.out.println("El arreglo con ordenamiento por insercion queda: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("[" +arreglo[i]+"]");
        }
        System.out.println("");
        burbuja(arreglo);
        System.out.println("El arreglo con el algoritmo de la burbuja queda: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("[" +arreglo[i]+"]");
        }
        System.out.println("");
        ordenamientoSeleccion(arreglo);
        System.out.println("El arreglo con el ordenamieno de seleccion queda: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("[" +arreglo[i]+"]");
        }
        System.out.println("");
        System.out.println("Ingrese el numero de un alumno para saber si se encuentra");
        int num = sc.nextInt();
        busquedaSecuencial(arreglo, num);
        
        
    }
    public static void OrdenamientoInsercion(int[] a) {
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
    public static void burbuja(int[] a) {
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
    public static void ordenamientoSeleccion(int[] a) {
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
    
    public static void busquedaSecuencial(int[] lista, int alumno) {
        int n = lista.length;
        boolean seEncontro = false;
        for (int i = 0; i < n; i++){
        if(lista[i] == alumno){
            seEncontro = true;   
        }
        }
        if (seEncontro == false) {
            System.out.println("El alumno " + alumno + " no esta en el arreglo");
        } else {
            System.out.println("El alumno " + alumno + " si esta en el arreglo");
        }
    }
}

/*
4- Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos
enteros. Finalizada la carga de los 20 elementos el programa debe solicitar como se
desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento
aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el
algoritmos fundamental de ordenamiento que corresponda. Muestre por pantalla el
array original desordenado y su resultante ordenado según las opciones elegidas
 */
import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ASC o DESC para que le mostremos los numeros del arreglo en forma Ascendente o Descendente");
        String orden = sc.nextLine();
        System.out.println("Ingrese que tipo de ordenamiento quiere");
        System.out.println("1: Insercion. 2: Burbuja. 3: Seleccion");
        int tipoOrdenamiento = sc.nextInt();
        int arreglo[] = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero para la posicion: "+ (i+1));
            arreglo[i] = sc.nextInt();
        } 
        switch (orden.toLowerCase()) {
            case "asc":
                eleccionOrdenamiento(arreglo, tipoOrdenamiento);
                break;
            case "desc":
                eleccionOrdenamientoDesc(arreglo, tipoOrdenamiento);
                break;
            default:
                break;
        }
    }    
    
    public static void mostrarArreglo(int[] arre){
        System.out.println("El arreglo esta de la siguiente manera: ");
        for (int i = 0; i < arre.length; i++){
            System.out.print("[" +arre[i]+"]");
        }        
        System.out.println("");
    }
    public static void mostrarArregloDesc(int[] arre){
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
    public static void burbuja(int[] a) {
        System.out.println("Algoritmo de burbuja");
        int n = a.length;
        boolean intercambio; 
        do{          
            intercambio = false; 
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
        System.out.println("Ordenamiento por seleccion");
        int n = a.length;
        for (int i = 0; i < n-1; i++){
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
    public static void eleccionOrdenamiento(int[] arreglo, int eleccion) {
        
        switch (eleccion) {
            case 1:
                mostrarArreglo(arreglo);
                ordenamientoInsercion(arreglo);
                mostrarArreglo(arreglo);
                break;
            case 2:
                mostrarArreglo(arreglo);
                burbuja(arreglo);
                mostrarArreglo(arreglo);
                break;
            case 3:
                mostrarArreglo(arreglo);
                ordenamientoSeleccion(arreglo);
                mostrarArreglo(arreglo);
                break;
            default:
                break;
            }
    }
    public static void eleccionOrdenamientoDesc(int[] arreglo, int eleccion){
        switch (eleccion) {
            case 1:
                mostrarArreglo(arreglo);
                ordenamientoInsercion(arreglo);
                mostrarArregloDesc(arreglo);
                break;
            case 2:
                mostrarArreglo(arreglo);
                burbuja(arreglo);
                mostrarArregloDesc(arreglo);
                break;
            case 3:
                mostrarArreglo(arreglo);
                ordenamientoSeleccion(arreglo);
                mostrarArregloDesc(arreglo);
                break;
            default:
                break;
        }
    }
}
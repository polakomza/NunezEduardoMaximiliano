/*
5- Codifique un algoritmo que solicite un 2 valores enteros mayores o iguales a 2, que se
corresponden a cantidad de filas y columnas. Cree un arreglo de tamaño[X,Y]de tipo
entero, el tamaño se corresponde a los 2 valores enteros ingresados inicialmente.
Solicite al usuario que ingrese números enteros para cargar cada una de las celdas de
la matriz. Finalizada la carga calcule el promedio entero de los elementos asignados y
cargados en la matriz. Para terminar determine si el promedio calculado se encuentra
asignado en alguna de las celdas, si es así indique la posición o posiciones
correspondientes, caso contrario muestre el mensaje “No se encontró ninguna
coincidencia”.
Ejemplo: Ingreso 3 y 4 como valores enteros
Creo la matriz 3 filas por 4 columnas y cargo los valores:
|3|15|6|9|
|6|13|4|4|
|14|8|5|7|
El promedio entero es: 7
El valor 7 se encuentra en la posición con índice (2,3) o Fila 3, Columna 4
*/
import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ;
        do {
            System.out.println("Ingrese numero entero X mayor o igual a 2 ");
            x = sc.nextInt();
        }while(x<2 );
        int y;
        do {
            System.out.println("Ingrese numero entero Y mayor o igual a 2 ");
            y = sc.nextInt();
        } while(y<2 );
        int [][] array=new int[x][y];
        int suma=0;
        int div=x*y;
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.println("Ingrese un valor en la fila "+i+" columna "+j);
                array[i][j]=sc.nextInt();
                suma=suma+array[i][j];
            }
        }
        System.out.println("El array quedaria de esta manera");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int promedio=suma/div;
        System.out.println("El promedio es de "+promedio);
        boolean encontrado = false;
        for (int i=0; i <array.length; i++){
            for (int j=0; j< array[0].length; j++){
                if (promedio == array[i][j]){
                    encontrado = true;
                    System.out.println("El valor " + promedio + " se encuentra en la posición con índice " + "(" + i + "," + j + ")" + " o Fila " + (i+1) + ", Columna " + (j+1));
                }
            }
        }
        if (!encontrado) System.out.println("No se encontró ninguna coincidencia");
    }
}


package com.mycompany.mutantes;


import java.util.Random;


public class Mutantes {

    public static void main(String[] args) {
        
        //Declaración array para almacenar elementos(filas) con seis letras
        String secuenciaAdn[];
        secuenciaAdn = new String[6];
        
        //Import clase random
        Random aleatorio = new Random();
        
        //Hago un set de caracteres
        String setOfCharacters = "ATCG";
        int randomInt;
        char randomChar;
        String filaString = "";
        
        //Bucle for para agregar los caracteres aleatorios al array
                for (int i = 0; i < secuenciaAdn.length; i++) {
                    for (int j = 0; j < secuenciaAdn.length; j++) {
                        // Obtenemos un índice random del String
                        randomInt = aleatorio.nextInt(setOfCharacters.length());
                        // Obtener el caracter aleatorio a partir del índice random
                        randomChar = setOfCharacters.charAt(randomInt);
                        // Generar string del array que sería una fila de nuestra matriz a crear.
                        filaString += randomChar;
                    }

            // Verificar si la fila tiene al menos 6 caracteres antes de agregarla al array
            if (filaString.length() >= 6) {
                secuenciaAdn[i] = filaString;
            } else {
                // Si la fila no tiene al menos 6 caracteres, vuelve a generarla
                i--;  // Decrementa el índice para volver a intentar la misma posición
            }
            // Reinicio de la filaString
            filaString = "";
        }
        
        //Mostramos array con la secuencia adn formada
        System.out.println("Array de secuencia ADN: ");
        mostrarArray(secuenciaAdn);
        
        //Resultado final
        if(isMutant(secuenciaAdn)){
            System.out.println("LA PERSONA ES MUTANTE");
        } else {
            System.out.println("LA PERSONA NO ES MUTANTE");
        }
    } 
    
    
    public static void mostrarArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(" [" + array[i] + "] ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static void mostrarMatriz(char[][] matrizADN) {
    for (int i = 0; i < matrizADN.length; i++) {
        for (int j = 0; j < matrizADN[i].length; j++) {
            System.out.print(" [" + matrizADN[i][j] + "] ");
            }
        System.out.println("");
        }
    }
    
    
    public static boolean isMutant(String[] secuenciaADN) {
    char[][] matrizADN = new char[6][6];

    // Relleno de matriz
    for (int i = 0; i < secuenciaADN.length; i++) {
        for (int j = 0; j < secuenciaADN.length; j++) {
            // Extraer letra de cada elemento del array secuenciaADN
            char letra = secuenciaADN[i].charAt(j);
            matrizADN[i][j] = letra;
        }
    }

    // Mostrar matriz creada
    System.out.println("Matriz creada: ");
    mostrarMatriz(matrizADN);
    System.out.println("");



    boolean result;
    int cantidadSecuenciasRepetidas = 0;

    // OBTENER DIAGONALES
    String[] arrDiagonales = obtenerDiagonales(matrizADN);
    System.out.println("Array de diagonales: ");
    mostrarArray(arrDiagonales);

    // Recorrer la matriz para contabilizar las secuencias de letras iguales
    // Por cada fila se invoca a la función consecutivos que determina
    // si hay una secuencia de 4 letras iguales en dicha fila
    for (int i = 0; i < matrizADN.length; i++) {
        // Nota: Al pasarle la fila de la matriz transpuesta lo que se hace realmente es
        // valorar si existe una secuencia de 4 letras iguales en alguna COLUMNA de la matriz original
        System.out.println("Fila " + i + " de la matriz original: " + consecutivos(matrizADN[i]));

    }

    // Recorremos las diagonales, primero validamos si la diagonal tiene 4 letras como mínimo
    for (int i = 0; i < arrDiagonales.length; i++) {
        if (arrDiagonales[i].length() >= 4) {
            char[] diagonalConCuatro_o_masLetras = arrDiagonales[i].toCharArray();

            System.out.println("Diagonal: " + i + ": " + consecutivos(diagonalConCuatro_o_masLetras));

            if (consecutivos(diagonalConCuatro_o_masLetras)) {
                cantidadSecuenciasRepetidas++;
            }
        }
    }

    System.out.println("");
    // Resultado final: Si se encontró más de una secuencia de letras iguales la persona es mutante.
    result = cantidadSecuenciasRepetidas > 1;
    return result;
}
    
    
    //Recibe por parámetro un subarray que equivale a cada una de las filas 
    //de la matriz original, a su diagonal y transpuesta
    public static boolean consecutivos(char[]filaMatriz){
        char valor = ' ';
        int cantidad = 1;
        
            for (char caracter : filaMatriz) {
        if (cantidad == 4) {
            break;
        } 
        if (caracter == valor) {
            cantidad++;
        } else {
            valor = caracter;
            cantidad = 1;
        }
    }
        
        
        return (cantidad == 4);
    }
    
    //Creamos un ArrayList con todas las diagonales de la matriz
    public static String[] obtenerDiagonales(char[][] matrizADN) {
    int rows = matrizADN.length;
    int cols = matrizADN[0].length;
    
    String[] arrDiagonales = new String[(rows + cols) - 1];

    // Obtener diagonales incluyendo las inferiores a la media
    for (int i = 0; i < rows; i++) {
        StringBuilder diagonal = new StringBuilder();
        for (int j = 0; j < Math.min(rows - i, cols); j++) {
            diagonal.append(matrizADN[i + j][j]);
        }
        arrDiagonales[i] = diagonal.toString();
    }

    // Obtener diagonales superiores a la media excluida
    for (int i = 1; i < cols; i++) {
        StringBuilder diagonal = new StringBuilder();
        for (int j = 0; j < Math.min(cols - i, rows); j++) {
            diagonal.append(matrizADN[j][i + j]);
        }
        arrDiagonales[rows + i - 1] = diagonal.toString();
    }

    return arrDiagonales;
}

    
}
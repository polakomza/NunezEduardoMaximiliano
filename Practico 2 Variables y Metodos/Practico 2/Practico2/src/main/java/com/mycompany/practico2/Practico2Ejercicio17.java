/*
 Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString
 */
package com.mycompany.practico2;

import java.util.Date;

public class Practico2Ejercicio17 {
    public static void main(String[] args) {
        //Utilizacion de SimpleDateFormat que modifica el formato de la fecha
        //En la clase FuncionesPrograma.
        Date fecha= new Date();
        String fechaFormateada = FuncionesPrograma.getFechaString(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);
        //Defino las variables que pasan como parametro en la clase FuncionsPrograma
        //Para la utilizacion del tipo Date.
        int dia = 2; 
        int mes = 9; 
        int anio = 2023; 
        Date fechaDate = FuncionesPrograma.getFechaDate(dia,mes,anio);
        System.out.println("Fecha con Date: " + fechaDate);
        
    }
}

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
import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesPrograma {
    public static String getFechaString(Date fecha) {
        SimpleDateFormat retorno = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return retorno.format(fecha);
    }
        public static Date getFechaDate(int dia, int mes, int anio){
            return new Date (anio - 1900, mes - 1, dia);
        }
}

  

        


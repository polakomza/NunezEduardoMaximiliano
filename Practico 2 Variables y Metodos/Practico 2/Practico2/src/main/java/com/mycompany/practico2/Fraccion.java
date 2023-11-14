/*
20- Cree una clase Fracción con dos atributos numéricos enteros, numerador y
denominador. Agregue un constructor sobrecargado (debe contener como
parámetros el numerador y el denominador) que cree el objeto Fracción
correspondiente.
Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
……….
} 
public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
……….
}
 */
package com.mycompany.practico2;


public class Fraccion {
        int numerador;
        int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
        
    
    public Fraccion sumarFracciones(Fraccion f1,Fraccion f2){
        int aux1 = f1.numerador * f2.denominador;
        int aux2 = f1.denominador * f2.numerador;
        int numeradorResultado = aux1 + aux2;
        int denominadorResultado = f1.denominador * f2.denominador;
        
        return new Fraccion(numeradorResultado, denominadorResultado);
    } 
    public Fraccion restarFracciones(Fraccion f1,Fraccion f2){
        int aux1 = f1.numerador * f2.denominador;
        int aux2 = f1.denominador * f2.numerador;
        int numeradorResultado = aux1 - aux2;
        int denominadorResultado = f1.denominador * f2.denominador;
        
        return new Fraccion (numeradorResultado, denominadorResultado);
    }
    public Fraccion multiplicarFracciones(Fraccion f1,Fraccion f2){
        int aux1 = f1.numerador * f2.numerador;
        int aux2 = f1.denominador * f2.denominador;
        int numeradorResultado = aux1;
        int denominadorResultado = aux2;
        
        return new Fraccion(numeradorResultado, denominadorResultado);
        
      }
    public Fraccion dividirFracciones(Fraccion f1,Fraccion f2){
        int aux1 = f1.numerador * f2.denominador;
        int aux2 = f1.denominador * f2.numerador;
        int numeradorResultado = aux1;
        int denominadorResultado = aux2;
        
        return new Fraccion(numeradorResultado, denominadorResultado);
    }
    public String obtenerRepresentacion() {
        return numerador + "/" + denominador;
    }
}

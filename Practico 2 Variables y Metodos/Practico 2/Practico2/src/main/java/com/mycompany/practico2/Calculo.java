/*

 */
package com.mycompany.practico2;

import java.util.Scanner;


public class Calculo {
    public static void main(String[] args) {
        
        OperacionMatematica op = new OperacionMatematica();
        double num1,num2;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Ingrese 2 numeros para realizar operaciones");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
       
        op.setValor1(num1);
        op.setValor2(num2);
        
        op.setOperacion("+");
            double resultadosuma = op.aplicarOperacion(op.getOperacion());
            System.out.println("El resultado de la suma es: "+resultadosuma);
        op.setOperacion("-");
            double resultadoresta = op.aplicarOperacion(op.getOperacion());
            System.out.println("El resultado de la resta es: "+resultadoresta);
        op.setOperacion("*");
            double resultadomul = op.aplicarOperacion(op.getOperacion());
            System.out.println("El resultado de la multiplicacion es: "+resultadomul);
        op.setOperacion("/");
            double resultadodiv = op.aplicarOperacion(op.getOperacion());
            System.out.println("El resultado de la division es: "+resultadodiv);      
    }
}

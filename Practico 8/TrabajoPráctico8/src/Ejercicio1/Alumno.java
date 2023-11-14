
package Ejercicio1;

import java.util.ArrayList;

public class Alumno {
    
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo, ArrayList<Nota> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = notas;
    }
    
    public void mostrarDatos(){
        System.out.println("Alumno: " + nombreCompleto + "\nLegajo: " + legajo);

        System.out.println("\nCÁTEDRA" + Nota.completarEspacios("CÁTEDRA") + "NOTA");
        for(Nota i:notas){
            System.out.println(i.mostrarNotas());
        }                
        System.out.println(calcularPromedio());
    }
    
    public String calcularPromedio(){
        double promedio, suma=0;
        int cantNotas=0;
        for(Nota i:notas){
            suma += i.getNotaExamen();
            cantNotas++;
        }
        promedio = suma/cantNotas; 
        
        return "\nEl promedio del alumno es de " + promedio;
    }
       
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public long getLegajo() {
        return legajo;
    }
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public ArrayList<Nota> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }             
}


package Ejercicio2;

import java.util.ArrayList;

public class Plato {
    
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida, ArrayList<Ingrediente> ingredientes){
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = ingredientes;
    }
    
    public Plato(String nombreCompleto, double precio, boolean esBebida){
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
    }
    
    public void mostrarDatos() {
        System.out.println(nombreCompleto + "\nPrecio: $" + precio);
        
        if(esBebida == false){            
            System.out.println("\nIngrediente" + Ingrediente.completarEspacios("Ingrediente",16) + "Cant." + Ingrediente.completarEspacios("Cant.",8) + "Unidad de medida");
            for(Ingrediente i:ingredientes){
                System.out.println(i.mostrarIngrediente());
            }
        }
    }
            
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isEsBebida() {
        return esBebida;
    }
    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }            
}

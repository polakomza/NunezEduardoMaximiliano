
package Ejercicio2;

public class ComponenteCPU {
    
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    public ComponenteCPU(String componente, String marca, int cantidad, double precio) {
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String imprimirDetalles(){
        return componente + completarEspacios(componente,15) + marca + completarEspacios(marca,15) + cantidad + completarEspacios(String.valueOf(cantidad),7) + "$" + precio;
    }    
    
    public static String completarEspacios(String nombre,int num){
        int espaciosNum = num - nombre.length();
        String espacios = "";
        for(int i=0; i<espaciosNum; i++){
            espacios = espacios + " ";
        }        
        return espacios;
    }
        
                
    public String getComponente() {
        return componente;
    }
    public void setComponente(String componente) {
        this.componente = componente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

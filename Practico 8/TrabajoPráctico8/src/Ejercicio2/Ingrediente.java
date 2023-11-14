
package Ejercicio2;

public class Ingrediente {
    
    private String nombre;
    private String unidadDeMedida;
    private double cantidad;

    public Ingrediente(String nombre, String UnidadDeMedida, double cantidad) {
        this.nombre = nombre;
        this.unidadDeMedida = UnidadDeMedida;
        this.cantidad = cantidad;
    }
    
    public String mostrarIngrediente(){
        return nombre + completarEspacios(nombre,16) + cantidad + completarEspacios(String.valueOf(cantidad),8) + unidadDeMedida;
    }    
    
    public static String completarEspacios(String nombre, int num){
        int espaciosNum = num - nombre.length();
        String espacios = "";
        for(int i=0; i<espaciosNum; i++){
            espacios = espacios + " ";
        }        
        return espacios;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }
    public void setUnidadDeMedida(String UnidadDeMedida) {
        this.unidadDeMedida = UnidadDeMedida;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }            
}

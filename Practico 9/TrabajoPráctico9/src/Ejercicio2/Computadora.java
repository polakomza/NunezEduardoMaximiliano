
package Ejercicio2;

import java.util.HashSet;

public class Computadora {
    
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> partes = new HashSet<ComponenteCPU>();

    public void mostrarComponentes(){
        System.out.println("××× COMPUTADORA ×××\n");
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
        
        System.out.println("\n'Componente'" + completarEspacios("'Componente'",15) + "'Marca'" + completarEspacios("'Marca'",14) + "Cant." + completarEspacios("Cant.",8) + "Precio");
        for(ComponenteCPU i:partes){
            System.out.println(i.imprimirDetalles());
        }        
    }
    
    
    public static String completarEspacios(String nombre,int num){
        int espaciosNum = num - nombre.length();
        String espacios = "";
        for(int i=0; i<espaciosNum; i++){
            espacios = espacios + " ";
        }        
        return espacios;
    }    
        
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public HashSet<ComponenteCPU> getPartes() {
        return partes;
    }
    public void setPartes(HashSet<ComponenteCPU> componentes) {
        this.partes = componentes;
    }    
}

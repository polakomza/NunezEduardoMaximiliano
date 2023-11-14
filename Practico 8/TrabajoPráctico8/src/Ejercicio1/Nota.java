
package Ejercicio1;

public class Nota {
    
    private String catedra;
    private double notaExamen;

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }
    
    public String mostrarNotas(){
        return catedra + completarEspacios(catedra) + notaExamen;
    }
    
    public static String completarEspacios(String nombreCatedra){
        int espaciosNum = 16 - nombreCatedra.length();
        String espacios = "";
        for(int i=0; i<espaciosNum; i++){
            espacios = espacios + " ";
        }        
        return espacios;
    }
    
    public String getCatedra() {
        return catedra;
    }
    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
    public double getNotaExamen() {
        return notaExamen;
    }
    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }                    
}

/*Actividad 12: Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no 
(siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número 
ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.*/


import javax.swing.JOptionPane;

public class Tp1Ejercicio12 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "JOptionPane".
        
        String DiaSemanal = JOptionPane.showInputDialog("Ingrese un nº del 1 al 7");
        int Dia = Integer.parseInt(DiaSemanal);
        
        switch(Dia){
            case 1: JOptionPane.showMessageDialog(null, "Dia Laboral");
                break;
             case 2: JOptionPane.showMessageDialog(null, "Dia Laboral");
                break;
             case 3: JOptionPane.showMessageDialog(null, "Dia Laboral");
                break;
             case 4: JOptionPane.showMessageDialog(null, "Dia Laboral");
                break;
             case 5: JOptionPane.showMessageDialog(null, "Dia Laboral");
                break;    
            case 6: JOptionPane.showMessageDialog(null, "Dia no Laboral");
                break;
            case 7: JOptionPane.showMessageDialog(null, "Dia no Laboral");
                break;    
            default: JOptionPane.showMessageDialog(null, "Numero Invalido");
        }
    } 
} 

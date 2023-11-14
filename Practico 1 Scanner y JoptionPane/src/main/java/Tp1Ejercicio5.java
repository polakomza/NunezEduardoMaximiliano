/*Actividad 5: Lee un número por teclado e indica si es divisible 
entre 2 (resto = 0). Si no lo es, también debemos indicarlo.*/


import javax.swing.JOptionPane;


public class Tp1Ejercicio5 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "JOptionPane".
        String numero = JOptionPane.showInputDialog("Ingrese un numero");
        int num = Integer.parseInt(numero);
        if ((num%2)==0){
            JOptionPane.showMessageDialog(null, "su numero es divisible por 2.");
        }
        else{
            JOptionPane.showMessageDialog(null, "su numero no es divisible por 2.");
        }
    }
}
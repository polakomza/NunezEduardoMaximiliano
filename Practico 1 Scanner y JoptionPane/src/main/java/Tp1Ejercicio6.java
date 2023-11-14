/*Actividad 6: Lee un número por teclado que pida el precio de un producto 
(puede tener decimales) y calcule el precio final con IVA. El IVA sera una
constante que sera del 21%.*/


import javax.swing.JOptionPane;


public class Tp1Ejercicio6 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "JOptionPane".
        String numero = JOptionPane.showInputDialog("Ingrese el valor del poducto en pesos");
        double num = Integer.parseInt(numero);
        
        double iva = num + (num *0.21);
        JOptionPane.showMessageDialog(null, "EL precio final con el IVA es de: $"+iva+".");
    }
}

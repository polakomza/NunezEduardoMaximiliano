/*Actividad 11: Escribe una aplicación con un String que contenga una 
contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, 
con 3 intentos. Cuando aciertes ya no pedirá más la contraseña y mostrara un
mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de salida 
(3 intentos y si acierta sale, aunque le queden intentos).*/


import javax.swing.JOptionPane;

public class Tp1Ejercicio11 {

    public static void main(String[] args) {
        
        //Ejercicio realizado con clase "JOptionPane".
        int intento=1;
        
        String contraseña = JOptionPane.showInputDialog("Ingrese la nueva contraseña:");

        while(intento<=3){
            String contraseña2 = JOptionPane.showInputDialog("Ingrese la contraseña. Intento="+intento);
            if(contraseña2.equals(contraseña)){
                JOptionPane.showMessageDialog(null, "Acceso Correcto.");    
                break;
            }else{
                intento++;
            }
        }
        if(intento==4){
            JOptionPane.showMessageDialog(null, "Acceso Invalido.");
        }
    } 
} 


package javaapplication2;
import javax.swing.*;

public class JavaApplication2 {
    
    public static void main(String[] args) {
    
        Double cantidad = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese la cantidad a la cuál desea sacarle el 10%"));
        Double resultado,des;
        
        resultado=cantidad*0.1;
        
        
        JOptionPane.showMessageDialog(null,"El 10% de  " + cantidad + "  es de " + resultado);

    }
    
}

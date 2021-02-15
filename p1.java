
package javaapplication2;
import javax.swing.*;

public class p1 {
    public static void main(String[] args) {
  
       double cant = Double.parseDouble(JOptionPane.showInputDialog(" Digite la cantidad a la cual desea aplica el descuento "));
        double des = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento que desea aplicar"));
        
        Double desct=des%1;
        JOptionPane.showMessageDialog(null,desct);
        
        
    }

}

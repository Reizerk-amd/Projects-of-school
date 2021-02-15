//Escribe un programa que lea un número entero por teclado y obtiene y muestra por pantalla
//el doble y el triple de ese número.
package javaapplication2;
import javax.swing.*;

public class NewClass1 {    
    public static void main(String[] args) {
        
    int num=Integer.parseInt(JOptionPane.showInputDialog(" Digite un número "));
    int resul1,resul2;
    
    resul1=num*num;
    resul2=resul1*num;
    
    JOptionPane.showMessageDialog(null,"El doble de" +num + " es de  : " + resul1 + "  y el triple es de : " + resul2);
        
        
    }
}

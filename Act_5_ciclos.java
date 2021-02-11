/* Realizar un algoritmo que pida al usuario digitar un color y lo muestre, pero cuando el usuario digita el color AZUL se termine y lo indica, con un mensaje de finalizado.*/
package ciclos;

import javax.swing.*;
public class Act_5_ciclos {
    public static void main(String[] args) {
        
           String color="";
        
        while (!color.equals("Azul")){
            
            color= JOptionPane.showInputDialog("Ingrese un color ");
            
                
            }
            JOptionPane.showMessageDialog(null," Has digitado el color azul ");
        }
    }




/*Se requiere un algoritmo para determinar cuánto ahorrará una persona en un año, 
si al final de cada mes deposita cantidades variables de dinero; 
además, se requiere saber cuánto lleva ahorrado cada mes*/
package ciclos;

import javax.swing.*;
public class Act_4_ciclos {
    public static void main(String[] args) {
        
        int i=1;
        Double ca,cont=0.0;
        
       
        
       
        
        while (i<= 12){
           
            ca=Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto dinero guardaras este mes?"));
            cont = cont + ca;
            JOptionPane.showMessageDialog(null,"La cantidad ahorrada este mes es de  :  $" + cont );
            
            i++;
        }
        JOptionPane.showMessageDialog(null,"El ahorro final es de :  $" +cont);
        
    }
}

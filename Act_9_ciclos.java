/*Mostrar los múltiplos de 8 hasta el valor 200. Debe aparecer en pantalla 8 – 16 – 24, etc*/
package ciclos;

import javax.swing.*;
public class Act_9_ciclos {
    public static void main(String[] args) {
        
        int num=0;
        
        while (num<=200){
            
            num=num +8 ;
           JOptionPane.showMessageDialog(null, "El número es  : "+num );
        }
        JOptionPane.showMessageDialog(null, "Fin del programa ... ");
                
    }
    

}

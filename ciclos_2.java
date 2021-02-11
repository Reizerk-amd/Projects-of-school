
package ciclos;

import javax.swing.*;
public class ciclos_2 {
    public static void main(String[] args) {
        
        
        int num, cont=1,cant;
        cant=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de veces "));
        
        while (cont<=4){
            
            
            num=Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero "));
                if (num<0){
                    JOptionPane.showMessageDialog(null,"Negativo");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Positivo ");
                }  
                cont=cont+1;
        }
    }

}

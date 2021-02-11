/*Se requiere un algoritmo para determinar de N cantidades de números, cuántos son POSITIVOS, 
cuántos NEGATIVOS Y NEUTROS “0”.  */
package ciclos;

import javax.swing.*;
public class Act_2_ciclos {
    public static void main(String[] args) {
        
        int cant, cont= 1, num,neu=0,pos=0,neg=0;
        cant=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea analizar?"));
        
        
        while (cont<=cant) {
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));
            
            if (num==0){
                JOptionPane.showMessageDialog(null, "NEUTRO");
                neu=neu+1;
                
            } else if (num >0){
                JOptionPane.showMessageDialog(null,"Positivo");
                pos++;
            } else {
                JOptionPane.showMessageDialog(null, "Negativo");
                neg++;
            }
            
            cont++;
        }
        JOptionPane.showMessageDialog(null,"Valores neutros : "+ neu +
                "\n Valores positivos "+ pos + ""
             + "\n Valores negativos " + neg);
    }

}

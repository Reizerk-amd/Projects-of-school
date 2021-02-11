/*
Leer una secuencia de números y mostrar la suma de los pares y el producto de los que son múltiplo de 5.

*/
package ciclos;

import javax.swing.*;
public class Act_3_ciclos {
    public static void main(String[] args) {
        
       int  num,cant,cont=1,co=0,mul=1;
       
       cant=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea analizar ?"));
       
       while (cont<=cant) {
           
           num = Integer.parseInt(JOptionPane.showInputDialog("Digite el número "));
           
           if (num%2==0){
           
            
            co=co+num;
            
           } else if (num%5==0) {
               
               mul=mul*num;
               
               
           } else {
               JOptionPane.showMessageDialog(null,"Ingrese un número valido");
           }
           cont++;
       }
        JOptionPane.showMessageDialog(null, "La suma de los pares es de : " + co);
        JOptionPane.showMessageDialog(null, "El producto de los multiplos de 5 es de : " + mul);
    }
}

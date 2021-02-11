/*Diseñe un algoritmo que reciba números digitados por el usuario y los imprima en pantalla, 
el programa debe terminar cuando el usuario digite EL NUMERO 5.*/

package ciclos;
import javax.swing.*;
public class Act_7_ciclos {
    public static void main(String[] args) {
        int num=1;
        while(num!=5){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "));         
        } 
        JOptionPane.showMessageDialog(null,"El programa finalizó porque digitaste el número 5 ");       
    }
}

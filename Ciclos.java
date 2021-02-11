/*Jhon Bayron Fajardo 10-2 */

/*Algoritmo que permita sumar los 5 primeros números naturales.*/
package ciclos;
import javax.swing.*;
public class Ciclos {


    public static void main(String[] args) {
        int num,suma;//inicializo acumulador suma y contador
        num=1;
        suma=0;
        while (num<=5) { //comparacion definir cuantas veces hace el ciclo
            suma=suma+num;//Acumulador
            
            num=num+1;   //incremento
            
            
            
        }
      JOptionPane.showMessageDialog(null,"La suma es de " + suma);
    }
    
}

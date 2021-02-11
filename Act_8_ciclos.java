/*Diseñe un programa que pida un número, 
y realiza la tabla de multiplicar de este. (1 al 10).*/
package ciclos;

import javax.swing.*;

public class Act_8_ciclos {

    public static void main(String[] args) {
        int i = 1, num, cant = 1;
        while (i <= 10) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número "));

            JOptionPane.showMessageDialog(null, " El resultado es : \n"
                    + num + " * " + i + " = " + num * 1 + "... \n"
                    + num + " * " + i + " = " + num * 2 + "... \n"
                    + num + " * " + i + " = " + num * 3 + "... \n"
                    + num + " * " + i + " = " + num * 4 + "... \n"
                    + num + " * " + i + " = " + num * 5 + "... \n"
                    + num + " * " + i + " = " + num * 6 + "... \n"
                    + num + " * " + i + " = " + num * 7 + "... \n"
                    + num + " * " + i + " = " + num * 8 + "... \n"
                    + num + " * " + i + " = " + num * 9 + "... \n"
                    + num + " * " + i + " = " + num * 10 + "... \n");
            i++;
        }

    }

}

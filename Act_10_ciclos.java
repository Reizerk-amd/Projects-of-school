/*10.Calcular las calificaciones de un grupo de alumnos. 
La nota final de cada alumno se calcula según el siguiente criterio: 
la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. 
El algoritmo leerá el nombre del alumno, las tres notas, escribirá el resultado y volverá a pedir los datos del siguiente alumno hasta que sean 5 estudiantes. 
Las notas deben estar entre 0 y 10, si no lo están, no imprimirá las notas, mostrará un mensaje de error y volverá a pedir otro alumno. */
package ciclos;

import javax.swing.*;
public class Act_10_ciclos {
        public static void main(String[] args) {
            String nom;
            Double ntp,np,nt,notafinal;
            int cont= 0 , i=1;
            
            while (i<=5){
                
                nom=JOptionPane.showInputDialog("Ingrese su nombre ");
                ntp=Double.parseDouble(JOptionPane.showInputDialog(" Ingrese la nota de las practicas "));
                np=Double.parseDouble(JOptionPane.showInputDialog(" Ingrese la nota de la parte de problemas "));
                nt=Double.parseDouble(JOptionPane.showInputDialog(" Ingrese la nota teórica "));
                    if (ntp<=10 && ntp>=0 && np<=10 && np>=0 && nt<=10 && nt >= 0) {
                
                JOptionPane.showMessageDialog(null, "El alumno " + nom );
                JOptionPane.showMessageDialog(null, "La nota practica es : " + ntp );
                JOptionPane.showMessageDialog(null, "La nota de problemas es  " + np );
                JOptionPane.showMessageDialog(null, "La nota teorica es  " + nt );
                
                ntp=ntp*0.1;
                np=np*0.5;
                nt=nt*0.4;
                
                notafinal= ntp+np+nt;
                
                JOptionPane.showMessageDialog(null, "La nota final es  " + notafinal);
               
            } else {
                    JOptionPane.showMessageDialog(null, " Ingrese otro alumno " + JOptionPane.ERROR_MESSAGE);
                    }
            }
        }
}

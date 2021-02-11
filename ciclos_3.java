/*Para que una persona pueda ejercer su voto en una elección de gobierno, debe de ser mayor de edad 
y debe ser colombiano. (APLIQUE UN CICLO)*/
package ciclos;

import javax.swing.*;
public class ciclos_3 {
    public static void main(String[] args) {
        
        int voto,edad,cont=1;
     
        
        voto=Integer.parseInt(JOptionPane.showInputDialog(" ¿Cuantas personas van a votar? "));
        
        while (cont<=voto){
            
            String nacio=JOptionPane.showInputDialog("Ingrese su nacionalidad ");
            edad=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese su edad "));
            
            if (edad>=18 && nacio.equals("Colombiano")){
                
                JOptionPane.showMessageDialog(null," Puede votar ya que es mayor de edad " + edad );
            }
            else{
                JOptionPane.showMessageDialog(null," No puede votar porque es menor de edad : "+  edad);
            }
                
            cont=cont+1;
        }
        
        
        
        
    }

}

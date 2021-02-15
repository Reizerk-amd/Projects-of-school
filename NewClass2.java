/*Programa que muestre en pantalla el nombre, edad, género y el total de la compra de una
factura que entrega una tienda a sus clientes. Actualmente está dando a sus clientes fieles
un 33 % por sus compras.*/

package javaapplication2;
import javax.swing.*;

 
public class NewClass2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Antes de tu compra debemos pedirte unos datos :) ");
        
        String nom,gen;
        nom=JOptionPane.showInputDialog(" Digite su nombre con apellidos ");
        gen=JOptionPane.showInputDialog("Ingrese su género ");
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog(" Digite su edad "));
        
        Double factura= Double.parseDouble(JOptionPane.showInputDialog(" ingrese la cantidad que se debe pagar de la factura "));
        
        
        
        
        
        
    }

}

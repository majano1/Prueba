package DEITEL;

import javax.swing.JOptionPane;

public class CuadroDialogo {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "¡Qué tal!");
		
		String nombre;
		
		nombre = JOptionPane.showInputDialog("Dime tu nombre: ");
		
		JOptionPane.showMessageDialog(null, "Hola "+ nombre);
		
		String numero;
		
		numero = JOptionPane.showInputDialog("Dime un número: ");
		
		int n=Integer.parseInt(numero); 
		Integer.toString(n); //numero en formato de cadena
		
		//System.out.println(n);

		


	}

}

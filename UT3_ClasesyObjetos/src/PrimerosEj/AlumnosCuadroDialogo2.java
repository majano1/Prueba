package PrimerosEj;

import javax.swing.JOptionPane;
import ejemplos.Alumno;

public class AlumnosCuadroDialogo2 {

	public static void main(String[] args) {
		Alumno alumno1,alumno2,alumno3;
		
		String nombre,cadenaEdad;
		int edad;
		
		alumno1 = new Alumno();		
		nombre = JOptionPane.showInputDialog("Nombre del primer alumno: ");
		alumno1.setNombre(nombre);
		
		cadenaEdad = JOptionPane.showInputDialog("Edad de los alumnos: ");
		edad=Integer.parseInt(cadenaEdad);
		alumno1.setEdad(edad);
		
		alumno2 = new Alumno();
		alumno2.setNombre(JOptionPane.showInputDialog("Nombre del segundo alumno: "));
		alumno2.setEdad(edad);
		
		alumno3 = new Alumno();
		alumno3.setNombre(JOptionPane.showInputDialog("Nombre del tercer alumno: "));
		alumno3.setEdad(edad);
		
		JOptionPane.showMessageDialog(null, "Nombres y Edades:\n"+ 
		alumno1.nombre + "   " + alumno1.edad+"\n" + 
		alumno2.nombre + "   " + alumno2.edad+"\n" + 
		alumno3.nombre + "   " + alumno3.edad);
		

	}

}


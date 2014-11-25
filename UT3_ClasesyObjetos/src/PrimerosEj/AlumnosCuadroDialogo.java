package PrimerosEj;

import javax.swing.JOptionPane;

import ejemplos.Alumno;

public class AlumnosCuadroDialogo {

	public static void main(String[] args) {


				String alumno1,alumno2,alumno3;
				String edad;
				
				alumno1 = JOptionPane.showInputDialog("Nombre del primer alumno: ");
				
				edad = JOptionPane.showInputDialog("Edad: ");
				int num=Integer.parseInt(edad);
				
				alumno2 = JOptionPane.showInputDialog("Nombre del segundo alumno: ");
				alumno3 = JOptionPane.showInputDialog("Nombre del tercer alumno: ");
				
				
				JOptionPane.showMessageDialog(null, "Listado de alumnos\n\n"+
				"Nombres y Edades:\n"+		
				alumno1 + "   " + num + "\n" +
				alumno2 + "   " + num + "\n" +
				alumno3 + "   " + num);
		

	}

}

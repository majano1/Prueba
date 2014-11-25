package ejemplos;

public class ClaseDAW {

	public static void main(String[] args) {
		Alumno juan,pepe;
		
		juan = new Alumno(); //Crea un nuevo objeto de la clase Alumno
		pepe = new Alumno();
		
		juan.nombre="Juan Pérez";
		juan.edad = 27;
		juan.aumentarEdad(1);
		
		//pepe.setNombre="Pepe Pérez";

	}

}

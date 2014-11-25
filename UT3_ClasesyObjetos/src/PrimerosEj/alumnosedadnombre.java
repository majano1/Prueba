package PrimerosEj;

import java.util.Scanner;

public class alumnosedadnombre {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre1;
		String nombre2;
		String nombre3;
		int edad;
		
		System.out.println("Vamos a recoger nombres de tres alumnos y su edad.\nIntroduce el nmbre del primer alumno: ");
		
		nombre1=entrada.toString();		
		System.out.println("Su nombre es "+nombre1+".\nIntroduce el nombre del tercer alumno: ");
		
		nombre2=entrada.toString();		
		//System.out.println("Su nombre es "+nombre3+".\nIntroduce su edad (una vez): ");
		
		//System.out.println(nombre1+" tiene "+edad+".\n"+nombre2+" tiene "+edad+".\n"+nombre3+" tiene "+edad);
		edad=entrada.nextInt();	


}
}

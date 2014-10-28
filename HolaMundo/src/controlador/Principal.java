package controlador;

import modelo.Saludo;

public class Principal {
	
	public Principal()   {
		
	}

public static void main(String [] args)  {
	
	Saludo saludo=new Saludo();
	saludo.diHola("Fernando");
}

}
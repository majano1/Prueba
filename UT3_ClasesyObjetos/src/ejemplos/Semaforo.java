package ejemplos;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) throws InterruptedException {

		Rectangle cuadrado;
		Ellipse circulo1;
		Ellipse circulo2;
		Ellipse circulo3;
		
		cuadrado = new Rectangle(0,0,100,275);
		circulo1 = new Ellipse(25,35,50,50);
		circulo2 = new Ellipse(25,110,50,50);
		circulo3 = new Ellipse(25,185,50,50);
		
		boolean x = true;
		 
	      while( x == true) {
	  		cuadrado.draw();
			cuadrado.setColor(Color.BLACK);
			cuadrado.fill();
			
			Thread.sleep(1000);
			circulo1.setColor(Color.RED);
			circulo1.fill();
			
			Thread.sleep(5000);
			circulo1.setColor(Color.BLACK);
			circulo1.fill();
			
			Thread.sleep(100);
			circulo2.setColor(Color.ORANGE);
			circulo2.fill();
			
			Thread.sleep(2000);
			circulo2.setColor(Color.BLACK);
			circulo2.fill();
			
			Thread.sleep(100);
			circulo3.setColor(Color.GREEN);
			circulo3.fill();
			
			Thread.sleep(5000);
			circulo3.setColor(Color.BLACK);
			circulo3.fill();
			//circulo.draw();
			
	      }
			
	      }		

	}



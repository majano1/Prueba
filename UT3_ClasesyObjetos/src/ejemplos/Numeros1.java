package ejemplos;

import java.util.Scanner;

public class Numeros1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;

		n = entrada.nextInt();

		if (n < 0) {
			System.out.println("N�mero negativo");
		} else {
			System.out.println("N�mero positivo � 0");
		}

		System.out.println("Fin.");

	}

}

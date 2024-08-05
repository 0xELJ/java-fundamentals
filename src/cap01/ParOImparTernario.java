package cap01;

import java.util.Scanner;

public class ParOImparTernario {
	public static void main(String args[]) {
		// Mensaje para el user
		System.out.print("Ingrese un número: ");
		
		// Lee el valor y hace el casting a int
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		// Calcula el resto
		int resto = num % 2;
		
		// Muestra resultado
		String msg = resto == 0 ? "es par" : "es impar";
		System.out.println("El número " + num + " " + msg);
	}
}

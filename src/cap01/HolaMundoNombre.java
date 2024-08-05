package cap01;

import java.util.Scanner;

public class HolaMundoNombre {
	public static void main(String[] args) {
		// la clase Scanner nos permite leer datos por consola
		Scanner scanner = new Scanner(System.in);
		
		// muestra instrucción al usuario
		System.out.print("Ingrese su nombre: ");
		
		// leemos la cadena y se almacena en una variable
		String nombre = scanner.nextLine();
		scanner.close();
		
		// imprime mensaje con el valor leído
		System.out.println("Hola mundo: " + nombre);
	}
}

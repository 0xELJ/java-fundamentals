package cap01;

import java.util.Scanner;

public class ReverseStringBuffer {
	/**
	 * Invierte una cadena usando la clase StringBuffer
	 * 
	 * @param String
	 * @return String
	 */
	public static String reverse(String str) {
		// longitud de la cadena original
		int length = str.length();
		
		// crea instancia de StringBuffer con una longitud igual a la cadena original
		StringBuffer reversedStr = new StringBuffer(length);
		
		// itera del último al primer caracter de cadena original
		for(int i = length - 1; i >= 0; i--) {
			// concatena el caracter a la cadena invertida
			reversedStr.append(str.charAt(i));
		}
		
		// retorna la cadena invertida
		return reversedStr.toString();
	}
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un enunciado: ");
		String str = scanner.nextLine();
		
		String reversedStr = reverse(str);
		System.out.println("Enunciado invertido: " + reversedStr);
		scanner.close();
	}
}

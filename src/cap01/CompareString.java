package cap01;

import java.util.Scanner;

public class CompareString {
	public static void compare(String s1, String s2) {
		//esto esta mal porque los Strings son objetos y el operador '==' compara direcciones de memoria cuando se usa en objetos
		// if (s1 == s2) { 
		if (s1.equals(s2)) { // comparación correcta
			System.out.println("compare: Son iguales");
		} else {
			System.out.println("compare: Son distintas");
		}
	}
	
	public static void compareSame() {
		String s1 = "Hola";
		String s2 = "Hola";
		System.out.println("compareSame: s1 = " + s1);
		System.out.println("compareSame: s2 = " + s2);
		if (s1 == s2) { // En este caso el operador 
			// Java asigna la cadena "Hola" en una porción de memoria y ante la aparición de la misma cadena, no se vuelve a reservar
			// memoria para almacenar la misma información, en cambio, se obtiene una nueva referencia a dicha porción de memoria
			System.out.println("compareSame: Son iguales");
		} else {
			System.out.println("compareSame: Son distintas");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese una cadena: ");
		String s1 = scanner.nextLine();
		
		System.out.print("Ingrese otra cadena: ");
		String s2 = scanner.nextLine();
		
		compare(s1, s2);
		compareSame();
	}

}

package cap01;

import java.util.Scanner;

public class DemoArrayDays {
	public static void main(String[] args) {
		// define array de Strings sin dimensionar
		String[] days = {"Lunes", "Martes", "Miercóles", "Jueves", "Viernes", "Sábado", "Domingo"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el día de la semana (número): ");
		int dayNum = scanner.nextInt();
		scanner.close();
		
		if (dayNum <= days.length) {
			System.out.println("Elegiste el día " + days[dayNum - 1]);
		} else {
			System.out.println("Número incorrecto!!!");
		}
		
	}
}

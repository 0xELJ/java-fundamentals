package cap01;

import java.util.Scanner;

public class DemoArrayNums {
	public static void main(String[] args) {		
		// definimos e instanciamos el array de 10 enteros
		int[] nums = new int[10];
		
		// instanciamos Scanner para la lectura por consola
		Scanner scanner = new Scanner(System.in);
		
		// lee el primer valor 
		System.out.print("Ingrese un valor (0 = fin): ");
		int value = scanner.nextInt();
		
		// inicializa variables del indice y suma de valores
		int readIndex = 0;
		
		// iteramos mientras 'value' sea diferente de cero y 'readIndex' sea menor que 10
		while (value != 0 && readIndex < 10) {
			// asigna 'value' en nums[readIndex] y luego incrementa readIndex en 1
			nums[readIndex++] = value;
			
			// lee el siguiente valor 
			System.out.print("Ingrese el siguiente valor (0 = fin): ");
			value = scanner.nextInt();
			
		}
		
		// recorremos el array mostrando su contenido
		for(int j = 0; j < 10; j++) {
			System.out.println(j + ": " + nums[j]);
		}
		
		// imprime la media de los números introducidos
		double avg = calculateAverage(nums);
		System.out.println("Promedio: " + avg);
		
		scanner.close();
	}
	
	public static double calculateAverage(int[] nums) {
		int total = 0;
		for (int n : nums) {			
			total += n;
		}
		double avg = (double) total / nums.length;
		return avg;
	}
}

package cap02.interfaces;

/**
 * Clase utilitaria con un método estático sort(). Este recibirá un array de objetos Comparable para ordenarlos
 * aplicando el algoritmo de la burbuja (Bubble sort)
 * 
 */
public class Util {
	public static void sort(Comparable arr[]) {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < arr.length - 1; i++) { 
				if (arr[i+1].compareTo(arr[i]) < 0) {
					Comparable aux = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = aux;
					sorted = false;
				}
			}
		}
	}
}

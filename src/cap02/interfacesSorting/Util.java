package cap02.interfacesSorting;

public class Util {
	public static void sort(Object[] arr, Criteria cr) {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < arr.length - 1; i++) { 
				if (cr.compare(arr[i+1], arr[i]) < 0) {
					Object aux = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = aux;
					sorted = false;
				}
			}
		}
	}
	
	public static void print(Object[] arr) {
		for(Object obj: arr) {
			System.out.println(obj);
		}
		
	}
}

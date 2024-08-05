package cap02.interfaces;

public class TestSorting {
	public static void main(String[] args) {
		Student[] students = {
				new Student("Juan", 20, 8.5),
				new Student("Pedro", 25, 6.4),
				new Student("Alberto", 18, 4.6),
				new Student("Enrique", 30, 9.0)
		}; 
		Util.sort(students);
		printArray(students);
		
		// defino, ordeno y muestro un array de String
		String[] names = {"Enrique", "Martha", "Pablo", "Andres"};
		Util.sort(names);
		printArray(names);
		
		// defino, ordeno y muestro un array de Integer
		Integer[] ages = {88, 45, 19, 77, 12};
		Util.sort(ages);
		printArray(ages);
	}
	
	public static void printArray(Comparable[] arr) {
		for(Comparable obj: arr) {
			System.out.println(obj);
		}
		
	}
}

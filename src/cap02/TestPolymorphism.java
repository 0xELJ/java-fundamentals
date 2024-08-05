package cap02;

public class TestPolymorphism {
	public static void main(String[] args) {
		// a 'date' de tipo Date le asigno un objeto DetailedDate
		Date date1 = new DetailedDate("15/06/2024");
		
		// a 'obj' de tipo Object le asigno un objeto DetailedDate
		Object date2 = new DetailedDate("16/06/2024");
		
		// imprimo los dos objetos.
		// asi por polimorfismo se invoca el metodo toString definido en la clase 
		// a la cual pertenecen los objetos (DetailedDate)
		System.out.printf("date: %s\n", date1);
		System.out.printf("date2: %s", date2);
		
	}
}

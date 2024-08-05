package cap02;

public class TestDate {
	public static void main(String args[]) {
		// creación de objeto Date usando 3 argumentos de tipo Int
		Date date1 = new Date(5, 6, 2024);
		
		// creación de objeto Date usando una cadena (constructor sobrecargado)
		Date date2 = new Date("5/6/2024");
		
		// muestra fechas usando implicitamente el método toString que fue sobreescrito
		System.out.format("Primera fecha: %s\n", date1);
		System.out.format("Segunda fecha: %s\n", date2);
		
		compareDates(date1, date2);
		
		// modifica fecha usando setters de clase
		date2.setDay(13);
		date2.setMonth(5);
		date2.setYear(1993);
		System.out.println("Segunda fecha modificada: " + date2);
		
		compareDates(date1, date2);
	}
	
	// comparación de fechas, sin importar como fueron creadas
	public static void compareDates(Date date1, Date date2) {
		if (date1.equals(date2)) {
			System.out.println("Las fechas son iguales");
		} else {
			System.out.println("Las fechas son distintas");
		}
	}
}

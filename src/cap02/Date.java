package cap02;

public class Date {
	// Declara los atributos de clase 'day', 'month' and 'year'
	private int day;
	private int month;
	private int year;
	
	/**
	 * El constructor de una clase es un metodo que se llama igual que la clase y que solo puede invocarse luego del operador new
	 * al crear objetos de la clase.
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	/**
	 * 
	 * Sobrecarga del constructor de clase para crear fechas a apartir de una cadena con el formato dd/mm/aaaa
	 * 
	 * Es importante recordar que sobrecargamos un método cuando lo programamos más de una vez, pero con diferentes tipos y/o 
	 * cantidades de parámetros
	 * 
	 * @param date
	 */
	public Date(String date) {
		int first = date.indexOf('/');
		int last = date.lastIndexOf('/');
		
		String day = date.substring(0, first);
		this.setDay(Integer.parseInt(day));
		
		String month = date.substring(first + 1, last);
		this.setMonth(Integer.parseInt(month));
		
		String year = date.substring(last + 1);
		this.setYear(Integer.parseInt(year));
	}

	/**
	 * Define los métodos setters y getters para cada uno de los atributos.
	 * Los setters y getters son también conocidos como 'accesor methods' ya que permiten acceder a los atributos
	 * para asignarles valor (setXXX) o para obtener un valor (getXXX)
	 */
	public int getDay() {
		return this.day;
	}
	
	public void setDay(int newDay) {
		this.day = newDay;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setMonth(int newMonth) {
		this.month = newMonth;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int newYear) {
		this.year = newYear;
	}
	// *** Fin de setters y getters
	
	// sobreescribimos el metodo toString, el cual es heredado de Object
	public String toString() {
		// retorna una cadena con el formato dd/mm/aaaa
		return String.format("%s/%s/%s", this.day, this.month, this.year);
	}
	
	// sobreescribimos el metodo equals que heredamos de Object
	public boolean equals(Object date) {
		Date otherDate = (Date) date;
		return otherDate.day == this.day && otherDate.month == this.month && otherDate.year == this.year;
	}
	
}

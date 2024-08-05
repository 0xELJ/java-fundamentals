package cap02;

public class DetailedDate extends Date {
	String[] months = {
		"Enero",
		"Febrero",
		"Marzo",
		"Abril",
		"Mayo",
		"Junio",
		"Julio",
		"Agosto",
		"Septiembre",
		"Octubre",
		"Noviembre",
		"Diciembre",
	};
	
	public DetailedDate(int day, int month, int year) {
		super(day, month, year);
	}
	
	public DetailedDate() {
		this (0, 0, 0);
	}
	
	public DetailedDate(String date) {
		super(date);
	}
	
	public String toString() {
		return String.format("%s de %s de %s", this.getDay(), months[this.getMonth() - 1], this.getYear());
	}
}

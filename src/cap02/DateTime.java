package cap02;

public class DateTime extends DetailedDate {
	private int hour;
	private int minute;
	private int second;
	
	public DateTime(String sDate, int h, int m, int s) {
		super(sDate); // llama al constructor padre para inicializar la fecha
		this.hour = h;
		this.minute = m;
		this.second= s;
	}
	
	public String toString() {
		// usa la referencia a la clase base super para invocar el método toString(), el cual imprime la fecha formateada
		return String.format("%s (%s:%s:%s)", super.toString(), this.hour, this.minute, this.second); 
	}                                                                                                                     
}

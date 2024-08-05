package cap02.interfaces;

/**
 * La interfaz Comparable es generic en T para validar en tiempo de compilación que no se intente comparar elementos
 * de diferentes tipos de datos
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private double avgGrade;
	
	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.avgGrade = grade;
	}
	
	/**
	 * La interfaz Comparable define un único método que recibe un objeto como parametro y debe retornar un valor
	 * entero mayor, menor o igual a cero, según resulte la comparación entre los atributos de la instancia (this)
	 * y los del parámetro obj
	 */
	public int compareTo(Student otherStudent) {
		return this.age - otherStudent.age;
	}
	
	public String toString() {
		return String.format("%s, %s, %s", this.name, this.age, this.avgGrade);
	}
}

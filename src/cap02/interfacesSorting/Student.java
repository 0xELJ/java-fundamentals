package cap02.interfacesSorting;

public class Student {
	private String name;
	private int age;
	private double grade;
	
	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String toString() {
		return String.format("%s, %s, %s", this.name, this.age, this.grade);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getGrade() {
		return this.grade;
	}
}

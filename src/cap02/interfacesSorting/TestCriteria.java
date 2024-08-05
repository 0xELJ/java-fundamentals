package cap02.interfacesSorting;

public class TestCriteria {
	public static void main(String[] args) {
		Student[] students = {
				new Student("Martin", 25, 7.2),
				new Student("Carlos", 23, 5.1),
				new Student("Anastasio", 20, 4.5)
		};
		Util.sort(students, new CriteriaStudentName());
		Util.print(students);
		
		Util.sort(students, new CriteriaStudentGrade());
		Util.print(students);
	}
}

package cap02.interfacesSorting;

public class CriteriaStudentName extends Criteria<Student> {
	public int compare(Student a, Student b) {
		return a.getName().compareTo(b.getName());
	}
}

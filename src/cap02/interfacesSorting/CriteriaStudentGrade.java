package cap02.interfacesSorting;

public class CriteriaStudentGrade extends Criteria<Student> {
	public int compare(Student a, Student b) {
		double diff = a.getGrade() - b.getGrade();
		if (diff > 0) {
			return 1;
		} else if (diff < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}

//import java.util.ArrayList;
import java.util.List;
public class School{


    private List<Teacher> teachers;
    private List<Student> students;

    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

	public List<Teacher> getTeachers() {
		return this.teachers;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void addStudent(Student student) {
		students.add( student);
	}

	public int getTotalMoneyEarned() {
		return this.totalMoneyEarned;
	}

	public void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneySpent() {
		return this.totalMoneySpent;
	}

	public void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}

}

public class Student {

	private String name;
	private String lastName;
	private int grade;
	private boolean attendance;
	

	public Student(String name, String lastName, int grade, boolean attendance) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
		this.attendance = false;
	}
	
	
	public String getName() {
		return name;
	}	
	public String getLastName() {
		return lastName;
	}
	public int getGrade() {
		return grade;
	}
	public boolean getAttendance() {
		return attendance;
	}
}

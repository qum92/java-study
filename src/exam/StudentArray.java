package exam;

class Student{
	String name;
	int grade;
	String schoolname;
}
public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			students[i].grade = i+1;
			
		}
		System.out.println(students[9].grade);
	}
}

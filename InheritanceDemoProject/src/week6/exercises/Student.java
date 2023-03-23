package week6.exercises;

public class Student extends Person {
	int studentId;
	double cgpa;
	

	void describeStudent(int a, double b) {
		this.studentId=a;
		this.cgpa=b;
		System.out.println("My id is "+studentId+" and my cgpa is " +cgpa+".");
	}
	void displayDailyActivity() {
		super.displayDailyActivity();
		System.out.println();
		System.out.print("My activities as a Student: ");
		System.out.print("I attend classes, do assignment,sit for exams and so on.");
	}
}

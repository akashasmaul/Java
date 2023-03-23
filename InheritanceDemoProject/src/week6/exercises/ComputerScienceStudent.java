package week6.exercises;

public class ComputerScienceStudent extends Student {

	String major;
	
	void describeStudent(int a, double b, String m) {
		super.studentId=a;
		super.cgpa=b;
		System.out.println("My id is "+studentId+" and my cgpa is " +cgpa+".");
		this.major=m;
		System.out.println("My department is "+major+".");}}

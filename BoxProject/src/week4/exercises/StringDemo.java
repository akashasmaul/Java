package week4.exercises;

public class StringDemo {         
	
	public void getStringCharacterPosition() {
		String s1 = "Java Exercises!";
		
		System.out.println("The character at position " + s1.indexOf('J') + " is J");
		System.out.println("The character at position " + s1.indexOf('i') + " is i");
	}
	public void compareTwoString() {
		String s1 = "This is Exercise 1";
		String s2 = "This is Exercise 2";
		
		System.out.println("This is Exercise 1 '' " + s1.compareTo(s2) + "is less than " + "''This is Exercise 2");
	}
	
	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		sd.getStringCharacterPosition();
		sd.compareTwoString();
	}
	
}
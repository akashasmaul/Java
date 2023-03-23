package week6.exercises;

public class Person {
	 String name;
	 int age;
			
		 void describePerson(String n, int a) {
			 this.name=n;
			 this.age=a;
			 System.out.println("My name is " + name +". "+ "I am "+age+" years old.");
		 }
		void displayDailyActivity() {
			System.out.println();
			System.out.print("My activities as a person: ");
			System.out.print("woking up, taking breakfast, doing exercise, sleeping and so on.");
		}
}

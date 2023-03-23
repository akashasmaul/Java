package methodOverloading;

public class DifferentSequenceOfParameters {
	public void method(int age, String name) {
		System.out.println("I'm the first definition of method dispId = " + age + ", Name: " + name);
	}
	public void method(String name, int age) {
		System.out.println("I'm the second definition of method dispName = " + name + ", ID: " + age);
	}
}

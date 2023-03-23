package methodOverloading;

public class Constructoroverloading {
int age; String name;
	
	public Constructoroverloading(int a, String n) {
		this.age= a;
		this.name=n;
		System.out.println("I'm the first definition of method dispId = " + age + ", Name: " + name);
	}

	public Constructoroverloading(String n, int a) {
		this.name=n;
		this.age= a;
		System.out.println("I'm the second definition of method dispName = " + name + ", ID: " + age);
	}

}

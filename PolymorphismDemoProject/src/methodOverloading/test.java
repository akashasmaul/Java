package methodOverloading;
import java.util.Scanner;


public class test {
	static void showTask1() {
		System.out.println("************************ Task 1 ********************");
		DifferentTypesOfParameter obj1 = new DifferentTypesOfParameter();
		obj1.disp('c');
		obj1.disp(200);
		obj1.disp(true);
		obj1.disp(10.0);
		obj1.disp(5.0f);
		obj1.disp("hi");
			}
	
	static void showTask2() {
		System.out.println("************************ Task 2 ********************");
		DifferentNumberOfParameter obj1 = new DifferentNumberOfParameter();
		obj1.add(5);
		obj1.add(5, 5);
		obj1.add(5, 5, 5);
		obj1.add(5, 5, 5, 5);
		obj1.add(5, 5, 5, 5, 5);
	}
	
	static void showTask3() {
		System.out.println("************************ Task 3 ********************");
		DifferentSequenceOfParameters obj1 = new DifferentSequenceOfParameters();
		obj1.method(21, "Akash");
		obj1.method("Avro", 22);
	}
	
	
	static void showTask4() {
		System.out.println("************************ Task 4 ********************");
		DifferentReturnType obj1 = new DifferentReturnType();
		obj1.add(5,5);
		obj1.add(5.0,5.0,5.0);
		obj1.add(5.0f, 5.05f);
		obj1.add();
	}
	
	static void showTask5() {
		System.out.println("************************ Task 5 ********************");
		Constructoroverloading obj1 = new Constructoroverloading(21, "Akash");
		Constructoroverloading obj2 = new Constructoroverloading("Avro", 22);
}
	
	static void showTask6() {
		System.out.println("************************ Task 6 ********************");
	}


	public static void main(String[] args) {
		System.out.println("\t******************** Main Menu********************");
		System.out.println("**********Choose numbers accordingly to show the Tasks **********");
		System.out.println("1 >>:Task 1 \n2 >>:Task 2 \n3 >>:Task 3 \n4 >>:Task 4 \n5 >>:Task 5 \n6 >>:Task 6");
		System.out.print("Enter your choice (1 / 2 /3 / 4 /5 /6): ");
		Scanner option = new Scanner(System.in);
		int op = option.nextInt();

		switch(op) {
		case 1: showTask1();
		break;
		case 2: showTask2();
		break;
		case 3: showTask3();
		break;
		case 4: showTask4();
		break;
		case 5: showTask5();
		break;
		case 6: showTask6();
		break;

}
}
}

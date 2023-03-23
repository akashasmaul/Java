package week4.exercises;
import java.util.Scanner;

public class ScannerDemonstration {
	
	Scanner cin = new Scanner(System.in);
	void readDouble() {
		System.out.print("Enter length: ");
		double length = cin.nextDouble();
		System.out.print("Enter breadth: ");
		double breadth = cin.nextDouble();
		
		double area = length*breadth;
				System.out.println("Area of the rectangle: " + area);
	}
}

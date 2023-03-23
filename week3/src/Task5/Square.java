package Task5;

public class Square extends Shape {
	void drawShape() {
		System.out.println("Deawing Square");
	}
	public void calculateArea(double a, double b) {
		double area = a*a;
		System.out.println("Area of Square = " + area);
	}
}

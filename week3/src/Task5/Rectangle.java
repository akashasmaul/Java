package Task5;

public class Rectangle extends Shape {
	void drawShape() {
		System.out.println("Deawing Rectangle ");
	}
	public void calculateArea(double a, double b) {
		double area = a*b;
		System.out.println("Area of Rectangle = " + area);
	}
}

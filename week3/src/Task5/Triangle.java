package Task5;

public class Triangle extends Shape {
	void drawShape() {
		System.out.println("Deawing Triangle");
	}
	public void calculateArea(double a, double b) {
		double area = 0.5*a*b;
		System.out.println("Area of Triangle = " + area);
	}
}
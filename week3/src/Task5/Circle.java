package Task5;

public class Circle extends Shape{
	void drawShape() {
		System.out.println("Drawing circle");}
	
	void calculateArea(double a, double b){
		double area = 2*a*a*b*b;
		System.out.println("Area of circle = ");
	}
}

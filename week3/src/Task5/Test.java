package Task5;

public class Test {

	public static void main(String[] args) {
		Shape a = new Circle();
		a.drawShape();
		a.calculateArea(3, 5);
		Shape b = new Triangle();
		b.drawShape();
		b.calculateArea(4, 6);
		Shape c = new Square();
		c.drawShape();
		c.calculateArea(5, 5);
		Shape d = new Rectangle();
		d.drawShape();
		d.calculateArea(3, 5);
		}

}

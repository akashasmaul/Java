package week4.exercises;

public class Test {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setLength(5.5);
		b1.setWidth(3.4);
		b1.setHeight(4.1);
		System.out.println("Length: " + b1.getLength());
		System.out.println("Width: " + b1.getWidth());
		System.out.println("Height: " + b1.getHeight());
		System.out.println("Price of this box is: " + b1.getPricePerBox());
		//System.out.println("Total price =" + Box.totalPrice);
		
		Box b2 = new Box();
		b2.setLength(544.5);
		b2.setWidth(333.4);
		b2.setHeight(12.1);
		System.out.println("Length: " + b2.getLength());
		System.out.println("Width: " + b2.getWidth());
		System.out.println("Height: " + b2.getHeight());
		System.out.println("Price of this box is: " + b2.getPricePerBox());
		System.out.println("Total price =" + Box.totalPrice);

	
}
}

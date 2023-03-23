package week4.exercises;

public class Box {

	private double length, width, height;
	private static double pricePerUnit = 5.0;
	public static double totalPrice = 0.0;
// setter
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
//  getter
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getPricePerBox() {
		 double price = pricePerUnit*(length+width+height);
		 totalPrice= totalPrice + price;
		 return price;
		 }

}

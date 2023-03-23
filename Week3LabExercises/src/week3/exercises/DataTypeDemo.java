package week3.exercises;

public class DataTypeDemo {
	private byte byteDefault;
	private byte byteMin=-128;
	private byte byteMax=127;
	
	public void displayByteDetails()
	{ System.out.println("Byte type details : byteDefault = "+ byteDefault + ",byteMin = " + byteMin + ", byteMax = " + byteMax);
	}
	public static void main(String[] args) {
		DataTypeDemo dtd1 = new DataTypeDemo();
				dtd1.displayByteDetails();
		}
}
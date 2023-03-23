package week3.exercises;

public class DataTypeDemo_3 {
	private byte byteDefault;
	private byte byteMin=Byte.MIN_VALUE;
	private byte byteMax=Byte.MAX_VALUE;
	private short shortDefault;
	private short shortMin=Short.MIN_VALUE;
	private short shortMax=Short.MAX_VALUE;
	private int intDefault;
	private int intMin=Integer.MIN_VALUE;
	private int intMax=Integer.MAX_VALUE;
	private long longDefault;
	private long longMin=Long.MIN_VALUE;
	private long longMax=Long.MAX_VALUE;
	private boolean booleanDefault;
	private char charDefault;
	private char charMin= Character.MIN_VALUE;
	private char charMax= Character.MAX_VALUE;
	
	public void displayByteDetails()
	{ System.out.println("Byte type details : byteDefault = "+ byteDefault + ", byteMin = " + byteMin + ", byteMax = " + byteMax);}
	
	public void displayShortDetails()
	{ System.out.println("Short type details : ShortDefault = "+ shortDefault + ",shortMin = " + shortMin + ", shortMax = " + shortMax);}
	
	public void displayIntDetails() { 
		System.out.println("Int type details : intDefault = "+ intDefault + ", intMin = " + intMin + ", intMax = " + intMax);}
	
	public void displayLongDetails() { 
		System.out.println("Long type details : longDefault = "+ longDefault + ", longMin = " + longMin + ", longMax = " + longMax);}
	
	public void displayBooleanDetails() { 
		System.out.println("Boolean type details : BooleanDefault = "+ booleanDefault + ", Boolean does not have Min or Max Value");}
		
	public void displayCharacterDetails() { 
		System.out.println("Character  type details : charDefault = \\u0000 "+ charDefault + ", charMin = \\u0000" + charMin + ", charMax = \\uFFFF " + charMax);}
	
	public static void main(String[] args) {
		DataTypeDemo_3 dtd1 = new DataTypeDemo_3();
				dtd1.displayByteDetails();
				dtd1.displayShortDetails();
				dtd1.displayIntDetails();
				dtd1.displayLongDetails();
				dtd1.displayBooleanDetails();
				dtd1.displayCharacterDetails();
		}
}
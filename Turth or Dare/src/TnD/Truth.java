package TnD;

import java.util.Scanner;

public class Truth extends Info {
	static String tone;
	static String ttwo;
	static String tthree;
	static String tfour;
	static String tfive;
	static String tsix;
	static String tseven;
	static String teight;
	static String tnine;
	static String tten;
	static String televen;
	static Scanner t=new Scanner(System.in);

public static void truth() {
	
	System.out.println("Honest answers are expected from you. Good Luck" );
	System.out.print("\n1: love or money?\n :");
	tone= t.nextLine();
	System.out.print("\n2: what am i to you?\n :");
	ttwo= t.nextLine();
	System.out.print("\n3: number of relationships till now ?\n :");
	tthree= t.nextLine();
	System.out.print("\n4: would you unfriend me for someone else?\n :");
	tfour= t.nextLine();
	System.out.print("\n5: single or taken?\n :");
	tfive= t.nextLine();
	System.out.print("\n6: name your ex-crush?\n :");
	tsix= t.nextLine();
	System.out.print("\n7: what you like in me?\n :");
	tseven= t.nextLine();
	System.out.print("\n8: current crush name?\n :");
	teight= t.nextLine();
	System.out.print("\n9: do you want my number ?\n :");
	tnine= t.nextLine();
	System.out.print("\n10: do you like me?\n :");
	tten= t.nextLine();
	System.out.print("\n11: what will be your answer if i propose you ?\n :");
	televen= t.nextLine();
	System.out.println("\n");
	
}
}

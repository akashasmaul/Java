package TnD;

import java.util.Scanner;

public class Dare extends Truth {
	static String done;
	static String dtwo;
	static String dthree;
	static String dfour;
	static String dfive;
	static Scanner d=new Scanner(System.in);
	
	static void dare() {
		System.out.println("Honest answers are expected from you. Good Luck" );
		System.out.print("\n1.send me your last pic you clicked with your mobile \n :");
		done= d.nextLine();
		System.out.print("\n2. give me your whatsapp no.\n :");
		dtwo= d.nextLine();
		System.out.print("\n3. dedicate me a song.\n :");
		dthree= d.nextLine();
		System.out.print("\n4. send me ur crush/lover pic?\n :");
		dfour= d.nextLine();
	}
}

package week5.exercises;
import java.util.Scanner;

public class ArrayDemo {

	public void arrayOfName() {
		
		System.out.print("How many names you want to enter: ");
		Scanner u1 = new Scanner(System.in);
		int n;
		n = u1.nextInt();
		
		System.out.println("Enter top " +n+" names of the player in BD Cricket Team");
		
		Scanner u2 = new Scanner(System.in);
		String name[] = new String[n];
		
		for(int i=0; i<name.length; i++) {
			
			System.out.print("Name "+(i+1)+": ");
			name[i] = u2.nextLine();
		}
		
		System.out.print("The top names you entered are: ");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
		}
		
	}

	
}

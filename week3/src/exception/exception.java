package exception;
import java.util.Scanner;
public class exception {
	int flag=1;
	void exception() {
		
Scanner input = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);
do {
	try {
		System.out.print("\tEnter the first number: ");
		int x = input.nextInt();
		System.out.print("\tEnter the second number: ");
		int y = input2.nextInt();
		int div = x/y;
		System.out.println("Result: "+x+" / "+y+" = "+div+"\n");
		flag=2;
		}
		catch (Exception e1) { 
		  System.out.print(e1);
		}
		finally {
			if (flag==2) {
				System.out.println("\n\n\tTask completed");
			}
			else
			{
			System.out.println("\n\n\tEnter number again");
		}
		}
}  while (flag==1);
	}	
}

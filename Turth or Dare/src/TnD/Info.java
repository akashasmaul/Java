package TnD;

import java.util.Scanner;

public class Info {
static String name;
static String toname;
static int op;

static Scanner sc=new Scanner(System.in);  
static {
	System.out.println("\t\t***Welcome to Truth and Dare Game***" );
	System.out.print("What is your name: " );
	name= sc.nextLine();
	System.out.print("What is the name of his/her who gave you the task: " );
	toname= sc.nextLine();
	System.out.println("\n" );
	
}

static void info() {

	System.out.print("Select Truth (1) or Dare(2) and (3) exit: " );
	op= sc.nextInt();
	if (op==1) {
		Truth.truth();
		output.output();
		System.out.println("" );
		info();
	}
	else if (op==2)
	{
		Dare.dare();
		output.output();
		System.out.println("" );
		info();
	}
	else if (op==3)
	{
		System.out.println("Exting" );
	}
	else {
		System.out.println("Wrong input, please try again" );
		System.out.println("" );
		info();
	}
}
}

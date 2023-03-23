package Finalprojectjava;
import java.util.Scanner;

public class Laboratory {
	String fecility;
	int lab_cost;
	   
	 public Laboratory (String fecility,int lab_cost) {
		 
		 
		 this.fecility=fecility;
		 this.lab_cost=lab_cost;
		 }
	 
	 public void displaylaboratory() {
		 
		 System.out.print( fecility +"\t\t\t");
		 System.out.print( lab_cost +"\t\t\t\n");
	 
	 }
	 
	 
	 void displaylaboratory(int a)
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Medical Test:-");
	        fecility = input.nextLine();
	        System.out.print("lab cost-");
	        lab_cost = input.nextInt();
	    }
	

}

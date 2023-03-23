package Finalprojectjava;
import java.util.Scanner;

public class Facility {
	String fec_name;
	   
	 public Facility(String fec_Name) {
		
		 
		 this.fec_name = fec_Name;
		 }
	 
	 public void displayfacility() {
		 
		 System.out.print(fec_name +"\n");
	 
	 }
	 
	 public final void displayfacility(int a)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("fecility:-");
         fec_name = input.nextLine();
     }
	 

}

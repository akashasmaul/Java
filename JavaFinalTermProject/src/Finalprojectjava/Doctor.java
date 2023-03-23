package Finalprojectjava;
import java.util.Scanner;

public class Doctor extends Person {
	public int droom;
    public String  specilist, appointment, doc_qual;

   public void displaydoctor() {
       super.showperson();
        
           System.out.print(specilist+"\t\t\t");
           System.out.print(appointment+"\t\t\t");
           System.out.print(doc_qual + "\t\t\t");
           System.out.print(droom);
           System.out.println("\n");

   }

   void new_doctor()
   {

       Scanner input = new Scanner(System.in);
       
       System.out.println("ID:-");
       name=input.nextLine();
       System.out.println("Name:-");
       name=input.nextLine();
       System.out.println("specilization:-");
       specilist = input.nextLine();
       System.out.println("work time:-");
       appointment = input.nextLine();
       System.out.println("Qualification:-");
       doc_qual = input.nextLine();
       System.out.println("room no.:-");
       droom = input.nextInt();


   }


}

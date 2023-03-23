package Finalprojectjava;
import java.util.Scanner;

public class Patient extends Person {
	String  disease, sex, admit_status;
    String age;
    
    public void displaypatient() {
        super.showperson();

        System.out.print(disease+"\t\t");
        System.out.print(sex+"\t\t");
        System.out.print(admit_status+"  \t\t");
        System.out.print(age+"\t\t");
        System.out.println("\n");

    }

    void new_patient()
    {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("ID:-");
        name=input.nextLine();
        System.out.println("Name:-");
        name=input.nextLine();
        System.out.print("Disease:-");
        disease = input.nextLine();
        System.out.print("Sex:-");
        sex = input.nextLine();
        System.out.print("Admit Status:-");
        admit_status = input.nextLine();
        System.out.print("Age.:-");
        age = input.nextLine();
    }

}

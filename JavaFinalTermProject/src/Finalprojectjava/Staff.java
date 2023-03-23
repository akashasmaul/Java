package Finalprojectjava;
import java.util.Scanner;

public class Staff {
	
	String  name, sex;
    int salary;


    public Staff (String name, String Sex, int Salary){
        this.name = name ;
        this.sex = Sex ;
        this.salary = Salary ;
    }

    public void displaystaff() {
    	 
          System.out.print( name + "\t " );
          System.out.print(sex + "\t\t\t ");
          System.out.print(salary + " \t\t\t");
          System.out.println("\n");

   }



     void new_staff()
    {
        Scanner input = new Scanner(System.in);
        

        System.out.print("name:-");
        name = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    void staff_info() {


        System.out.println("     \t" + sex + "    \t" + salary);

    }

}

package classtest;

public class Employee extends Person{
int employeeID, salary;
String startDate;

public void displayPerson() {
	super.name="Akkkkkash";
	super.displayPerson();	
	System.out.println("Employee ID: " + employeeID + "\nSalary: " + salary + "\nStart Date: " + startDate);
}

}


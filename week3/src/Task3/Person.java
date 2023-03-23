package Task3;

public abstract class Person 
{
String firstName;
String lastName;
String pro;
void describeFullName (String a, String b) {
	this.firstName = a ;
	this.lastName= b ; 
	System.out.println("Name: "+firstName + " "+ lastName);}

public abstract void describeProfession(String s); 

}

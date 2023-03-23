package Finalprojectjava;
import java.util.Scanner;

public class Login {
	static {
        System.out.println(" * * * *Prove yourself as a Administrator by providing correct username and password* * * * ");
        System.out.println("");
}
	
	void Login (){
	
		
		Scanner sc = new Scanner(System.in);
        String user, pass;
        
        
        System.out.print("Enter your name:");
        user= sc.nextLine();
        
        System.out.print("Enter your password:");
        pass= sc.nextLine();
        
        if(user.equals(user) && (pass.equals("250417"))) {
        	System.out.println("Logged in");
        	}
        
        else {
        	System.out.println("Invalid Login");
        	System.exit(1);
        }
        
	}

}
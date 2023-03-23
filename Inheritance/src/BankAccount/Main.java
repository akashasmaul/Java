package BankAccount;

public class Main {

	public static void main(String []args) {
		OverdraftAccount ac =new OverdraftAccount ();
		ac.setAccountnumber(1012);
		ac.setOwnersname("Akash");
		System.out.println("Username Name: "+ac.getOwnersname());
		System.out.println("Account Number: "+ac.getAccountnumber());
		ac.balance=700.0f;
		System.out.println("Balance :"+ac.getbalance());
		ac.Deposite(1000.0f);
		ac.withdraw(300.0f);
			
	}
}

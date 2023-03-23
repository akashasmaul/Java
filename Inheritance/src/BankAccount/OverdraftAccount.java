package BankAccount;

public class OverdraftAccount extends BankAccount {
		static float limit=500.0f;
		
	 public void withdraw (float anAmount) {
		
		if((anAmount>0.0) && (getbalance()+limit>anAmount)) {
			
			super.balance = balance-anAmount;
			System.out.println("After withdraw the Balance is :"+getbalance());
			
		}
		else{
			
			System.out.println("Sorry, Insufficient Balance");
		}
			
		}
}

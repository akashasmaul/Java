package BankAccount;

public class BankAccount {
private String ownersname;
private int accountnumber;
protected float balance;
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public String getOwnersname() {
	
	return ownersname;
}
public void setOwnersname(String ownersname) {
	this.ownersname = ownersname;
}
public float getbalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public void Deposite (float anAmount) {
	if (anAmount>0.0) {
		this.balance = balance + anAmount;
		System.out.println("Balance before withdraw: "+getbalance());
}
	else 
	{
		System.out.println("Sorry, Transiction not possible");
	}
}
public void withdraw(float anAmount) {
	if((anAmount>0.0) && (balance>anAmount))
	{
		
	this.balance = balance-anAmount;
	}
	}
 }
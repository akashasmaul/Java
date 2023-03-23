class Account {
	private String userName;
	private int userId;
	private double balance;
	public static String bankName = "Los Santos Maze Bank ";
	
	static {
		System.out.print("Welcome to the " + bankName);
		}
	public Account (String userName, int userId,double initialBalance) {
		this.userName = userName;
		this.userId= userId;
	if (initialBalance > 0.0) {
		this.balance= initialBalance;
		}
	else {
		System.out.print("Initial Balance can not be zero");
	} 
	}
	public double getBalance() {
		return balance;
	}
	public void setCredit (double amount) {
		if (amount >0.0) {
			this.balance=this.balance + amount;
		}
		else {
			System.out.println("Credit amount cannot be 0 or negative.");
		}
	}
	public void setDebit(double amount){
		if(amount>0.0 && amount<balance ) {
			this.balance = this.balance - amount;
		}
		else {
			System.out.println("Debit amount cannot be 0 or negative or greater than the balance.");
		}
	}
	public void showAccountDetails() {
		System.out.println("User Name = " + userName);
		System.out.println("User Id = " + userId);
		System.out.println("Bank Name = " + bankName);
		System.out.println("Balance = " + balance);
 }
	public static void main(String[] args) {
		Account account1 = new Account ("Akash", 1010, 21323.23);
		System.out.println();
		System.out.println();
		System.out.println("Initial Balance and information:");
		account1.showAccountDetails();
		
		System.out.println();
		System.out.println("Balance information after deposit:");
		account1.setCredit(5500.0);
		account1.getBalance();
		account1.showAccountDetails();
		
		System.out.println();
		System.out.println("Balance information after withdrawal:");
		account1.setDebit(26456500.0);
		account1.getBalance();
		account1.showAccountDetails();
}
	}

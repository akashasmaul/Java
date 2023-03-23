package week3.exercises;

public class Test {
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

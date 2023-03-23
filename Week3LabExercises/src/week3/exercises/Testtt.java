package week3.exercises;

 class Testtt {
	 private int x;

	  // Constructor with a parameter
	  public Testtt(int y) {
	    this.x = y;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
	    Testtt myObj = new Testtt(5334);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}
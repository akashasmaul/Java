package methodOverloading;

public class DifferentReturnType {

	 int add(int x, int y) {
		return x+y;
	}
	 double add(double x , double y, double z) {
		 return x+y+z;	
	}
	 float add(float x, float y) {
		 return x+y;
}
	 void add() {
	System.out.println("The sum of (add(5, 5)) + add(5.0,5.0, 5.0) +add(5.0f, 5.f) is+(add(5, 5)) + add(5.0,5.0, 5.0) +add(5.0f, 5.f) "); 
}
	 
}

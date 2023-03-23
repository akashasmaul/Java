package methodOverloading;

public class DifferentTypesOfParameter {
	void disp(char c) {
		System.out.println("value of disp(char c) method = "+c);
	}
	void disp(int i) {
		System.out.println("value of disp(int i) method = "+i);
	}
	void disp(boolean bo) {
		System.out.println("value of disp(boolean bo) method ="+bo);
	}
	void disp(double d) {
		System.out.println("value of disp(double d) method = "+d);
	}
	void disp(float f) {
		System.out.println("value of disp(float f) method = "+f);
	}
	void disp(String mgs) {
		System.out.println("value of disp(String mgs) method = "+mgs);
	}
}

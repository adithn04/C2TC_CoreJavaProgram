// Program to demonstrate final Variable
package DaySix.usingfinal;

public class FinalVariable {

	//final int x; // final instance variable must be initialized

	final int x = 100;

	// Declare a static blank final variable.
	final static int Y;

	// Declare & initialize static final variable.
	final static int Z = 10;
//d
	// instance method
	void change() {
		int x = 30; // final variables can't be reassigned
		int Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		int Z = 100; // Once initialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}

}

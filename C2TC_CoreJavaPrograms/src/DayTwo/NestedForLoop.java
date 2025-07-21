package DayTwo;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int init=10;
		int end=20;

		for (int i = init; i <= end; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("Answer of "+i + "*" + j + " is " + i * j);
			}
			System.out.println();

		}

	}
	
}

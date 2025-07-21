package DayTwo;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 15;
		 int x = 30;
		System.out.println("a and b value before: " + a + " " + b);

		++a;
		int c = ++a + b + a--;
		
		System.out.println("c value after: " + c);

		int d = c++ + a + b--;
		
		System.out.println("d value after: " + d);

		System.out.println("a,b,c,d values after: " + a + " " + b + " " + c + " " + d);
				
		  x = (10 == x) ? 1 : 0;	
		  System.out.println(x);
	}

	}




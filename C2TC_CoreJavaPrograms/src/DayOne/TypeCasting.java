package DayOne;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit
		byte a = 10;
		int b = a;
		System.out.println(b);
		
		float c = 3.14f;
		double d = c;
		System.out.println(d);
		
		char ch = 'A';
		int num = ch;
		System.out.println(num);
		
		char Uni = '\u00A7';
		int Code = Uni;
		System.out.println(Code);
		
		//explicit
		
		double aa = 3.14f;
		long lg = (long) aa;
		System.out.println(lg);

		long lg2 = 923372036854775806l;
		int num2 = (int) lg2;
		System.out.println(num2);

		float flo = 3.14f;
		int val = (int) flo;
		System.out.println(val);

		byte by = 97;
		char ch2 = (char) by;
		System.out.println(ch2);

	}

}

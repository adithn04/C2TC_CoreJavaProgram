package day2;
import java.util.*;

public class InputMethod {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String a = ia.nextLine();
		System.out.println("Hello "+a);
		
		Scanner ib = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String b = ib.next();
		System.out.println("Hello "+b);
		
		Scanner ic  = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		char c = ic.next().charAt(0);
		System.out.println("Hello "+c);

	}

}

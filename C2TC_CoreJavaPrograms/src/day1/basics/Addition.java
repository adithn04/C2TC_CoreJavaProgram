package day1.basics;

public class Addition {
	public static void main(String[] args) { //(String[] args) took the values as string ["19","45"]
		int a,b,c;
		a = Integer.parseInt(args[0]);//convert the string in 0th index value to integer
		b = Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("Addition of "+a+ " and " +b+ " is " +c);
	}
}

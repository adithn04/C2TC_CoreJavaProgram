package day1.basics;

import java.util.*;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the vals.: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of "+a+ " and " +b+ " is " +c);
	}
}

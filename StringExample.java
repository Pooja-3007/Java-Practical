package mypackage;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter your String");
		String s = sc.nextLine();

		StringBuilder reverseString = new StringBuilder(s);
		reverseString.reverse();
		String result = reverseString.toString();

		System.out.println("Reversed String : "+result);

		System.out.println("Upper Case of String : "+s.toUpperCase());

	}

}
package mypackage;

import java.util.Scanner;

public class StringExample2 {

	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String");
		str1 = sc.nextLine();

		System.out.println("Enter second String");
		str2 = sc.nextLine();

		if (str1.contains(str2))
		{
			System.out.print("It contains another string.");
		}

		else
		{
			System.out.print("It doesn't contain another string.");
		}
	}
}
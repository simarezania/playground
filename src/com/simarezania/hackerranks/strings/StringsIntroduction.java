package com.simarezania.hackerranks.strings;

import java.util.Scanner;

public class StringsIntroduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		if (A.compareTo(B) > 0)
			System.out.println("Yes");

		else
			System.out.println("No");
		System.out.println(A.compareTo(B));
		System.out.println(B.compareTo(A));
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

		// Scanner.close;
		/* Enter your code here. Print output to STDOUT. */

	}

}

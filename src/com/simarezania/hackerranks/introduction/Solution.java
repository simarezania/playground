package com.simarezania.hackerranks.introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		try {
			testMe();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
	}

	private static void testMe() throws Exception {
		
		Scanner in = new Scanner(System.in);
		try {

			int t = in.nextInt();
			if (t > 100) {
				throw new Exception("Your number should be less than 100");
			}
			System.out.println("t= " + t);
		} catch (InputMismatchException e) {
			throw new Exception("Please enter only numeric characters", e);
		} finally {
			in.close();
		}

	}

	public static void main2(String[] argh) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[][] list = new int[t][3];
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			list[i][0] = a;
			list[i][1] = b;
			list[i][2] = n;
		}
		in.close();

		for (int i = 0; i < t; i++) {

			int k = list[i][0] + list[i][1] * (int) Math.pow(2, 0);
			System.out.print(k + " ");
			for (int j = 1; j <= list[i][2] - 1; j++) {
				k = list[i][1] * (int) Math.pow(2, j) + k;
				System.out.print(k + " ");
			}
			System.out.println("");
		}

	}

}

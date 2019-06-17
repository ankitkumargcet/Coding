package com.coding.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Please provide number inputs.");
		System.out.print("Number_1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.print("Number_2: ");
		int n2 = sc.nextInt();
		remainder(n1, n2);
		sc.close();

	}

	// Logic for finding remainder without '%' operator
	public static void remainder(int n1, int n2) {
		int remainder = n1 - (n1 / n2) * n2;
		System.out.println("Remainder is: " + remainder);
	}

}

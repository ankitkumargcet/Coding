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
		add(n1, n2);
		sc.close();

	}

	// Logic for Number addition without '+' operator
	public static void add(int n1, int n2) {
		int carry;
		while (n2 != 0) {
			carry = n1 & n2;
			n1 = n1 ^ n2;
			n2 = carry << 1;
		}
		System.out.println("Sum is: " + n1);
	}

}

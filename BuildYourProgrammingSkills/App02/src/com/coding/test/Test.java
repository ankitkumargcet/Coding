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
		System.out.println();
		System.out.println("Number Before Swap");
		System.out.println("Number_1: " + n1 + "\nNumber_2: " + n2);
		System.out.println();
		System.out.println("Number After Swap");
		swap(n1, n2);
		sc.close();

	}
	
	// Logic for Number swap with bitwise operator
	public static void swap(int n1, int n2) {
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		System.out.println("Number_1: " + n1 + "\nNumber_2: " + n2);
	}

}

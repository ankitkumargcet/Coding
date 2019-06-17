package com.coding.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Please provide count of natural number: ");
		System.out.print("Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		naturalNumber(n);
		sc.close();

	}

	// Logic for n natural number
	public static void naturalNumber(int n) {
		int number = 0;
		System.out.println("Requested Natural numbers are:");
		while(n>0) {
			System.out.print(++number+" ");
			n--;
		}
	}

}

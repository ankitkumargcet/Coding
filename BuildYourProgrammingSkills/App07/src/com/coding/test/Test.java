package com.coding.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Please provide a year value to check.");
		System.out.print("Year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		isLeapYear(year);
		sc.close();

	}

	// Logic for Leap Year Check
	public static void isLeapYear(int year) {
		if ((year % 400 == 0 || year % 4 == 0) && (year % 100 != 0)) {
			System.out.println(year + " is a leap Year!!");
		} else
			System.out.println(year + " is not a leap Year!!");
	}

}

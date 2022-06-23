package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class PerfactNUmber {

	public static void main(String[] args) {

		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number:- ");
		int number = scanner.nextInt();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " Number is perfect.");
		} else {
			System.out.println(number + " Number is not perfect.");
		}
	}

}

package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class FabonaccciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number till you want find fibonacci series:- ");
		int number = scanner.nextInt();

		int sum = 0;
		int number1 = 0, number2 = 1;

		System.out.print(number1 + " " + number2 + " ");

		while (sum <= number) {
			sum = number1 + number2;
			if (sum >= number)
				break;
			System.out.print(sum + " ");
			number1 = number2;
			number2 = sum;
		}
	}

}

package com.count;

import java.util.Scanner;

public class Digit_Count_Finder {
	
	public static void countDigit(int number) {
		int originalNumber = number;
		int n=0;
		while(originalNumber != 0) {
			originalNumber /= 10;
			++n;
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter the number: ");
		int number = scanner.nextInt();
		Digit_Count_Finder.countDigit(number);
	}

}

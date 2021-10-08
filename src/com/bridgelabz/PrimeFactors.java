package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int givenNumber;
		int temp;
		int smallestPrimeNumber = 2;
		System.out.print("Enter any number: ");
		givenNumber = scanner.nextInt();
		temp = givenNumber;
		
		System.out.print("Prime Factor of Number : ");
		while(temp > 1) {
			if(temp % smallestPrimeNumber == 0) {
				System.out.print(smallestPrimeNumber + " ,");
				temp = temp / smallestPrimeNumber;
			}
			else {
				smallestPrimeNumber++;
			}
		}
		
	}
	

}

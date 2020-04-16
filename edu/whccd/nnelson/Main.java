package edu.whccd.nnelson;
import java.util.Scanner;

/*
This was made to demonstrate how to use for and while loops.
Author: Nicolay Nelson
 */
public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer (20-50):");
			int limit = input.nextInt();
			if (limit < 20 || limit > 50) {
				System.out.println("Invalid input");
				System.exit(0);
			} else {
				System.out.println("Increasing even numbers using for loop");
				for (int i = 1; i <= limit; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
			}
			System.out.println("**************************************************");
			System.out.println("Decreasing odd numbers using while loop");
			int currentNumber = limit;
			while (currentNumber > 0) {
				currentNumber = limit--;
				if (currentNumber % 2 == 1) {
					System.out.println(currentNumber);
			}
		}
	}
}
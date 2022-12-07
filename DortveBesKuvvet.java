package donguler;

import java.util.Scanner;

public class DortveBesKuvvet {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		number = input.nextInt();
		
		for(int i = 1; i<=number; i*=4) {
			System.out.println("Powers of 4 up to the entered number: " + i);
		}
		for (int i = 1; i<=number; i*=5) {
			System.out.println("Powers of 5 up to the entered number: " + i);
		}
	}

}

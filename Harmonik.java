package donguler;

import java.util.Scanner;

public class Harmonik {

	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");	
		n = input.nextInt();
		
		double total = 0;
		
		for (int i = 1; i<=n; i++) {
			total += (1.0/i);
		}
		System.out.println(total);

	}

}

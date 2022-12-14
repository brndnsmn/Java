package donguler;

import java.util.Scanner;

public class UsCarpimi {

	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);
		System.out.println("Üssü alınacak sayıyı giriniz.");
		x = input.nextInt();
		System.out.println("Üssü giriniz.");
		y = input.nextInt();
		int total = 1;
		
		for (int i = 1; i<=y; i++) {
			total *= x;
		}
		System.out.println("Answer is = "+ total);
	}

}

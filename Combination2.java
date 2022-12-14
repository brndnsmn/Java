package donguler;

import java.util.Scanner;

public class Combination2 {

	public static void main(String[] args) {
		int n, r, a;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter n and r numbers.");
		n = input.nextInt();
		r = input.nextInt();
		int total=1, totalr=1, totala = 1;
		a = (n-r);
		
		for (int i = 1; i<=n; i++) {
		 	total = total*i;
				
		}
		for (int i=1; i<=r; i++) {
			totalr = totalr*i;
		}
		for (int i = 1; i<=a; i++) {
			totala= totala*i;
		}
	
		System.out.println("C(n,r)= " + total/(totalr*totala));
	}
}

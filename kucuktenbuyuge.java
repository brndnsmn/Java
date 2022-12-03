package kosulluifadeler;
import java.util.Scanner;
public class kucuktenbuyuge {

	public static void main(String[] args) {
		int a1, a2, a3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		a1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		a2 = input.nextInt();
		
		System.out.println("Enter the third number:");
		a3 = input.nextInt();
		
		if (a1>a2 && a1>a3) {
			if(a2>a3) {
				System.out.println("a1>a2>a3");
			}
			else {
				System.out.println("a1>a3>a2");
			}
			}
		else if (a2>a1 && a2>a3) {
			if(a1>a3) {
				System.out.println("a2>a1>a3");
		}
			else {
				System.out.println("a2>a3>a1");
			}
		}
		else {
			if(a1>a2) {
				System.out.println("a3>a1>a2");
			}
			else {
				System.out.println("a3>a2>a1");
			}
		}
	}

}

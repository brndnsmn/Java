package kosulluifadeler;

import java.util.Scanner;

public class HesapMakine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1, n2, select;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the first number");
		n1 = input.nextInt();
		System.out.println("Please enter the second number");
		n2 = input.nextInt();
		
		System.out.println("Please select your operation");
		select = input.nextInt();
		
		switch (select)
		{
		case 1:
			System.out.println("Plus: " + (n1+n2));
			
		case 2:
			System.out.println("Minus: " + (n1-n2));
			
		case 3:
			System.out.println("Multiply: " + (n1*n2));
			
		case 4:
			if(n2 != 0) {
				System.out.println("Divid: " + (n1/n2));
			}
			else {
				System.out.println("A number connot be divided by zero!");
			}
			
		default:
			System.out.println("You entered an invalid number! Please try again");
		}
		
		
	}

}

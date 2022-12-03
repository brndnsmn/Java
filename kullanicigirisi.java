package kosulluifadeler;

import java.util.Scanner;

public class kullanicigirisi {

	public static void main(String[] args) {
		String username, answer, password, password2  ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your username: ");
		username = input.nextLine();
		
		System.out.println("Please enter your password: ");
		password = input.nextLine();
		
		
		
		if (username.equals("brndnsmn")&& password.equals("berna12345"))
		{
			System.out.println("Welcome to our website!");
		}
		else if (username.equals("brndnsmn")&& password != "berna12345" )
		{
			System.out.println("Would you like to reset your password?");
			answer = input.nextLine();
			password2 = input.nextLine();
			if (answer.equalsIgnoreCase("yes")&& password2.equals("berna12345") ) {
				System.out.println("Could not create a password. Please enter another password.");
			}
			else {
				System.out.println("You are logged in.");
			}
		
		}
		else 
		{
			System.out.println("Login failed!");
		}
	}

}

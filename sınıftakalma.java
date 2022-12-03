package kosulluifadeler;
import java.util.Scanner;
public class sınıftakalma {

	public static void main(String[] args) {
		int matematik, fizik, turkce, kimya, muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik notunuz: ");
		matematik = input.nextInt();
		
		System.out.println("Fizik notunuz: ");
		fizik = input.nextInt();
		
		System.out.println("Kimya notunuz:");
		kimya = input.nextInt();
		
		System.out.println("Müzik notunuz:");
		muzik = input.nextInt();
		
		System.out.println("Türkçe notunuz: ");
		turkce = input.nextInt();
		
		double avg = ((turkce+matematik+fizik+kimya+muzik)/5);
		
		if ( avg >= 0 && avg < 55)
		{
			System.out.println("You failed :(");
		}
		else if ( avg >= 55 && avg <= 100 )
		{
			System.out.println("Pass!");
		}
		else 
		{
			System.out.println("Invalid grade");
		}
	}

}

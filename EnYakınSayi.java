import java.util.Arrays;
import java.util.Scanner;

public class EnYakınSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int []list = {15,12,788,1,-1,-778,2,0};
		
		System.out.println("Girilen sayı: ");
		int num = input.nextInt();
		
		int[] newList = {15,12,788,1,-1,-778,2,0,num};
		Arrays.sort(newList);
		
		int min = newList[Arrays.binarySearch(newList, num)-1];
		int max = newList[Arrays.binarySearch(newList, num)+1];
		
		System.out.println("Girilen sayıdan küçük en yakın sayı: "+ min);
		System.out.println("Girilen sayıdan büyük en yakın sayı: "+ max);
		
		
		

		
	}

}

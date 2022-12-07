import java.util.Scanner;

public class UcVeDordeBolunen {

	public static void main(String[] args) {
		int k, total = 0, sayi =0;
		double avg;
		Scanner input = new Scanner (System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		k = input.nextInt();
		
		
		for (int i = 1; i<=k; i++) {
			if (i%12 ==0) {
				total = total + i;
				sayi = sayi + 1;
			}
			
		}
		System.out.println("Ortalama: " + total/sayi);
	}

}

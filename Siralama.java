import java.util.Scanner;
import java.util.Arrays;

public class Siralama {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int num = input.nextInt();
		
		
		int[]list = new int[num];
		System.out.println("Dizinin elemanlarını giriniz: ");
		
		for(int i = 0; i<num; i++ ) {
			System.out.print((i+1)+".Elemanı: ");
			int num2 = input.nextInt();
			System.out.println(num2);
			list[i]= num2;
			
		}
		Arrays.sort(list);
		System.out.print("Sıralama: ");
		System.out.println(Arrays.toString(list));
	}

}

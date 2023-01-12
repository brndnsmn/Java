
public class Palindrom {
	public static boolean isPalindrom(int sayi) {
		int temp = sayi, reverseNumber=0, lastNumber;
		while(temp!=0) {
			//System.out.println("=================");
			//System.out.println("Sayı => "+ temp);
			lastNumber = temp%10;
			//System.out.println("Son basamak "+ lastNumber);
			reverseNumber = (reverseNumber*10)+lastNumber;
			//System.out.println("Yeni sayı "+ reverseNumber);
			temp /= 10;
		}
		if (sayi==reverseNumber) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		/*int number = 3457;
		int a = number%10;   bu adım bize bir sayının son basamağını verir.
		int b = number/10;   bu adım bize, sayımızın son basamağını yok ettirir.
		System.out.println(a);   */ 
		System.out.println(isPalindrom(999));
	}

}

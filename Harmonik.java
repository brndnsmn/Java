
public class Harmonik {

	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		
		for (int i = 0; i<list.length; i++) {
			sum = (sum + (1/list[i]));
		}
		double harmonic = list.length/sum; 
		System.out.println(harmonic);

	}
}

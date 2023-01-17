
public class TekrarEdenCiftSayilar {
	public static boolean isFindBefore(int[]arr, int value) {
		for(int i=0; i<arr.length;i++) {     
			if(arr[i]==value) {          
				return true;
			}
		}
			return false;
	}

	public static void main(String[] args) {
		int[]list = {2,5,7,5,9,5,6,6,6,4,2,12,16,18,12,16};
		int[]duplicate = new int[list.length];
		int startIndex = 0;
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list.length; j++) {
				if((i!=j)&&(list[i]==list[j])) {
					if(!isFindBefore(duplicate,list[i])) {
						duplicate[startIndex++]= list[i];
					}
					break;
				}
			}
		}
		for(int value: duplicate) {
			if((value!=0)&& (value%2==0)) {
				System.out.println(value);
			}
		}

	}

}

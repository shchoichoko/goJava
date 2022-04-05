
public class Sort {
	static int[] numArr = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
	public static void main(String[] args) {
		
		print(1);
		ascending();
		System.out.println("");
		print(2);
		descending();
	}
	
	public static void ascending() {
		int temp = 0;
		for(int i = 0; i < numArr.length; i++) {
			for(int j =i+1; j < numArr.length; j++) {
				if(numArr[i]>numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
			System.out.print(numArr[i]);
			if(i != numArr.length-1) {
			System.out.print(",");
			}
		}
	}
	
	public static void descending() {
		int temp = 0;
		for(int i = 0; i < numArr.length; i++) {
			for(int j =i+1; j < numArr.length; j++) {
				if(numArr[i]<numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
			System.out.print(numArr[i]);
			if(i != numArr.length-1) {
			System.out.print(",");
			}
		}
	}
	
	public static void print(int order) {
		if(order ==1 ) {
			System.out.println("Ascending order");
		}
		else if(order == 2) {
			System.out.println("Decending order");
		}
	}
}

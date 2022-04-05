import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int firstValue = 0,secondValue = 0;
		firstValue = print(1);
		secondValue = print(2);
		combination(firstValue, secondValue);
		
	}

	public static void combination(int first, int second) {
		int[] firstArr = new int[first];
		int[] secondArr = new int[second];
		for(int i = 0;i < firstArr.length;i++) {
			firstArr[i] = i+1;
			
			
			for(int j = 0;j<secondArr.length;j++) {
				secondArr[j] = j+1;
				System.out.println(firstArr[i]+","+secondArr[j]);
			}
			
		}
	}

	public static int print(int order) {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		if(order == 1) {
			System.out.println("Please input the First Number");
			inputNum = sc.nextInt();
			return inputNum;
		}
		else if(order == 2) {
			System.out.println("Please input the Second Number");
			inputNum = sc.nextInt();
			return inputNum;
		}
		else {
			return 0;
		}
	}

}

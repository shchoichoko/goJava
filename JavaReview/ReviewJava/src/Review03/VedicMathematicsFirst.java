package Review03;

import java.util.Scanner;

public class VedicMathematicsFirst {

	public static void main(String[] args) {

		print();
		
	}

	public static void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first two digits ");
		int first = sc.nextInt();
		System.out.println("Please input the last two digits ");
		int second = sc.nextInt();
		System.out.println(calculateVedic(first, second)); 
	}
	
	public static int calculateVedic(int first, int second) {
		int num1 = 100-first; int num2 = 100-second;
		int result = ((100 - (num1+num2))*100) + (num1*num2);
		return result;
	}
}

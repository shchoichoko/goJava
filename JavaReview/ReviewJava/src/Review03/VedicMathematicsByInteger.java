package Review03;

import java.util.Scanner;

public class VedicMathematicsByInteger {

	public static void main(String[] args) {
		print();
	}

	public static void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first two digits ");
		int first = sc.nextInt();
		System.out.println("Please input the last two digits ");
		int second = sc.nextInt();
		System.out.println();
		System.out.printf("%d    \tX\t%d = %d\n",first, second,calculateVedic(first, second));
		System.out.println();
		System.out.printf("100-%d          100-%d\n",first,second);
		System.out.printf("  %d       +       %d        = %d\n",100-first,100-second,100-first+100-second);
		System.out.printf("  %d       *       %d        = %d\n",100-first,100-second,(100-first)*(100-second));
		System.out.println();
		System.out.printf("First two digits : 100 - %d = %d\n",100-first+100-second, 100-(100-first+100-second));
		System.out.printf("Last two digits : %d\n",(100-first)*(100-second));
		System.out.println("Result : " + calculateVedic(first, second));
		
	}
	
	public static int calculateVedic(int first, int second) {
		int num1 = 100-first; int num2 = 100-second;
		int result = ((100 - (num1+num2))*100) + (num1*num2);
		return result;
	}
}

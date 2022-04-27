package Review03;

import java.util.Scanner;

public class VedicMathematicsByString {

	public static void main(String[] args) {
		print();
	}
	public static void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first two digits ");
		String firstStr = sc.nextLine();
		System.out.println("Please input the last two digits ");
		String secondStr = sc.nextLine();
		int first = Integer.parseInt(firstStr);
		int second = Integer.parseInt(secondStr);
		System.out.println();
		System.out.printf("%d    \tX\t%d = %s\n",first, second,calculateVedic(firstStr, secondStr));
		System.out.println();
		System.out.printf("100-%d          100-%d\n",first,second);
		System.out.printf("  %d       +       %d        = %d\n",100-first,100-second,100-first+100-second);
		System.out.printf("  %d       *       %d        = %d\n",100-first,100-second,(100-first)*(100-second));
		System.out.println();
		System.out.printf("First two digits : 100 - %d = %d\n",100-first+100-second, 100-(100-first+100-second));
		System.out.printf("Last two digits : %d\n",(100-first)*(100-second));
		System.out.println("Result : " + calculateVedic(firstStr, secondStr));
	}
	
	public static String calculateVedic(String first, String second) {
		
		int firstNum = Integer.parseInt(first);
		int secondNum = Integer.parseInt(second);
		String result = Integer.toString((100*(100 - ((100 - firstNum) + (100 - secondNum))))+
				((100 - firstNum) * (100 - secondNum)));
		return result;
	}
}

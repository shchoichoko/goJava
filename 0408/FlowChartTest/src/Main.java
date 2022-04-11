import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		calculator(inputNum(1),inputNum(2));
	}
	
	public static int inputNum(int order) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		if(order == 1) {
			System.out.println("Please input the first Number");
			num = sc.nextInt();
		} else {
			System.out.println("Please input the second Number");
			num = sc.nextInt();
		}
		
		return num;
	}
	
	public static void calculator(int num1, int num2) {
		int temp = 0;
		if(num1<num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("Bigger num is.." + num1);
	}
}



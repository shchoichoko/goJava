import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input first number");
		int num1 = sc.nextInt();
		System.out.println("please input second number");
		int num2 = sc.nextInt();
		int gcd = getGCD(num1, num2);
		int temp=0;
		if(num1<num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("GCD : " + gcd);
		System.out.println("LCM : " + (num1 * num2) / gcd);
	}
	public static int getGCD(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return getGCD(num2, num1 % num2);
	}
}

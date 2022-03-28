import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number1");
		int num1 = sc.nextInt();
		System.out.println("Please input a number2");
		int num2 = sc.nextInt();
		int sum=0;
		for(int i=1;i<num1+1;i=i+num2)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}

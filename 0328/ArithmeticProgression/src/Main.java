import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number for sum");
		int num = sc.nextInt();
		int sum = 0;
		for(int index=1;index<=num;index++)
		{
			sum += index;
		}
		System.out.println(sum);
	}

}

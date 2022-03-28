import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number");
		int num = scanner.nextInt();
		if(num==1)
		{
			System.out.println("One!");
		}
		else
		{
			System.out.println("Not One!");
		}
	}

}

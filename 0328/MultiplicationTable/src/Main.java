import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;		
		System.out.println("What number do you want?");
		int num= sc.nextInt();
		for (int index = 2; index < 10; index++) {
			result = index * num;
			System.out.println(num + " X " + index + " = " + result);
		}
	}

}

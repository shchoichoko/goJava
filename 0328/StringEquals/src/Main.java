import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "hello2";
		if(text.equals("hello")==true)
		{
			System.out.println("It's hello");
		}
		else {
			System.out.println("It's not hello");
		}
		if(text.contains("hello")==true)
		{
			System.out.println("It's hello");
		}
		else {
			System.out.println("It's not hello");
		}
	}

}

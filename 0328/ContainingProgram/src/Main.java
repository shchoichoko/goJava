import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		if (text.contains("car") == true) {
			System.out.println("car is included in the input string");
		} else {
			System.out.println("car is not included in the input string.");
		}
		System.out.println(text);
	}

}

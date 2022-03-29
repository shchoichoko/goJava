import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a word.");
		String line = sc.nextLine();
		char[] chars = line.toCharArray();

		String text1 = line.toUpperCase();
		char[] chars2 = text1.toCharArray();

		String text2 = line.toLowerCase();
		char[] chars3 = text2.toCharArray();

		for (int i = 0; i < line.length(); i++) {
			if (chars[i] == (chars2[i])) {
				chars[i] = chars3[i];
			} else if (chars[i] == chars3[i]) {
				chars[i] = chars2[i];
			}
			System.out.print(chars[i]);
		}

	}

}

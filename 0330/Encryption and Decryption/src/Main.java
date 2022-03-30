import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;String str;
		boolean repeat = true;
		int cnt[] = new int[26];
		int value = 0;
		while (repeat) {
			System.out.println("#Menu\n1. Encryption\n2." + " Decryption\n3. Exit");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1: {
				System.out.println("Please input String");
				System.out.print("==>");
				str = sc.nextLine();
				System.out.println(str);
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if (ch >= 'a' && ch <= 'z') {
						value = convertToPw(ch);
					}
					cnt[i] = value;
				}
				System.out.print("Result : ");
				for (int i = 0; i < str.length(); i++) {
					System.out.print((char) cnt[i]);
				}
				System.out.println("");
				break;
			}
			case 2: {
				System.out.println("Please input String");
				System.out.print("==>");
				str = sc.nextLine();
				System.out.println(str);
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if (ch >= 'a' && ch <= 'z') {
						value = convertToNormal(ch);
					}
					cnt[i] = value;
				}
				System.out.print("Result : ");
				for (int i = 0; i < str.length(); i++) {
					System.out.print((char) cnt[i]);
				}
				System.out.println("");
				break;
			}
			case 3: {
				System.out.println("bye bye");
				repeat = false;
				break;
			}
			default: {
				System.out.println("error!");
				break;
			}
			}
		}
	}

	public static int convertToPw(int a) {
		int result;
		result = a + 5;
		if (result > 122) {
			result = result - 26;
		}
		return result;
	}

	public static int convertToNormal(int a) {
		int result;
		result = a - 5;
		if (result < 97) {
			result = result + 26;
		}
		return result;
	}
}

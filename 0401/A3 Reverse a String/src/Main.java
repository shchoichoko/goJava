import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String original;
		original = inputString();
		reverseString(original);
	}
	
	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		String stringSet = " ";
		stringSet = sc.nextLine();
		//stringSet = sc.nextLine();
		
		return stringSet;
	}

	public static void reverseString(String original) {
		//123456
		String reverse="";
		for(int i = original.length()-1;i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		
	}
}

package Review02;

import java.util.Scanner;

public class DrawALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print());
	}

	public static String print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the firstLine(ex:0001) : ");
		String first = sc.nextLine();
		System.out.println("Please input the secondLine(ex:0001) : ");
		String second = sc.nextLine();
		System.out.println("Please input the thirdLine(ex:0001) : ");
		String third = sc.nextLine();
		String checkPass = checkLine(first, second, third);
		return checkPass;
	}

	public static String checkLine(String first, String second, String third) {
		String result = " ";
		if (Integer.parseInt(first) == 0 || Integer.parseInt(second) == 0 || Integer.parseInt(third) == 0) {
			result = "PASS!!";
		} else {
			for (int i = 0; i < first.length(); i++) {
				if (first.substring(i, i + 1).equals("0")) {
					if ((first.substring(i, i + 1).equals(second.substring(i, i + 1))
							&& (first.substring(i, i + 1).equals(third.substring(i, i + 1))))) {
						result = "PASS!!";
					} else {
						result = "Fail!!";
					}
				} 
			}
		}
		return result;
	}
}

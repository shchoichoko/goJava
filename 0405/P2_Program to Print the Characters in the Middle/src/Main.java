import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		String middleStr = " ";
		while (true) {
			String firstStr = main.print();
			middleStr = main.findMiddle(firstStr);
			main.print(middleStr);
		}
	}

	public String print() {
		Scanner sc = new Scanner(System.in);
		String inputString = "";
		System.out.println("Please input a word");
		inputString = sc.nextLine();
		return inputString;
	}

	public void print(String middleStr) {
		System.out.println(middleStr);
		System.out.println(" ");
	}

	public String findMiddle(String inputStr) {
		String middleStr = " ";
		if (inputStr.length() % 2 == 0) {
			middleStr = inputStr.substring(inputStr.length() / 2 - 1, inputStr.length() / 2 + 1);
			return middleStr;
		} else if (inputStr.length() % 2 != 0) {
			middleStr = inputStr.substring(inputStr.length() / 2, inputStr.length() / 2 + 1);
			return middleStr;
		} else {
			return "error";
		}
	}

}

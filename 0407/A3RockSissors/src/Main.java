import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		String result2 = " ";
		result = inputNum();
		System.out.print("Players Choose : ");
		print(result);
		result2 = com(result);
		System.out.println(result2);
	}

	public static String com(int player) {
		String ret = " ";
		int ranNum = (int) (Math.random() * 3);
		// 0은 Rock 1 은 paper 2 는 Sissors
		if (ranNum == 0) {
			if (ranNum - player == 0) {
				ret = "Draw";
			} else if (ranNum - player == -1) {
				ret = "Win";
			} else {
				ret = "Defeat";
			}
		} else if (ranNum == 1) {
			if (ranNum - player == 1) {
				ret = "defeat";
			} else if (ranNum - player == 0) {
				ret = "Draw";
			} else if (ranNum - player == -1) {
				ret = "Win";
			}
		}

		else {
			if (ranNum - player == 2) {
				ret = "Win";
			} else if (ranNum - player == 0) {
				ret = "Draw";
			} else {
				ret = "Defeat";
			}
		}
		return ret;
	}

	public static int inputNum() {
		int num = 0;
		System.out.println("Please input a number!");
		System.out.println("(0 : Rock, 1 : Paper, 2 : Scissor)");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>=0&&num<3) {
			return num;
		} else {
			return 4;
		}

	}

	public static void print(int order) {

		if (order == 0) {
			System.out.println("주먹");
		} else if (order == 1) {
			System.out.println("보");
		} else if(order ==2){
			System.out.println("가위");
		} else {
			System.out.println("error!");
		}

	}
}

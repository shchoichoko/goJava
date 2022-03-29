import java.util.Scanner;

public class Main {
	final static double DOLLAR_RATE = 1220.26;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select a number");
		System.out.println("1. South Korean Won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korean Won");
		int menu = sc.nextInt();
		System.out.println("Pleaes input the money");
		float originMoney = sc.nextInt();
		float result = 0;
		switch(menu)
		{
			case 1:
				result = wonToDol(originMoney);
				System.out.println(Math.round(result*100)/100.0+" USD");
				break;
			case 2:
				result = dolToWon(originMoney);
				System.out.println(Math.round(result*100)/100.0+" WON");
				break;
			default:
				System.out.println("error!");
				break;
		}
		
	}
	public static float wonToDol(float a)
	{
		float value=1;
		value = (float) (a / DOLLAR_RATE);
		return value;
	}
	public static float dolToWon(float a)
	{
		float value=1;
		value = (float) (a * DOLLAR_RATE);
		return value;
	}
}

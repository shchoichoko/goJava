import java.util.Scanner;

public class Main {
	final static double CHANGE_RATE = 9/5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select a number");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
		int menu = sc.nextInt();
		System.out.println("Pleaes input the values");
		float originValue = sc.nextFloat();
		float result = 0;
		switch(menu)
		{
			case 1:
				result = celToFa(originValue);
				System.out.println(Math.round(result*100)/100.0+" °F");
				break;
			case 2:
				result = faToCel(originValue);
				System.out.println(Math.round(result*100)/100.0+" °C");
				break;
			default:
				System.out.println("error!");
				break;
		}
	}
	public static float celToFa(float a)
	{
		float value=1;
		value = (float) ((a * CHANGE_RATE)+32);
		return value;
	}
	public static float faToCel(float a)
	{
		float value=1;
		value = (float) ((a-32)/CHANGE_RATE);
		return value;
	}
}

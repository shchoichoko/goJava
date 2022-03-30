import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0;int balance=0;
		boolean repeat= true;
		while (repeat) {
			System.out.println("#Menu\n1. " + "Deposit\n2. Withdrawal\n3. Exit");
			System.out.print("-> ");
			System.out.println("balance : "+balance+" WON");
			menu = sc.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("Please input the numbers to save");
				int add = sc.nextInt();
				balance = deposit(balance, add);
				break;
			}
			case 2: {
				System.out.println("Please input the numbers to withdraw");
				int getMoney = sc.nextInt();
				if(balance<getMoney)
				{
					System.out.println("Error!");
					continue;
				}
				balance = withdraw(balance, getMoney);
				break;
			}
			case 3:{
				System.out.println("Bye Bye");
				repeat = false;
				break;
			}
			default:{
				System.out.println("Error!");
			}
			}
		}
	}
	public static int deposit(int a,int b)
	{
		int result= a + b;
		return result;
	}
	public static int withdraw(int a,int b)
	{
		int result = a - b;
		return result;
	}
}

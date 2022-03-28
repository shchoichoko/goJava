import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oper;
		int num1,num2;
		int result=0;
		System.out.println("What operation do you want?");
		System.out.println("1. +\n\n2. -\n\n3. *\n\n4. /");
		oper = scanner.nextInt();
		System.out.println("Please input two numbers.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if(oper==1)
		{
			result=sum(num1,num2);
		}
		else if(oper ==2)
		{
			result =minus(num1,num2);
		}
		else if(oper == 3)
		{
			result = multiple(num1,num2);
		}
		else if(oper ==4)
		{
			result = divi(num1,num2);
		}
		else
		{
			System.out.println("Error!");
		}
		
		System.out.println(result);
	}
	static int sum(int a,int b)
	{
		int result;
		result = a+b;
		return result;
	}
	static int minus(int a,int b)
	{
		int result;
		result = a-b;
		return result;
	}
	static int multiple(int a,int b)
	{
		int result;
		result = a*b;
		return result;
	}
	static int divi(int a,int b)
	{
		int result;
		result = a/b;
		return result;
	}

}

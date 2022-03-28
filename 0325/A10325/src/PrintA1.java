import java.util.Scanner;

public class PrintA1 {

	public static void main(String[] args) {
		
		a1();
		a2();
		a3();
		a4();
	}
	public static void a1()
	{
		System.out.print("kim\nlee\njohn\nmike\ndaddy");
	}
	public static void a2()
	{
		System.out.print("Feb.\n");
		System.out.print("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
		System.out.print(" \t1\t2\t3\t4\t5\t6\n");
		System.out.print("7\t8\t9\t10\t11\t12\t13\n");
		System.out.print("14\t15\t16\t17\t18\t19\t20\n");
		System.out.print("21\t22\t23\t24\t25\t26\t27\n");
		System.out.print("28\n");
	}
	public static void a3()
	{
		int result;
		for(int index = 2;index<10;index++)
		{
			for(int index2 = 2;index2<10;index2++)
			{
				result = index*index2;
				System.out.println(index+" X "+index2+" = "+result);
			}
		}
	}
	public static void a4()
	{
		
		final int WIDTH = 10;
		final int HEIGHT = 5;
		int areaOfRectangle = WIDTH * HEIGHT;
		System.out.println(areaOfRectangle);
		
		int variableValue = 10;
		variableValue = 20;
		System.out.println(variableValue);
		
		//Practice Data type
		int type1 = 5;
		char type2 = 'A';
		int type3 = 'A';
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		//Practice if,switch 
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if(number<=15)
		{
			System.out.println("JUMP!");
		}
		else
		{
			System.out.println("WALK!");
		}
		
		System.out.println("Please pick a number for your favorite menu\n");
		System.out.println("1.Burger\n2.Pizza\n3.Chicken\n");
		int menu = scanner.nextInt();
		switch(menu)
		{
			case 1:
			{
				System.out.println("Burger Burger MeatBurger!!");
				break;
			}
			case 2:
			{
				System.out.println("Pizza Pizza CheesePizza!!");
				break;
			}
			case 3:
			{
				System.out.println("Chicken Chicken FriedChicken!!");
				break;
			}
			default:
			{
				System.out.println("WrongNumber!!");
			}
		}
		
	}
}	
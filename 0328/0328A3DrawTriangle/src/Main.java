import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the type of Triangle!");
		System.out.println("1. Right Triangle\n2. Eqilateral Triangle");
		int num=sc.nextInt();
		switch(num) {
		
		case 1:
		{
			System.out.println("Please input a number");
			int n = sc.nextInt();
			int index2=1;
			
			for(int index=0;index<=n;index++)
			{
				for(index2 = 1;index2<index+1;index2++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}
			break;
		}
		case 2:
		{
			System.out.println("Please input a number");
			int n2 = sc.nextInt();
			int index2 = 1;
			for(int index=n2;index<1;index--)
			{
				for(index2 = n2;index2<0;index2++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		
		}
	}

}

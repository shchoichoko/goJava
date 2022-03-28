import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the type of Triangle!");
		System.out.println("1. Right Triangle\n2. Eqilateral Triangle\n3. Inverted Equilateral Triangle");
		int num = sc.nextInt();
		switch (num) {

		case 1: {
			System.out.println("Please input a number");
			int n = sc.nextInt();
			int index2 = 1;

			for (int index = 1; index < n; index++) {
				for (index2 = 0; index2 < index; index2++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
			break;
		}
		case 2: {
			System.out.println("Please input a number");
			int n2 = sc.nextInt();
			for (int index = 0; index < n2; index++) {
				for (int index2 = 0; index2 < n2 - 1 - index; index2++) {
					System.out.print(" ");
				}
				for (int index3 = 0; index3 < 2 * index + 1; index3++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
			break;
		}
		case 3: {
			System.out.println("Please input a number");
			int n3 = sc.nextInt();
			for(int index =0;index<n3;index++)
			{
				for (int index3=0; index3 <index; index3++) 
				{
					System.out.print(" ");
				}
				for(int index2 =(2*n3)-1;index2>index*2;index2--)
				{
					System.out.print("*");
				}
				
				System.out.println(" ");
			}
			break;
		}

		}
	}

}

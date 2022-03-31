import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(main.fac(num) + " = ");
		for(int i = num; i>0;i--) {
			System.out.print(i);
			if(i != 1) {
				System.out.print(" X ");
			}
		}
	}

	public int fac(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * fac(--a);
		}
	}

}

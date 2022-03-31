package newProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cut = 0;
		int num = 0;

		cut = str.indexOf("!");
		num = Integer.parseInt(str.substring(0, cut));

		for (int i = num; i > 0; i--) {
			System.out.print(i);
			if (i != 1) {
				System.out.print("X");
			}
		}
		System.out.print(" = ");
		System.out.print(main.fac(num));
	}

	public int fac(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * fac(--a);
		}
	}

}

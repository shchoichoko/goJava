package newProject;

import java.util.Scanner;

public class Main2 {
	static int num1;
	static int num2;

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("input calculation.");
		String str = sc.nextLine();
		char oper = '0';
		if(str.length()<=2) {
			oper = getOperator1(str);
		}
		else if(str.length()>2) {
			oper = getOperator2(str);
		}
		if (oper == '!') {
			calculate(num1);
		}
		else if(oper == 'P') {
			calculate(num1,num2);
		}
		else if (oper == 'C') {
			calculate2(num1,num2);
		}
	}

	public static int fac(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * fac(--a);
		}
	}

	public static char getOperator1(String formula) {
		char oper = ' ';
		int cut = 0;

		String[] operArr = { "!", "P", "C" };
		for (int i = 0; i < operArr.length; i++) {
			if (formula.contains(operArr[i])) {
				cut = formula.lastIndexOf(operArr[i]);
				num1 = Integer.parseInt(formula.substring(0, cut));
				oper = operArr[i].charAt(0);
			}
		}

		return oper;
	}
	public static char getOperator2(String formula) {
		char oper = ' ';
		int cut = 0;

		String[] operArr = { "!", "P", "C" };
		for (int i = 0; i < operArr.length; i++) {
			if (formula.contains(operArr[i])) {
				cut = formula.lastIndexOf(operArr[i]);
				num1 = Integer.parseInt(formula.substring(0, cut));
				num2 = Integer.parseInt(formula.substring(cut + 1));
				oper = operArr[i].charAt(0);
			}
		}

		return oper;
	}
	public static void calculate(int num) {

		for (int i = num; i > 0; i--) {
			System.out.print(i);
			if (i != 1) {
				System.out.print("X");
			}
		}
		System.out.print(" = ");
		System.out.print(fac(num));
	}

	public static void calculate(int num1, int num2) {
		int result1 = fac(num1);
		int result2 = fac(num2);
		for (int i = num1; i > num2; i--) {
			System.out.print(i);
			if(num2+1<i) {
			System.out.print(" X ");
			}
		}
		
		System.out.print(" = ");
		System.out.println(result1/result2);
	}
	public static void calculate2(int num1, int num2) {
		int result1 = fac(num1);
		int result2 = fac(num2);
		System.out.print("(");
		for (int i = num1; i > num2; i--) {
			System.out.print(i);
			if(num2+1<i) {
			System.out.print(" X ");
			}
		}
		System.out.print(")/(");
		for (int i = num2;i>0; i--) {
			System.out.print(i);
			if(i>1) {
				System.out.print(" X ");
				}
		}
		System.out.print(")");
		System.out.print(" = ");
		System.out.print(result1/result2/num2);
	}

}

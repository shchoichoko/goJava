package Conditional;

import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) {
//		0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
//		���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, 
//		�� �ڸ��� ���ڸ� ���Ѵ�. 
//		�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�.
//		���� ���� ����.
//		26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. 
//		���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
//		���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
//		N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		String origin = sc.nextLine();
		int i = 0;
		if(Integer.parseInt(origin)<10) {
			origin += "0";
		}
		int firstNum = Integer.parseInt(origin.substring(0,1));
		int secondNum = Integer.parseInt(origin.substring(1,2));
		int newNum = 0;
		while(true) {
			
			newNum = getNewNumber(firstNum, secondNum);
			firstNum = newNum/10;
			secondNum = newNum%10;
			i++;
			if(Integer.parseInt(origin)==newNum) {
				break;
			}
		}
		System.out.println(i);
	}
	public static int getNewNumber(int first , int second) {
		int newNumber = 0;
		String a = Integer.toString(newNumber);
		newNumber = Integer.parseInt(Integer.toString(second)+Integer.toString((first+second)%10));
		return newNumber;
	}

}

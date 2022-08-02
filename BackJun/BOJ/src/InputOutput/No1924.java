package InputOutput;

import java.util.Scanner;

public class No1924 {

	public static void main(String[] args) {
//		 ������ 2007�� 1�� 1�� �������̴�. 
//		 �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int [] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String []dayOfTheWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"}; 
		int totalDays = 0;
		if(x==1) {
			totalDays = y;
		} else {
			for(int i = 0; i < (x-1); i++ ) {
				totalDays += days[i];
			}
			totalDays += y;
		}
		if(totalDays % 7 == 0) {
			System.out.println(dayOfTheWeek[6]);
		} else {
			System.out.print(dayOfTheWeek[(totalDays%7)-1]);
		}
		sc.close();
	}
}

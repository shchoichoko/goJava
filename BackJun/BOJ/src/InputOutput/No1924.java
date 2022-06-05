package InputOutput;

import java.util.Scanner;

public class No1924 {

	public static void main(String[] args) {
//		 오늘은 2007년 1월 1일 월요일이다. 
//		 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
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

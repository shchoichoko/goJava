package Conditional;

import java.util.Scanner;

public class No2525 {

	public static void main(String[] args) {
		// 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
		//(단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 
		//디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.nextLine();
		int addMinutes = sc.nextInt();
		int minuteResult = minute+addMinutes;
		if(minuteResult>=60) {
			hour += minuteResult/60;
			minuteResult = minuteResult%60;
			if(hour >= 24) {
				hour = hour%24;
			}
		}
		System.out.print(hour+" "+(minuteResult));
	}

}

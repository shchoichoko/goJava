package Conditional;

import java.util.Scanner;

public class No2525 {

	public static void main(String[] args) {
		// ù° �ٿ� ����Ǵ� �ð��� �ÿ� ���� ������ ���̿� �ΰ� ����Ѵ�. 
		//(��, �ô� 0���� 23������ ����, ���� 0���� 59������ �����̴�. 
		//������ �ð�� 23�� 59�п��� 1���� ������ 0�� 0���� �ȴ�.)
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

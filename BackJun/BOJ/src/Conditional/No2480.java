package Conditional;

import java.util.Scanner;

public class No2480 {

	public static void main(String[] args) {
//		1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 
//		���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
//		���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
//		��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
//		���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�.
//		�� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 
//		3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
//		3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int reward = 0;
		if ((first > 0 && first < 7) && (second > 0 && second < 7) && (third > 0 && third < 7)) {
			if (first == second && first == third) {
				reward = 10000 + (first * 1000);
			} else if (first == second) {
				reward = 1000 + (first * 100);
			} else if (second == third) {
				reward = 1000 + (second * 100);
			} else if (first == third) {
				reward = 1000 + (first * 100);
			} else if (first != second && second != third) {
				if (first < second) {
					first = second;
				}
				if (first < third) {
					first = third;
				}
				reward = first * 100;
			}
		}
		System.out.println(reward);

	}

}

package AboutArray;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
//		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
//		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
//		�̾ N���� ������ �־�����. 
//		������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		Scanner sc = new Scanner(System.in);
		//int caseNum = sc.nextInt();
		int count = 0;
		//while(count<caseNum) {
			getRate(sc.nextInt());
			count++;
		//}
		
	}
	
	public static void getRate(int peopleNum) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int grade = 0;
		int [] peopleArray = new int[peopleNum];
		double avg =0;//��� ����
		System.out.println(peopleNum);
		int upperPeople = 0;//����� �Ѵ� �л� ��
		for(int i = 0; i < peopleNum; i ++ ) {
			grade = sc.nextInt();
			peopleArray[i] = grade;
			sum += grade;
			System.out.print(peopleArray[i]);
		}
		
		System.out.println(sum);
		avg = sum/peopleNum;
		System.out.println(avg);
		for(int j = 0; j < peopleNum; j ++ ) {
			if(peopleArray[j] > avg) {
				upperPeople++;
			}
		}
		//System.out.printf("%f\n",(upperPeople/peopleNum)*100.0);
	}

}

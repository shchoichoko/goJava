package AboutArray;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
//		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
//		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
//		�̾ N���� ������ �־�����. 
//		������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		for(int index = 0; index < caseNum; index ++) {
			int peopleNum = sc.nextInt();
			int sum = 0;
			int [] gradeArray = new int[peopleNum];
			double avg =0;	//��� ����
			int upperPeople = 0;	//����� �Ѵ� �л� ��
			for(int i = 0; i < peopleNum; i ++ ) {
				gradeArray[i] = sc.nextInt();
				sum += gradeArray[i];
			}
			avg = sum/peopleNum;
			for(int j = 0; j < peopleNum; j ++ ) {
				if(gradeArray[j] > avg) {
					upperPeople++;
				}
			}
			System.out.printf("%.3f",(upperPeople/(double)peopleNum)*100.0);
			System.out.println("%");
		}
		sc.close();
	}
	
}

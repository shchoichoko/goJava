package AboutArray;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
//		이어서 N명의 점수가 주어진다. 
//		점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
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
		double avg =0;//평균 점수
		System.out.println(peopleNum);
		int upperPeople = 0;//평균을 넘는 학생 수
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

package AboutArray;

import java.util.HashSet;
import java.util.Scanner;

public class No3052 {

	public static void main(String[] args) {
//		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
//		���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
//		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
//		�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		int inputNum = 0;
		for(int i = 0; i < 10; i++) {
			inputNum = sc.nextInt();
			hs.add((inputNum)%42);
		}
		System.out.println(hs.size());
	}

}

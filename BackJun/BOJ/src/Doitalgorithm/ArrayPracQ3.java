package Doitalgorithm;

import java.util.Scanner;

public class ArrayPracQ3 {
	
	static int sumOf(int[] a) {
		int sumResult = 0;
		for(int i = 0; i < a.length; i++) {
			sumResult += a[i];
		}
		return sumResult;
	}
	
	public static void main(String[] args) {
		// �迭a�� ��� �հ� ���Ͽ� ��ȯ�ϴ� �޼ҵ� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���.");
		int size = sc.nextInt();
		String showArray = "{";
		int[] iArray = new int[size];
		System.out.println("�迭�� ��Ҹ� �Է��ϼ���");
		for(int i = 0; i < size; i++){
			iArray[i] = sc.nextInt();
			if(i == size -1) {
				showArray = showArray + iArray[i] + "}";
			} else {
				showArray = showArray + iArray[i] + ", ";
			}
		}
		System.out.println("�Է��Ͻ� �迭�� : "+ showArray + "�Դϴ�.");
		System.out.println("�迭 ����� �� �հ�� : "+sumOf(iArray) + "�Դϴ�.");
	}

}

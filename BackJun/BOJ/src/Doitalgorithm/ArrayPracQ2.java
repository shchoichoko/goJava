package Doitalgorithm;

import java.util.Scanner;

public class ArrayPracQ2 {
	//�迭�� �������� �����ϱ�
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i ++ ) {
			for(int j = 0; j < a.length;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
			System.out.println("a[" +i+"]��(��) a["+(a.length-i-1)+"]�� ��ȯ�մϴ�.");
			swap(a, i, a.length -i -1);
		}
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
	
	
	public static void main(String[] args) {
		int[] iArray = {5, 10, 73, 2, -5, 42};
		reverse(iArray);
		
	}

}

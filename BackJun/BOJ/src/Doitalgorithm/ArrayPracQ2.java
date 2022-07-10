package Doitalgorithm;

import java.util.Scanner;

public class ArrayPracQ2 {
	//배열을 역순으로 정렬하기
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
			System.out.println("a[" +i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a, i, a.length -i -1);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	
	public static void main(String[] args) {
		int[] iArray = {5, 10, 73, 2, -5, 42};
		reverse(iArray);
		
	}

}

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
		// 배열a의 모든 합계 구하여 반환하는 메소드 작성하기
		Scanner sc = new Scanner(System.in);
		System.out.println("요소의 갯수를 입력하세요.");
		int size = sc.nextInt();
		String showArray = "{";
		int[] iArray = new int[size];
		System.out.println("배열의 요소를 입력하세요");
		for(int i = 0; i < size; i++){
			iArray[i] = sc.nextInt();
			if(i == size -1) {
				showArray = showArray + iArray[i] + "}";
			} else {
				showArray = showArray + iArray[i] + ", ";
			}
		}
		System.out.println("입력하신 배열은 : "+ showArray + "입니다.");
		System.out.println("배열 요소의 총 합계는 : "+sumOf(iArray) + "입니다.");
	}

}

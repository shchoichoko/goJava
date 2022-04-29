package AboutArray;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
	//	# ArrayList 실습하기 22.04.24 최수혁
		ArrayList k41_iAL = new ArrayList();
		// ArrayList 객체 k41_iAL에 .add를 이용해 값을 추가한다.
		k41_iAL.add("abc");
		k41_iAL.add("abcd");
		k41_iAL.add("efga");
		k41_iAL.add("가나다0");
		k41_iAL.add("1234");
		k41_iAL.add("12rk34");

		System.out.printf("****************************\n");
		System.out.printf(" 시작 ArraySize %d \n", k41_iAL.size());//k41_iAL의 크기
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i, k41_iAL.get(k41_i));
		}	//k41_iAL 전부 출력.
		k41_iAL.set(3, "가라라라");	// 4번째 값을 변경.
		System.out.printf("****************************\n");
		System.out.printf(" 내용변경 ArraySize %d \n",k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i , k41_iAL.get(k41_i));
		}	//k41_iAL 전부 출력.
		k41_iAL.remove(4);	// 5번째 값 삭제.
		System.out.printf("****************************\n");
		System.out.printf(" 어레이리스트 삭제 ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i , k41_iAL.get(k41_i));
		}//삭제 한뒤 현재 k41_iAL 전부 출력.
		k41_iAL.sort(null);//오름차순으로 정렬
		System.out.printf("****************************\n");
		System.out.printf(" 리스트 sort ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i, k41_iAL.get(k41_i));
		}	// 정렬한 리스트 출력.
		k41_iAL.clear();//리스트 안의 내용 전부 삭제.
		System.out.printf("****************************\n");
		System.out.printf(" 전부 삭제 ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i, k41_iAL.get(k41_i));
		}
		
		
	}

}

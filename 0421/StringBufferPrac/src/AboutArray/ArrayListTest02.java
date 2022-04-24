package AboutArray;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
		//	# ArrayList 실습하기(2) 22.04.24 최수혁
		
		int k41_iTestMax = 10000;
		ArrayList k41_iAL = new ArrayList();
		for( int k41_i = 0; k41_i < k41_iTestMax; k41_i ++) {
			k41_iAL.add((int)(Math.random()*1000000));
		}
		System.out.printf("************************************\n");
		k41_iAL.sort(null);
		
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %d\n", k41_i, k41_iAL.get(k41_i));
		}
	}

}

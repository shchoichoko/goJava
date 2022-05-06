package AboutArray;

public class MaxMinArray {

	public static void main(String[] args) {
		// 배열의 최대,최소값 찾기 22.04.24 최수혁 
		int [] k41_iArray = {1,7,5,3,2,1,4,9,212,33,2223,152,67,-55};
		// 배열에 아무 수나 입력
		for(int k41_i = 0; k41_i < k41_iArray.length; k41_i++) {
			//배열의 크기만큼 반복.
			System.out.printf("iArray[%d] = %d\n",k41_i,k41_iArray[k41_i]);
			//배열 값을 순서대로 출력.
		}
		int k41_iMax = k41_iArray[0];int k41_iMin = k41_iArray[0];
		// 최대 최소값을 구하기 위해 우선 첫번째 값으로 초기화 해둔다.
		int k41_iMaxPt = 0;int k41_iMinPt = 0;
		// 최대 최소 값의 순번을 알아내기 위한 변수들.
		for(int k41_i = 0; k41_i < k41_iArray.length; k41_i++) {
			// 최대값을 구하기 위해 비교를 반복하며, k41_iMax값이 비교하려는 수보다 작을때 값을 그 수로 교체.
			if(k41_iMax < k41_iArray[k41_i]) {
				k41_iMax = k41_iArray[k41_i];
				k41_iMaxPt = k41_i;
			}
			// 최소값을 구하기 위해 비교를 반복하며, k41_iMin값이 비교하려는 수보다 클때 값을 그 수로 교체.
			if(k41_iMin > k41_iArray[k41_i]) {
				k41_iMin = k41_iArray[k41_i];
				k41_iMinPt = k41_i;
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", k41_iMaxPt, k41_iMax);
		System.out.printf("MIN : iArray[%d] = %d\n", k41_iMinPt, k41_iMin);
	}

}

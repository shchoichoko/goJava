package AboutArray;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] k41_iArray = {1,7,5,3,2,1,4,9,212,33,2223,152,67,-55};
		for(int k41_i = 0; k41_i < k41_iArray.length; k41_i++) {
			System.out.printf("iArray[%d] = %d\n",k41_i,k41_iArray[k41_i]);
		}
		int k41_iMax = k41_iArray[0];int k41_iMin = k41_iArray[0];
		int k41_iMaxPt = 0;int k41_iMinPt = 0;
		for(int k41_i = 0; k41_i < k41_iArray.length; k41_i++) {
			if(k41_iMax < k41_iArray[k41_i]) {
				k41_iMax = k41_iArray[k41_i];
				k41_iMaxPt = k41_i;
			}
			if(k41_iMin > k41_iArray[k41_i]) {
				k41_iMin = k41_iArray[k41_i];
				k41_iMinPt = k41_i;
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", k41_iMaxPt, k41_iMax);
		System.out.printf("MIN : iArray[%d] = %d\n", k41_iMinPt, k41_iMin);
	}

}

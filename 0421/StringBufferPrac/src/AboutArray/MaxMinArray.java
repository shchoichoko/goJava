package AboutArray;

public class MaxMinArray {

	public static void main(String[] args) {
		// �迭�� �ִ�,�ּҰ� ã�� 22.04.24 �ּ��� 
		int [] k41_iArray = {1,7,5,3,2,1,4,9,212,33,2223,152,67,-55};
		// �迭�� �ƹ� ���� �Է�
		for(int k41_i = 0; k41_i < k41_iArray.length; k41_i++) {
			//�迭�� ũ�⸸ŭ �ݺ�.
			System.out.printf("iArray[%d] = %d\n",k41_i,k41_iArray[k41_i]);
			//�迭 ���� ������� ���.
		}
		int k41_iMax = k41_iArray[0];int k41_iMin = k41_iArray[0];
		// �ִ� �ּҰ��� ���ϱ� ���� �켱 ù��° ������ �ʱ�ȭ �صд�.
		int k41_iMaxPt = 0;int k41_iMinPt = 0;
		// �ִ� �ּ� ���� ������ �˾Ƴ��� ���� ������.
		for(int k41_i = 0; k41_i < k41_iArray.length; k41_i++) {
			// �ִ밪�� ���ϱ� ���� �񱳸� �ݺ��ϸ�, k41_iMax���� ���Ϸ��� ������ ������ ���� �� ���� ��ü.
			if(k41_iMax < k41_iArray[k41_i]) {
				k41_iMax = k41_iArray[k41_i];
				k41_iMaxPt = k41_i;
			}
			// �ּҰ��� ���ϱ� ���� �񱳸� �ݺ��ϸ�, k41_iMin���� ���Ϸ��� ������ Ŭ�� ���� �� ���� ��ü.
			if(k41_iMin > k41_iArray[k41_i]) {
				k41_iMin = k41_iArray[k41_i];
				k41_iMinPt = k41_i;
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", k41_iMaxPt, k41_iMax);
		System.out.printf("MIN : iArray[%d] = %d\n", k41_iMinPt, k41_iMin);
	}

}

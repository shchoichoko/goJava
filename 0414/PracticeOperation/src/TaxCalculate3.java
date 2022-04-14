
public class TaxCalculate3 {
	// #8 Calculate Tax and Get receipt. 22.04.14 . csh
	public static int getNetprice(int k41_price, double k41_taxRate) {
		return (int)(k41_price/(1+k41_taxRate));
	}
	
	public static void main(String[] args) {
		String [] k41_item = {"�����ð�" ,"��������", "���޴���", "���ϸ���"};	// ������ ���� ���
		int[] k41_price = {5000, 2000, 1000, 3000};		//������ ������ �ܰ� 
		int[] k41_amount = {1, 2, 5, 2};	//������ ������ ���� 
		double k41_taxRate = 0.1;		//������ 10%
		int k41_totalSum = 0;	//������ �ݾ�
		System.out.printf("******************************************\n\n");
		System.out.printf("	        ������ ���		\n\n");
		System.out.printf("  �׸�	    �ܰ� \t����	    ��  ��\n\n");
		for(int i = 0; i < k41_item.length; i++) {		//4���� �����̶� 0~3���� i������ Ƚ���� ����.
			int k41_sum = k41_price[i] * k41_amount[i];		// �ܰ� * ���� = �ݾ�
			k41_totalSum += k41_sum;	
			System.out.printf("%.5s %7d \t%2d \t%9d\n", k41_item[i], k41_price[i], k41_amount[i], k41_sum);// �迭 ������ ��ġ�ϱ� ������ �̷��� Ȱ�� ����
		}		
		System.out.printf("\n******************************************\n");
		System.out.printf("���� �ݾ� :		%17d\n\n", k41_totalSum);
		int k41_netPrice = getNetprice(k41_totalSum, k41_taxRate);	// ���� �Լ��� getNetprice �Լ��� �̿���, ���� �ݾ� ���
		int k41_tax = k41_totalSum - k41_netPrice;	// ���� = ���� �ݾ� - ���� �ݾ�
		System.out.printf(" ��  ��  :	\t%17d\n", k41_tax);
		
	}

}

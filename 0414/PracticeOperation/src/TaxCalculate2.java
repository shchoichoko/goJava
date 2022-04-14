
public class TaxCalculate2 {
	// #7 Calculate Tax. 22.04.14 . csh
	public static int netprice(int k41_price, double k41_taxRate ) {
		return (int)(k41_price / (1+k41_taxRate));	//���� ���� ���ϱ�. ���� ���� = �Һ��� ���� / (1+����)
	}
	
	public static void main(String[] args) {
		int k41_price = 1234; //�Һ��ڰ���
		double k41_taxRate = 0.1;	//�ΰ���10%
		
		int k41_netprice = netprice(k41_price, k41_taxRate);	//���� ���� ���ϴ� �޼��� ���.
		int k41_tax = k41_price - k41_netprice;	// ���� = ���İ��� - ���� ����
		
		System.out.printf("******************************************************\n");
		System.out.printf("*	�Һ��ڰ�, ��������, ���� ���                *\n");
		System.out.printf("�Һ��ڰ��� : %d, �������� : %d, ����: %d\n", k41_price, k41_netprice, k41_tax);
		System.out.printf("******************************************************\n");
		
	}

}

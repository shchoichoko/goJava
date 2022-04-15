
public class TaxCalculate {
	// #6 ���� ��� 22.04.14 . csh
	//���� ���ϴ� �޼ҵ�
	public static int taxcal(int k41_val, int k41_rate) {
		int k41_ret;		// ���� ������ ��� ���� �������� ��갪�� ���ٸ� �״�� ����ϰ�, 
		if((double)k41_val*(double)k41_rate/100.0 == k41_val * k41_rate / 100) {
			k41_ret = k41_val * k41_rate / 100;
		}
		else {	//��갪�� �ٸ��ٸ�, ���� 1�� ���Ѵ�.
			k41_ret = k41_val * k41_rate / 100 + 1;
		}
		return k41_ret;
	}
	
	public static void main(String[] args) {
		int k41_val = 271;	//���� ����.
		int k41_rate = 5;	//������ 5%�̴�.
		

		int k41_tax = taxcal(k41_val, k41_rate);	//���� ���ϴ� �޼ҵ�
		
		System.out.printf("***********************************\n");
		System.out.printf("*            �ܼ����ݰ��          *\n");
		System.out.printf("���� ���ݰ��: %f\n", k41_val*k41_rate/100.0);
		
		System.out.printf("���� ����: %d ���� : %d �����԰��� : %d\n",k41_val,k41_tax,k41_val+k41_tax);
		System.out.printf("***********************************\n");
	}

}

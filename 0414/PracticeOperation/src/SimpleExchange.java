
public class SimpleExchange {
	// #9 Simple Exchange. 22.04.14 . csh
	public static void main(String[] args) {
		int k41_myWon = 1000000;	//ȯ���� ��ȭ �ݾ�
		double k41_moneyEx = 1238.21;	//�޷� ȯ��
		double k41_commision = 0.003;	//ȯ�� ������
		int k41_usd = (int) (k41_myWon/k41_moneyEx);	//�޷� = ��ȭ�� �޷� ȯ���� ������ ������ ����ȯ
		int k41_remain = (int) (k41_myWon-k41_usd*k41_moneyEx);		//ȯ���ϰ� ���� �� = ��ȭ - (�޷� * ȯ��) 
		
		System.out.printf("***************************************\n");
		System.out.printf("*	������ ���� ���              *\n");	
		System.out.printf("�� ��ȭȯ�� �ݾ� :  %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", k41_myWon, k41_usd, k41_remain);
		
		System.out.printf("***************************************\n");
		
	}

}

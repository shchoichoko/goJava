import java.text.DecimalFormat;

public class Exchange_includeCommission {
	// #10 Exchange_includeCommission. 22.04.14 . csh
		public static void main(String[] args) {
			int k41_myWon = 1000000;	//ȯ���� ��ȭ �ݾ�
			double k41_moneyEx = 1238.21;	//�޷� ȯ��
			double k41_commission = 0.003;	//ȯ�� ������
			int k41_usd = (int) (k41_myWon/k41_moneyEx);	//�޷� = ��ȭ�� �޷� ȯ���� ������ ������ ����ȯ
			int k41_remain = (int) (k41_myWon-k41_usd*k41_moneyEx);		//ȯ���ϰ� ���� �� = ��ȭ - (�޷� * ȯ��) 
			
			System.out.printf("***************************************\n");
			System.out.printf("*	������ ���� ���              *\n");	
			System.out.printf("�� ��ȭȯ�� �ݾ� :  %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", k41_myWon, k41_usd, k41_remain);
			
			System.out.printf("***************************************\n");
			
			double k41_comPerOne = k41_moneyEx * k41_commission;	// ��ȭ �������� = �޷� ȯ�� * ȯ�� ������
			
			double k41_totalCom = k41_usd * k41_comPerOne;		// ������ = �޷� * ��ȭ ��������
			System.out.printf("***************************************\n");
			System.out.printf("*	������ ���	              *\n");
			System.out.printf("�� ������: %f�� =>  ��ȭ: %d�޷�, �޷��� ������: %f��\n", k41_totalCom, k41_usd, k41_comPerOne);
			System.out.printf("***************************************\n");
			
			int k41_i_totalCom = 0;
			if(k41_totalCom != (double)((int)k41_totalCom)) {	//(int)�� ����ȯ ������ ���ļ�, �Ҽ��� �κ��� ������.
				k41_i_totalCom = (int)k41_totalCom + 1;
			} else {	// �Ҽ��� ���� totalCom�� ���� totalCom ���� �ٸ��ٸ� +1�޷��ѵ� ������ ����ȯ
				k41_i_totalCom = (int)k41_totalCom;
			}	// �Ҽ��� ���� �ݾװ� ��ġ�Ѵٸ� ������ ����ȯ�ؼ� �� ����.
			
			System.out.printf("***************************************\n");
			System.out.printf("*	������ ����ȯ��	              *\n");
			System.out.printf("�� ������: %d�� =>  ��ȭ: %d�޷�, �޷��� ������: %f��\n", k41_i_totalCom, k41_usd, k41_comPerOne);
			k41_remain = (int) (k41_myWon - k41_usd * k41_moneyEx - k41_i_totalCom);	//�ܵ� = ȯ���ұݾ� - �޷�*�޷�ȯ�� - ������
			System.out.printf("�� ��ȭȯ���ݾ�: %d��=> ��ȭ: %d�޷�, ������¡��:%d�� �ܵ�: %d��\n", k41_myWon, k41_usd, k41_i_totalCom, k41_remain);
			System.out.printf("***************************************\n");
			
			k41_usd = (int) (k41_myWon/(k41_moneyEx +k41_comPerOne));	//ȯ�� �޷�
			k41_totalCom = k41_usd * k41_comPerOne+1;	// �� ������
			
			if(k41_totalCom != (double)((int)k41_totalCom)) {	// (int)�� ����ȯ ������ ���ļ�, �Ҽ��� �κ��� ������.
				k41_i_totalCom = (int)k41_totalCom + 1;	//�Ҽ��� �ݾ� ���� ������ ���� ������ ���� �ٸ��ٸ� +1�޷�
			} else {
				k41_i_totalCom = (int)k41_totalCom;	//�Ҽ��� �ݾ� ���� ������ ���� ���ٸ�,k41_i_totalCom�� ������ ���� ����.
			}
			System.out.printf("***************************************\n");
			System.out.printf("*	(��Ȯ��)������ ����ȯ��	      *\n");
			System.out.printf("�� ������: %d��=> ��ȭ: %d�޷�, �޷��� ������: %f��\n", k41_i_totalCom, k41_usd, k41_comPerOne);
			
			k41_remain = (int) (k41_myWon-k41_usd * k41_moneyEx - k41_i_totalCom);	// ��Ȯ�� �ܵ� = ȯ���ұݾ� - (�޷�*ȯ��) - ��ȭ������
			System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��:%d�� �ܵ�: %d��\n", k41_myWon, k41_usd, k41_i_totalCom, k41_remain);
			System.out.printf("***************************************\n");
			
			// #13 Use DecimalFormat. 22.04.14 . csh
			DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###");
			// �޸� ���� �� �ְ� ����� �ִ� DecimalFomat Ŭ���� ���
			System.out.printf("***************************************\n");
			System.out.printf("*	�޸����, ��¥ ����	      *\n");
			System.out.printf("�� ������: %s��=> ��ȭ: %s�޷�, �޷��� ������: %f��\n",
					k41_df.format(k41_i_totalCom),k41_df.format(k41_usd),
					k41_comPerOne);
			k41_remain = (int) (k41_myWon - k41_usd * k41_moneyEx - k41_i_totalCom);
			System.out.printf("�� ��ȭȯ���ݾ�: %s��=> ��ȭ: %s�޷�, ������¡��: %s�� �ܵ�: %s��\n", 
					k41_df.format(k41_myWon),k41_df.format(k41_usd),
					k41_df.format(k41_i_totalCom),k41_df.format(k41_remain));
			
		}

}


public class Example {

	public static void main(String[] args) {
		//#6 ������ �־� ��(ã��) 22.04.15 csh
		int k41_iVal;	//���� ���� ���� ����.
		for(int k41_i = 0; k41_i < 300; k41_i++) {		// k41_i ���� 0���� �ʱ�ȭ�ϰ�, ���� 300�̸��� �� �Ʒ� ������� �����ϰ�, 1�� ������Ŵ
			k41_iVal = 5 * k41_i;						// k41_iVal �� k41_i�� 5�� ���� ���� ����. 5�� ���.
			if(k41_iVal >= 0 && k41_iVal < 10) System.out.printf("�� %d\n",k41_iVal);	// k41_iVal ���ڸ� ��(0�̻�10�̸�) �϶� ������ ������
			else if(k41_iVal >= 10 && k41_iVal < 100) System.out.printf("�� %d\n",k41_iVal);	//k41_iVal ���ڸ� ��(10�̻� 100�̸�) �϶� ������ �����Ѵ�.
			else if(k41_iVal >= 100 && k41_iVal < 1000) System.out.printf("�� %d\n",k41_iVal); //k41_iVal ���ڸ� ��(100�̻� 1000�̸�) �϶� ������ �����Ѵ�.
			else System.out.printf("õ %d\n",k41_iVal);	// �� ���� �� �϶� ������ ����.
		}
	}

}

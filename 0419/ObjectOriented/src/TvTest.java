
public class TvTest {
	//#7 Ŭ���� ��ü �ν��Ͻ� ������ ���� 22.04.20 �ּ���
	public static void main(String[] args) {
		// TvRemocon Ŭ������ ��ü ����.
		TvRemocon k41_tr = new TvRemocon();
		// ä�� 10�� �ø���
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tr.chUp();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		// ä�� 10�� ������.
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tr.chDown();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		//���� 5�� �ø���
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			k41_tr.volUP();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		//���� 5�� ������
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			k41_tr.volDown();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		
	}

}

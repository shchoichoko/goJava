
public class TvTest {
	//#7 Ŭ���� ��ü �ν��Ͻ� ������ ���� 22.04.20 �ּ���
	public static void main(String[] args) {
		TvRemocon k41_tr = new TvRemocon();
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tr.chUp();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		for(int k41_i = 0; k41_i < 12; k41_i++) {
			k41_tr.chDown();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		
	}

}

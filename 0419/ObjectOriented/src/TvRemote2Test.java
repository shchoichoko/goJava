
public class TvRemote2Test {
	// #19 ��� ������ �׽�Ʈ 22.04.20 �ּ���
	static TvRemote2 k41_tv;
	
	public static void main(String[] args) {
		k41_tv = new TvRemote2();
		// TvRemoconX Ŭ������ ��ü ����.
		TvRemoconX k41_tv2 = new TvRemoconX();
		// �ش� Ŭ������ �Լ� ���.
		k41_tv2.checkBattery();
		System.out.printf("MSG k41_tv2[%s]\n", k41_tv2.k41_help);
		
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//ä���� 10�� �ø��� ��
			k41_tv.upCh();
			k41_tv.msgCh("ä�� �ø���");
		}
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//ä���� 10�� ������ ��
			k41_tv.downCh();
			k41_tv.msgCh("ä�� ������");
		}
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			//������ 5�� �ø��� ��
			k41_tv.upVolume();
			k41_tv.msgCh("���� �ø���");
		}
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			//������ 5�� ������ ��
			k41_tv.downVolume();
			k41_tv.msgCh("���� ������");
		}
		

	}

}

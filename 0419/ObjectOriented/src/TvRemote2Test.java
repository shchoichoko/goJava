
public class TvRemote2Test {
	// #15 ������ ������ �׽�Ʈ 22.04.20 �ּ���
	static TvRemote2 k41_tv;
	
	public static void main(String[] args) {
		k41_tv = new TvRemote2();
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tv.upCh();
			k41_tv.msgCh("ä�� �ø���");
		}
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tv.downCh();
			k41_tv.msgCh("ä�� ������");
		}
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			k41_tv.upVolume();
			k41_tv.msgCh("���� �ø���");
		}
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			k41_tv.downVolume();
			k41_tv.msgCh("���� ������");
		}
		

	}

}


public class TvRemocon {
	//#6 Ŭ���� ��ü �ν��Ͻ� ������ 22.04.20 �ּ���
	//������ �ִ� �ּ� ���� �� ä�� ����
	int k41_vol_UpLimit = 30;
	int k41_vol_DownLimit = 0;
	int k41_ch_UpLimit = 30;
	int k41_ch_DownLimit = 0;
	int k41_volNow = 1;	// ���� ����
	int k41_chNow = 1;	// ���� ä��
	String k41_help;	// �޼��� ����� ���� ���ڿ� ����.
	
	// ������ �ø��� �Լ�, ���� ������ �ִ� �ҷ����� ������ �ִ� �����̶��
	// �޽��� ���.
	void volUP() {
		if(k41_volNow == k41_vol_UpLimit) {
			k41_help = "�ִ� �����Դϴ�!";
		} else {
			k41_volNow++;
			k41_help = String.format("Volume : %d", k41_volNow);
		}
	}
	// ������ ������ �Լ�, ���� ������ ���� �ҷ����� ������ ���� �����̶��
	// �޽��� ���.
	void volDown() {
		if(k41_volNow == k41_vol_DownLimit) {
			k41_help = "���� �����Դϴ�!";
		} else {
			k41_volNow--;
			k41_help = String.format("Volume : %d", k41_volNow);
		}
	}
	// ä���� �ø��� �Լ�, ���� ä���� �ִ� ä�ΰ��� ������ �ִ� ä���̶��
	// �޽��� ���.
	void chUp() {	
		if(k41_chNow == k41_ch_UpLimit) {
			k41_help = "�ִ� ä���Դϴ�.";
		} else {
			k41_chNow++;
			k41_help = String.format("Channel : %d ", k41_chNow);
		}
	}
	// ä���� ������ �Լ�, ���� ä���� �ּ� ä�ΰ��� ������ �ּ� ä���̶��
	// �޽��� ���.
	void chDown() {	
		if(k41_chNow == k41_ch_DownLimit) {
			k41_help = "�ּ� ä���Դϴ�.";
		} else {
			k41_chNow--;
			k41_help = String.format("Channel : %d ", k41_chNow);
		}
	}
	
	
}


public class TvRemocon {
	//#6 Ŭ���� ��ü �ν��Ͻ� ������ 22.04.20 �ּ���
	int k41_vol_UpLimit = 30;
	int k41_vol_DownLimit = 0;
	int k41_ch_UpLimit = 30;
	int k41_ch_DownLimit = 0;
	
	int k41_volNow = 1;
	int k41_chNow = 1;
	String k41_help;
	
	
	void volUP() {
		if(k41_volNow == k41_vol_UpLimit) {
			k41_help = "�ִ� �����Դϴ�!";
		} else {
			k41_volNow++;
			k41_help = String.format("Volume : %d", k41_volNow);
		}
	}

	void volDown() {
		if(k41_volNow == k41_vol_DownLimit) {
			k41_help = "�ּ� �����Դϴ�!";
		} else {
			k41_volNow--;
			k41_help = String.format("Volume : %d", k41_volNow);
		}
	}
	
	void chUp() {	
		if(k41_chNow == k41_ch_UpLimit) {
			k41_help = "�ִ� ä���Դϴ�.";
		} else {
			k41_chNow++;
			k41_help = String.format("Channel : %d ", k41_chNow);
		}
	}

	void chDown() {	
		if(k41_chNow == k41_ch_DownLimit) {
			k41_help = "�ּ� ä���Դϴ�.";
		} else {
			k41_chNow--;
			k41_help = String.format("Channel : %d ", k41_chNow);
		}
	}
	
	
}

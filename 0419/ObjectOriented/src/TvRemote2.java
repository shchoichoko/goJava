
public class TvRemote2 {
	// #14 ������ ������ 22.04.20 �ּ���

	private int k41_limit_up_ch; // �ִ� ä��
	private int k41_limit_down_ch;
	private int k41_chNow;
	public String k41_help;
	private int k41_limit_up_volume; // �ִ� ä��
	private int k41_limit_down_volume;
	private int k41_volumeNow;

	TvRemote2() {
		k41_limit_up_ch = 20;
		k41_limit_down_ch = 1;
		k41_chNow = 1;
		k41_help = "TV �⺻ ���� �Ϸ�";
		k41_limit_up_volume = 20;
		k41_limit_down_volume = 1;
		k41_volumeNow = 1;
	}

	void upCh() {
		if (k41_chNow == k41_limit_up_ch) {
			k41_help = "�ִ� ä���Դϴ�";
		} else {
			k41_chNow++;
			k41_help = String.format("Channel : %d", k41_chNow);
		}
	}

	void downCh() {
		if (k41_chNow == k41_limit_down_ch) {
			k41_help = "ó�� ���Դϴ�";
		} else {
			k41_chNow--;
			k41_help = String.format("Channel : %d", k41_chNow);
		}
	}

	void upCh(int k41_u) {
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.upCh();
		}
	}

	void downCh(int k41_u) {
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.downCh();
		}
	}

	void msgCh(String k41_id) {
		System.out.printf("%s=>[%s] �ִ�ä��[%d] �ּ�ä��[%d] ����ä��[%d]\n", k41_id, k41_help, k41_limit_up_ch, k41_limit_down_ch,
				k41_chNow);
	}

	void upVolume() {
		if (k41_volumeNow == k41_limit_up_volume) {
			k41_help = "�ִ� �����Դϴ�";
		} else {
			k41_volumeNow++;
			k41_help = String.format("Volume : [%d]", k41_volumeNow);
		}
	}

	void downVolume() {
		if (k41_volumeNow == k41_limit_down_volume) {
			k41_help = "���� �����Դϴ�";
		} else {
			k41_volumeNow--;
			k41_help = String.format("Volume : [%d]", k41_volumeNow);
		}
	}

	void upVolume(int k41_u) {
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.upVolume();
		}
	}

	void downVolume(int k41_u) {
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.downVolume();
		}
	}

	void msgVolume(String k41_id) {
		System.out.printf("%s=>[%s] �ִ뺼��[%d] �ּҺ���[%d] ���纼��[%d]\n", k41_id, k41_help, k41_limit_up_volume,
				k41_limit_down_volume, k41_volumeNow);
	}
}

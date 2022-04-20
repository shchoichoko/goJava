
public class TvRemote2 {
	// #14 생성자 리모콘 22.04.20 최수혁

	private int k41_limit_up_ch; // 최대 채널
	private int k41_limit_down_ch;
	private int k41_chNow;
	public String k41_help;
	private int k41_limit_up_volume; // 최대 채널
	private int k41_limit_down_volume;
	private int k41_volumeNow;

	TvRemote2() {
		//Tv 생성자 기본 세팅하기.
		k41_limit_up_ch = 20;	// 최대 채널
		k41_limit_down_ch = 1;	// 최소 채널
		k41_chNow = 1;	//현재 채널
		k41_help = "TV 기본 셋팅 완료";
		k41_limit_up_volume = 20;	//최대 볼륨
		k41_limit_down_volume = 1;	//최소 볼륨
		k41_volumeNow = 1;	//현재 볼륨
	}

	void upCh() {// 채널을 올려주는 함수. 최대치에 다다르면 해당 메시지 저장.
		if (k41_chNow == k41_limit_up_ch) {
			k41_help = "최대 채널입니다";
		} else {
			k41_chNow++;
			k41_help = String.format("Channel : %d", k41_chNow);
		}
	}

	void downCh() {// 채널을 내리는 함수. 최저치에 다다르면 해당 메시지 저장.
		if (k41_chNow == k41_limit_down_ch) {
			k41_help = "최저 채널입니다";
		} else {
			k41_chNow--;
			k41_help = String.format("Channel : %d", k41_chNow);
		}
	}

	void upCh(int k41_u) {
		// 채널을 매개변수만큼 올려주는 함수.
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.upCh();
		}
	}

	void downCh(int k41_u) {
		// 채널을 매개변수만큼 내려주는 함수.
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.downCh();
		}
	}

	void msgCh(String k41_id) {
		System.out.printf("%s=>[%s] 최대채널[%d] 최소채널[%d] 현재채널[%d]\n", 
				k41_id, k41_help, k41_limit_up_ch, k41_limit_down_ch,
				k41_chNow);
	}

	void upVolume() {
		// 볼륨을 올려주는 함수. 최대치에 다다르면 해당 메시지 저장.
		if (k41_volumeNow == k41_limit_up_volume) {
			k41_help = "최대 볼륨입니다";
		} else {
			k41_volumeNow++;
			k41_help = String.format("Volume : [%d]", k41_volumeNow);
		}
	}

	void downVolume() {
		// 볼륨을 내려주는 함수. 최저치에 다다르면 해당 메시지 저장.
		if (k41_volumeNow == k41_limit_down_volume) {
			k41_help = "최저 볼륨입니다";
		} else {
			k41_volumeNow--;
			k41_help = String.format("Volume : [%d]", k41_volumeNow);
		}
	}

	void upVolume(int k41_u) {
		//볼륨을 매개변수 값만큼 올려주는 함수.
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.upVolume();
		}
	}

	void downVolume(int k41_u) {
		//볼륨을 매개변수 값만큼 내려주는 함수.
		for (int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.downVolume();
		}
	}

	void msgVolume(String k41_id) {
		System.out.printf("%s=>[%s] 최대볼륨[%d] 최소볼륨[%d] 현재볼륨[%d]\n", k41_id, k41_help,
				k41_limit_up_volume,
				k41_limit_down_volume, k41_volumeNow);
	}
}

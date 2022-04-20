
public class TvRemocon {
	//#6 클래스 객체 인스턴스 리모콘 22.04.20 최수혁
	//리모콘 최대 최소 볼륨 및 채널 세팅
	int k41_vol_UpLimit = 30;
	int k41_vol_DownLimit = 0;
	int k41_ch_UpLimit = 30;
	int k41_ch_DownLimit = 0;
	int k41_volNow = 1;	// 현재 볼륨
	int k41_chNow = 1;	// 현재 채널
	String k41_help;	// 메세지 출력을 위한 문자열 변수.
	
	// 볼륨을 올리는 함수, 현재 볼륨이 최대 불륨값과 같으면 최대 볼륨이라는
	// 메시지 출력.
	void volUP() {
		if(k41_volNow == k41_vol_UpLimit) {
			k41_help = "최대 볼륨입니다!";
		} else {
			k41_volNow++;
			k41_help = String.format("Volume : %d", k41_volNow);
		}
	}
	// 볼륨을 내리는 함수, 현재 볼륨이 최저 불륨값과 같으면 최저 볼륨이라는
	// 메시지 출력.
	void volDown() {
		if(k41_volNow == k41_vol_DownLimit) {
			k41_help = "최저 볼륨입니다!";
		} else {
			k41_volNow--;
			k41_help = String.format("Volume : %d", k41_volNow);
		}
	}
	// 채널을 올리는 함수, 현재 채널이 최대 채널값과 같으면 최대 채널이라는
	// 메시지 출력.
	void chUp() {	
		if(k41_chNow == k41_ch_UpLimit) {
			k41_help = "최대 채널입니다.";
		} else {
			k41_chNow++;
			k41_help = String.format("Channel : %d ", k41_chNow);
		}
	}
	// 채널을 내리는 함수, 현재 채널이 최소 채널값과 같으면 최소 채널이라는
	// 메시지 출력.
	void chDown() {	
		if(k41_chNow == k41_ch_DownLimit) {
			k41_help = "최소 채널입니다.";
		} else {
			k41_chNow--;
			k41_help = String.format("Channel : %d ", k41_chNow);
		}
	}
	
	
}

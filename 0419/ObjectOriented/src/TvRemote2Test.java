
public class TvRemote2Test {
	// #19 상속 리모콘 테스트 22.04.20 최수혁
	static TvRemote2 k41_tv;
	
	public static void main(String[] args) {
		k41_tv = new TvRemote2();
		// TvRemoconX 클래스의 객체 생성.
		TvRemoconX k41_tv2 = new TvRemoconX();
		// 해당 클래스의 함수 사용.
		k41_tv2.checkBattery();
		System.out.printf("MSG k41_tv2[%s]\n", k41_tv2.k41_help);
		
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//채널을 10번 올리는 식
			k41_tv.upCh();
			k41_tv.msgCh("채널 올리기");
		}
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//채널을 10번 내리는 식
			k41_tv.downCh();
			k41_tv.msgCh("채널 내리기");
		}
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			//볼륨을 5번 올리는 식
			k41_tv.upVolume();
			k41_tv.msgCh("볼륨 올리기");
		}
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			//볼륨을 5번 내리는 식
			k41_tv.downVolume();
			k41_tv.msgCh("볼륨 내리기");
		}
		

	}

}

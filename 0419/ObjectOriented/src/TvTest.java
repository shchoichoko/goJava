
public class TvTest {
	//#7 클래스 객체 인스턴스 리모콘 조작 22.04.20 최수혁
	public static void main(String[] args) {
		// TvRemocon 클래스의 객체 생성.
		TvRemocon k41_tr = new TvRemocon();
		// 채널 10번 올리기
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tr.chUp();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		// 채널 10번 내리기.
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_tr.chDown();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		//음량 5번 올리기
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			k41_tr.volUP();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		//음량 5번 내리기
		for(int k41_i = 0; k41_i < 5; k41_i++) {
			k41_tr.volDown();
			System.out.printf("[%s]\n", k41_tr.k41_help);
		}
		
	}

}

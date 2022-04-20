
public class Elevator2 {
	//#12 생성자 엘리베이터2 22.04.20 최수혁
	
	public int k41_limit_up_floor;	//최상위층
	public int k41_limit_down_floor;
	public int k41_floor;
	public String k41_help;
	
	Elevator2(){
		k41_limit_up_floor = 10;
		k41_limit_down_floor = 1;
		k41_help = "엘리베이터 기본 준공완료";
	}
	
	Elevator2(int k41_up_floor, int k41_d_floor, int k41_in_floor){
		k41_limit_up_floor = k41_up_floor;
		k41_limit_down_floor = k41_d_floor;
		k41_help = "엘리베이터 맞춤 준공완료";
	}
	
	void up() {
		if(k41_floor == k41_limit_up_floor) {
			k41_help = "마지막 층입니다";
		} else {
			k41_floor++;
			k41_help = String.format("[%d]층입니다", k41_floor);
		}
	}
	
	void down() {
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "처음 층입니다";
		} else {
			k41_floor--;
			k41_help = String.format("[%d]층입니다", k41_floor);
		}
	}
	
	void up(int k41_u) {
		for(int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.up();
		}
	}
	
	void down(int k41_u) {
		for(int k41_i = 0; k41_i < k41_u; k41_i++) {
			down();
		}
	}
	
	void msg(String k41_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", k41_id, k41_help, k41_limit_up_floor, k41_limit_down_floor, k41_floor);
	}


}

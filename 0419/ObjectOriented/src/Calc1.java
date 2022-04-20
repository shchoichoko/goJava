
public class Calc1 {
	//#8 메소드 오버로딩 22.04.20 최수혁
	
	public int sum(int k41_a, int k41_b) {
		//매개변수 2개일 때 더해주는 메소드
		return k41_a + k41_b;
	}
	
	public int sum(int k41_a, int k41_b, int k41_c) {
		//매개변수 3개일 때 더해주는 메소드
		return k41_a + k41_b + k41_c;
	}

	public int sum(int k41_a, int k41_b, int k41_c, int k41_d) {
		//매개변수 4개일 때 더해주는 메소드
		return k41_a + k41_b + k41_c + k41_d;
	}

	public double sum(double k41_a, double k41_b) {
		//매개변수는 2개지만 데이터 타입이 다름. 
		//매개변수 2개를 double 형으로 받아서 더함.ㄴ
		return k41_a + k41_b;
	}

}

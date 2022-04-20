
public class TestMain2 {
	//#9 메소드 오버로딩 계산 테스트 22.04.20 최수혁
	
	public static void main(String[] args) {
		Calc1 k41_cal = new Calc1();
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", k41_cal.sum(1, 2));
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", k41_cal.sum(1, 2, 3));
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", k41_cal.sum(1, 2, 3, 4));
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n", k41_cal.sum(1.3, 2.4));
		
	}
}

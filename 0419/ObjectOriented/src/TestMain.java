
public class TestMain {
	//#5 클래스 객체 인스턴스(2) 22.04.20 최수혁
	private static int k41_inVal;
	
	public static void up() {
		k41_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k41_inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k41_inVal = 0;
		Elevator k41_elev;
		k41_elev = new Elevator();
		up();
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_elev.Up();
			System.out.printf("MSG[%s]\n", k41_elev.k41_help);
		}
		for(int k41_i = 0; k41_i < 10; k41_i ++) {
			k41_elev.down();
			System.out.printf("MSG[%s]\n",k41_elev.k41_help);
		}
		
	}

}


public class TestMain {
	//#5 클래스 객체 인스턴스(2) 22.04.20 최수혁
	private static int k41_inVal;
	//전역변수 선언.
	public static void up() {
		k41_inVal++;
		// 해당 함수가 메인함수에서 사용되었기 때문에 1증가하고, 증가한채로 출력
		System.out.printf("난 그냥 메소드[%d]\n", k41_inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k41_inVal = 0;
		Elevator k41_elev;
		k41_elev = new Elevator();	//Elevator클래스 객채 생성.
		up();// 위의 전역변수 값 증가해줌.
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_elev.Up();	//Elevator 클래스의 Up함수 사용.
			System.out.printf("MSG[%s]\n", k41_elev.k41_help);
		}
		for(int k41_i = 0; k41_i < 10; k41_i ++) {
			k41_elev.down();//Elevator 클래스의 down함수 사용.
			System.out.printf("MSG[%s]\n",k41_elev.k41_help);
		}
		
	}

}

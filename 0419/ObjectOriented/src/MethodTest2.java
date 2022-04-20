
public class MethodTest2 {
	//#2 변수와 메서드2 22.04.19 최수혁
	static int k41_iStatic;	//전역 변수로 선언.
	
	public static void add(int k41_i) {
		k41_iStatic++;	// 전역변수 값 1증가.
		k41_i++;	//매개변수 값 1증가.
		System.out.printf("add메소드에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("add메소드에서->k41_i=[%d]\n",k41_i);	//1증가한채로 출력
		
	}
	
	public static int add2(int k41_i) {
		k41_iStatic++; // 전역변수 값 1증가.
		k41_i++; //매개변수 값 1증가.
		System.out.printf("add메소드에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("add메소드에서->k41_i=[%d]\n",k41_i);
		return k41_i;	//값 증가한채로 리턴.
	}
	
	public static void main(String[] args) {

		int k41_iMain;	//정수형 변수 선언
		k41_iMain = 1;	//1로 초기화 해줌.
		k41_iStatic = 1; //전역변수 값 1로 초기화.
		System.out.printf("*************************************\n");
		System.out.printf("메소드호출전 메인에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("메소드호출전 메인에서->k41_iMain=[%d]\n",k41_iMain);
		System.out.printf("*************************************\n");
		
		add(k41_iMain);	//메소드 내부에서 값을 1씩 증가시킨 채로 출력
		
		System.out.printf("*************************************\n");
		System.out.printf("메소드호출후 메인에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("메소드호출후 메인에서->k41_iMain=[%d]\n",k41_iMain);
		//매개변수로 넣어준 값을 리턴 받지 않았기 때문에 값의 변화가 없음.
		System.out.printf("*************************************\n");
		
		k41_iMain = add2(k41_iMain);	//값이 메소드를 통해 증가되어 저장.
		System.out.printf("*************************************\n");
		System.out.printf("메소드 add2호출후 메인에서->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->k41_iMain=[%d]\n",k41_iMain);
		// 증가된채로 리턴값을 받은 후에 출력했기 때문에 값이 증가되어 있다.
		System.out.printf("*************************************\n");
		
		
	}
	

	
}

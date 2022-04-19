
public class MethodTest {
	//#1 변수와 메서드 22.04.19 최수혁
	public static void iamMethod() {
		System.out.printf("메소드라 불러줘요~~\n");
	}
	
	public static void main(String[] args) {
		//MethodTest.iamMethod();	//여기서 클래스.메소드로 한번 불러온다.
		iamMethod();
		// 같은 클래스 내에 static 메소드라서 그냥 함수 불러와도 된다.

	}

}

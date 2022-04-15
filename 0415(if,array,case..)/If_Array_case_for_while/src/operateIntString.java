
public class operateIntString {

	public static void main(String[] args) {
		//#5 숫자형 문자형 비교 22.04.15 csh
		
		int k41_il;	// 정수형 변수 선언.
		double k41_iD;	// 더블형 변수 선언.
		k41_il = 10/3;		// 정수형 계산 값 저장.
		k41_iD = 10/3.0;	// double 형 계산을 위해 소수점도 붙여줌.
		if(k41_il==k41_iD) System.out.println("equal\n");	//k41_il의 값과 k41_iD의 값이 같을때 equal 이라고 출력.
		else System.out.printf("Not equal[%f][%f]\n",(double)k41_il,k41_iD); //k41_il의 값과 k41_iD의 값이 다를 경우 Not equal을 출력. 
		
		if( k41_iD == 3.333333) System.out.printf("equal\n");	// k41_iD의 값이 3.333333와 일치할때 equal을 출력.
		else System.out.printf("Not equal[3.333333][%f]\n",k41_iD);// k41_iD의 값이 3.333333와 다를 때 Not equal을 출력.
		
		k41_iD = (int)k41_iD;		// int형변환으로 소수점 아래 숫자를 버리고 k41_iD에 저장.
		if( k41_il == k41_iD) System.out.printf("equal\n");		// ki41_il 과 k41_iD 값이 같을 떄 equal을 출력
		else System.out.printf("Not equal[%f][%f]\n",(double)k41_il,k41_iD); // ki41_il 과 k41_iD 값이 같지 않을 때 Not equal을 출력
		
		System.out.printf("int로 인쇄[%d][%f]\n", k41_il,k41_iD);	//printf 포맷 %d로 int형 출력, %f로 Float형으로 출력.
		System.out.printf("double로 인쇄[%f][%f]\n",(double)k41_il,k41_iD); //정수형이었던 k41_il을 double로 형변환 후 %f로 Float형 출력.
		char k41_a = 'c';		//문자형 변수 k41_a 선언 및 초기화. 
		// (' ' 안은 문자, " " 안은 문자열이 들어간다.)
		if(k41_a == 'b')System.out.printf("a는 b이다\n");	//k41_a 의 아스키 코드 값이 'b' 값과 같다면 출력문장을 수행한다.
		if(k41_a == 'c')System.out.printf("a는 c이다\n");	//k41_a 의 아스키 코드 값이 'c' 값과 같다면 출력문장을 수행한다.
		if(k41_a == 'd')System.out.printf("a는 d이다\n");	//k41_a 의 아스키 코드 값이 'd' 값과 같다면 출력문장을 수행한다.
		
		String k41_aa = "abcd";			// 문자열 변수 k41_aa 선언 및 초기화.
		if(k41_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n");		//k41_aa의 문자열이 "abcd"와 같다면 출력문장을 수행한다.
		else System.out.printf("aa는 abcd가 아니다\n");		//k41_aa의 문자열이 "abcd"와 같지않다면 출력문장을 수행한다.
		boolean k41_bb =true;	// boolean 타입 변수 선언 및 초기화.
		if(!!k41_bb) System.out.printf("bb가 아니고 아니면 참이다\n"); //!가 두번 들어갔기 때문에 원래 값인 true이다. !이 한번이면 거짓.
		else System.out.printf("bb가 아니고 아니면 거짓이다\n");	// !!k41_bb가 참이기 때문에 출력하지 않는다.
		
	}

}

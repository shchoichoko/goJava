
public class SwitchCasePrac {

	public static void main(String[] args) {
		// #2 switch/case 문 22.04.15 csh 
		String k41_jumin = "123456-1234567";	//주민등록 번호 넣을 변수 선언 및 초기화
		switch(k41_jumin.charAt(7)) {			// .charAt(index number)은 k41_jumin의 첫글자를 0번째 자리라고 했을때 7번째 자리 값을 뜻한다.
		case '1' :								// k41_jumin.charAt(7)의 값이 1일때 문장 수행. break가 없기 때문에 무조건 수행한다.
			System.out.println("20세기 전 태어난 남자 사람");
		case '2' :								// k41_jumin.charAt(7)의 값이 2일때 문장 수행하고 switch문을 벗어난다.						
			System.out.println("20세기 전 태어난 여자 사람");
			break;
		case '3' :								// k41_jumin.charAt(7)의 값이 3일때 문장 수행하고 switch문을 벗어난다.	
			System.out.println("20세기 후 태어난 남자 사람");
			break;
		case '4' :								// k41_jumin.charAt(7)의 값이 4일때 문장 수행하고 switch문을 벗어난다.
			System.out.println("20세기 후 태어난 여자 사람");
			break;
		default:								// k41_jumin.charAt(7)의 값이 1,2,3,4에 속하지 않을 때 수행하고 switch문을 벗어난다.
			System.out.println("사람");
			break;
		}

	}

}

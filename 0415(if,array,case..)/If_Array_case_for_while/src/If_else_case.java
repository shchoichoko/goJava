import java.util.Scanner;

public class If_else_case {

	public static void main(String[] args) {
		//#1 If문 등급 판별 연습 22.04.15 csh
		Scanner k41_sc = new Scanner(System.in);	// 값을 입력하기 위해 Scanner 클래스 객체를 생성한다.
		System.out.println("Please input the score");	// 유저가 값을 입력할 수 있도록 인지시킨다.
		int k41_score = k41_sc.nextInt();	// k41_score라는 변수에 정수를 입력받아 저장한다.
		int k41_num = 0;	// 양수, 음수 판별을 위한 변수를 선언한다.
		if(k41_score > 60) {	//입력받은 점수가 60보다 크다면 Pass!를 출력한다.
			System.out.println("Pass!");
		} 
		if(k41_score > 60)	//위의 문장과 같은 역할이지만, 중괄호가 없어도 동작한다.
			System.out.println("Pass!");
		
		if(k41_score > 60) {	//입력받은 점수가 60보다 크다면 Pass!를 출력한다.
			System.out.println("Pass!");
		} else {			// 입력받은 점수가 60보다 크지 않을 경우 No Pass!를 출력한다.
			System.out.println("No Pass!");
		}
		
		System.out.println("Please input a number");	//유저가 값을 입력할 수 있도록 인지시킨다.
		k41_num = k41_sc.nextInt();	//k41_num에 양수,음수 판별을 위한 정수 값을 저장한다.
		if(k41_num > 0) {	//입력 받은 값이 0보다 클 경우, 양수를 출력한다.
			System.out.println("양수입니다!");
		} else if(k41_num < 0) { //입력 받은 값이 0보다 작을 경우, 음수를 출력한다.
			System.out.println("음수입니다!");
		} else {	// 입력 값이 양수도 음수도 아닐 경우 0이라고 출력한다.
			System.out.println("영입니다.");
		}
		
		if(k41_score >= 90) {	//입력 점수 값이 90이상이면 A등급 출력
			System.out.println("A등급");
		} else if(k41_score >= 80 && k41_score < 90) {
			System.out.println("B등급");	//입력 점수 값이 80이상 90미만이면 B등급 출력
		} else if(k41_score >= 70 && k41_score < 80) {
			System.out.println("C등급");	//입력 점수 값이 70이상 80미만이면 C등급 출력
		} else {
			System.out.println("F등급");	//나머지 값은 F등급을 출력한다.
		}
		
		
		
	}

}

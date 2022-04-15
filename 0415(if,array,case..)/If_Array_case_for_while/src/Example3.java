
public class Example3 {
	//#8 비정형비교2 22.04.15 csh
	public static void main(String[] args) {
		for(int k41_i = 1; k41_i < 13; k41_i++) {	// 달력의 월을 표기하기 위한 문장.   범위는 1 ~ 12
			System.out.printf("%d월 =>", k41_i);	// 몇월인지 표기 하기 위한 문장.
			for(int k41_j = 1; k41_j < 32; k41_j++) {	//날짜를 표기 위한 문장. 범위는 1 ~ 31
				System.out.printf("%d, ", k41_j);	// 일을 표기 하기 위한 문장
				if(k41_i == 4||k41_i==6||k41_i==9||k41_i==11) {	// 4,6,9,11월 일때 30일까지 출력. 
					if(k41_j==30) break;
				}
				if(k41_i==2) {		//2월은 28일까지만 출력.
					if(k41_j==28) break;
				}// 위의 두 조건에 포함되지 않는 달들은 31까지 출력.
			}
			System.out.printf("\n");	//달별로 한줄씩 띄우기 위함.
		}
	}

}

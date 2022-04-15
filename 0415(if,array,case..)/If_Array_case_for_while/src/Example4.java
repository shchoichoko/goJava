
public class Example4 {
	//#9 비정형비교3 22.04.15 csh
	public static void main(String[] args) {
		
	for(int  k41_i = 1; k41_i<13; k41_i++) {	//1~12월까지 출력하기 위한 식
		System.out.printf(" %d월 =>", k41_i);	// 월별로 표기하기 위한 식
		for(int k41_j = 1; k41_j < 32; k41_j++) {	// 1~31일까지 표기 위한 식
			System.out.printf("%d, ", k41_j);	
			if((k41_i == 4||k41_i==6||k41_i==9||k41_i==11)&&(k41_j==30)) break;	//4,6,9,11월에는 30일까지만 표기하고 break를 통해 해당 for문을 빠져나간다.
			if(k41_i== 2 && k41_j == 28) break;	//2월에는 28일까지 표기하고 break를 통해 해당 for문을 빠져나간다.
		}
		System.out.printf("\n");	//월별로 줄을 띄워주기 위한 식.
	}

	}
}

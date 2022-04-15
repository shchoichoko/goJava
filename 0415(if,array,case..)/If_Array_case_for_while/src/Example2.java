
public class Example2 {
	public static void main(String[]args) {
		//#7 비정형비교 22.04.15 csh
	
	for(int k41_i = 1; k41_i < 13; k41_i++) {		//1월부터 12월까지 월을 표기 하기 위한 식.
		System.out.printf(" %d월 => ", k41_i);
		for(int k41_j = 1; k41_j < 32; k41_j ++) {	//1일 부터 31일까지 일자를 표기하기 위한 식.
			System.out.printf("%d, ",k41_j);		//일자를 출력하는 식.
			if(k41_i == 1 && k41_j == 31) break;	//1월은 31일까지 출력하는 식
			if(k41_i == 2 && k41_j == 28) break;	//2월은 28일까지 출력하는 식
			if(k41_i == 3 && k41_j == 31) break;	//3월은 31일까지 출력하는 식
			if(k41_i == 4 && k41_j == 30) break;	//4월은 30일까지 출력하는 식
			if(k41_i == 5 && k41_j == 31) break;	//5월은 31일까지 출력하는 식
			if(k41_i == 6 && k41_j == 30) break;	//6월은 30일까지 출력하는 식
			if(k41_i == 7 && k41_j == 31) break;	//7월은 31일까지 출력하는 식
			if(k41_i == 8 && k41_j == 31) break;	//8월은 31일까지 출력하는 식
			if(k41_i == 9 && k41_j == 30) break;	//9월은 30일까지 출력하는 식
			if(k41_i == 10 && k41_j == 31) break;	//10월은 31일까지 출력하는 식
			if(k41_i == 11 && k41_j == 30) break;	//11월은 30일까지 출력하는 식
			if(k41_i == 12 && k41_j == 31) break;	//12월은 31일까지 출력하는 식
		}
			System.out.printf("\n");	// 달별로 한줄씩 띄우기 위함.
		
		}
	}
}


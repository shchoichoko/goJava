
public class CaseCalendar {
	// #10 case문 비교 22.04.15 csh
	public static void main(String[] args) {
		for (int k41_i = 1; k41_i < 13; k41_i++) {		//월을 범위를 지정하기 위한 식
			System.out.printf(" %d월 =>", k41_i);		//월별 구분해서 표기하기 위한 식
			LOOP: for (int k41_j = 1; k41_j < 32; k41_j++) {	// 일의 범위를 지정하기 위한 식.
				System.out.printf("%d,", k41_j);	// 일자를 출력하는 식
				switch (k41_i) {		//월별로 조건을 나누기위한 switch case문
				case 4: case 6: case 9: case 11:
					if (k41_j == 30) {		//4,6,9,11월 일때는 30일까지만 출력하는 식
						System.out.println("");	// 월별로 한줄 띄우기 위한 식
						break LOOP;			//조건을 만족했을 때, 위의 LOOP문으로 돌아가는 식.
					}	break;
				case 2:
					if (k41_j == 28) {
						System.out.println("");// 월별로 한줄 띄우기 위한 식
						break LOOP;			//조건을 만족했을 때, 위의 LOOP문으로 돌아가는 식.
					}	break;
				default:	//위의 case 에 속한 월들을 제외한 나머지 월들을 출력하기 위한 식.
					if (k41_j == 31) {
						System.out.println("");// 월별로 한줄 띄우기 위한 식
						break;				// 해당 반복문을 벗어나는 식
					}
				}
			}
		}

	}

}

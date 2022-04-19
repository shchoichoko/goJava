
public class Calendar {

	public static void main(String[] args) {
		// #2 달력 인쇄 22.04.18. 최수혁
		int k41_iWeekday = 5; // 1월1일이 금요일
		int[] k41_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		// 윤년인 년도의 달마다 마지막날을 모아둔 배열
		for (int k41_iMon = 0; k41_iMon < 12; k41_iMon++) { 
			// 배열을 꺼내 써야 하므로 0~11까지 for문 설정
			System.out.printf("\t %2d월\n", k41_iMon + 1); 
			// k41_iMon이 0부터 시작하므로 +1
			System.out.printf("=====================\n");
			System.out.printf(" 일 월 화 수 목 금 토\n");
			for (int k41_j = 0; k41_j < k41_iWeekday; k41_j++) {
				System.out.printf("   "); 
				// 시작날만큼 빈칸 출력하기.
			}
			for (int k41_i = 1; k41_i < k41_iEnd[k41_iMon]+1; k41_i++) {
				// k41_i는 1일부터 마지막날까지 출력 
				if (k41_iWeekday % 7 == 6) { 
					// k41_iWeekday를 7로 나누어 나머지가 6 일 때 한 줄 띄우기
					System.out.printf("%3d\n", k41_i);
					k41_iWeekday -= 7; 
					// 다시 요일을 계산하기 위해 -7
				} else { 
					// 나머지가 6이 아니라면 날짜 출력
					System.out.printf("%3d", k41_i);
				}
				k41_iWeekday++;
				//k41_iWeekday 1씩 증가
			}
			System.out.printf("\n\n"); 
			// 한달이 끝난 후 줄 띄우기
		}
	}
}

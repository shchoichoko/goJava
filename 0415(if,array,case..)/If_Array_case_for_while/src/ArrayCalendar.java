
public class ArrayCalendar {
	// #11 Array이용 비교 22.04.15 csh
	public static void main(String[] args) {
		int [] k41_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 월별로 마지막 일자를 배열로 만든다.
		
		for(int k41_i = 1; k41_i < 13; k41_i++) {	//월의 범위를 정하기 위함.
			System.out.printf(" %d월 =>", k41_i); 	//월별로 표기를 위한 식.
			
			for(int k41_j = 1; k41_j < 32; k41_j++) {	//일의 범위를 31일까지로 정하기 위함.
				System.out.printf("%d", k41_j);		//일을 표기하기 위함.
				
				if(k41_iLMD[k41_i-1]==k41_j) {	// k41_i-1로 배열안의 수와 월을 일치시키기 위함. ex) 2월 => k41_iLMD[1] 
					break;						//월별 마지막 일자수와 같으면 반복문 벗어나기.
				}
				System.out.printf(",");			//마지막 일자 찍을 때 콤마 빼기 위해 break문 밑에 위치함.
			}
			System.out.println("\n");			//월별로 한줄 씨 띄우기 위함.
		}
		
		
	}

}

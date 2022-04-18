
public class KoreanNumberAdvanced {
	// #13 숫자읽기(고급) 22.04.15 csh
	public static void main(String[] args) {
		
		int k41_iNumVal = 1001034567;		//한글로 읽기 위한 수 입력.
		String k41_sNumVal = String.valueOf(k41_iNumVal);	//k41_iNumVal를 String으로 형변환
		String k41_sNumVoice ="";	// 숫자 한글로 읽을 변수 선언 및 초기화.
		System.out.printf("==> %s [%d자리]\n", k41_sNumVal, k41_sNumVal.length());	//입력한 숫자 문자열로 출력. 길이도 출력.
		int k41_i,k41_j;	//while 문에서 자리수별로 나눌때 사용할 변수 선언.
		String[] k41_units = {"영","일","이","삼","사","오","육","칠","팔","구"};	// 숫자를 한글로 읽기 위한 배열
		String[] k41_unitX = {"","십","백","천","만","십","백","천","억","십"}; //십억 까지의 단위를 읽기 위한 배열
		k41_i = 0;	//첫글자부터 자르기 위해 0으로 초기화.
		k41_j = k41_sNumVal.length()-1;	// 배열의 값을 불러와야 하기 때문에 길이 -1로 초기화.
		
		while(true) {	//break문 만나기 전까지 반복.
			if(k41_i >= k41_sNumVal.length()) break;	// k41_i가 입력받은 문자열의 길이보다 같거나 길다면 while문을 벗어난다.
			
			System.out.printf("%s[%s]",
					k41_sNumVal.substring(k41_i,k41_i+1), // substring 0번째 문자열인 "1"을 출력.
					k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))]); //"1"을 정수 1로 형변환 하여 배열의 [1]번째 즉, "일"을 출력한다.
			
			if(k41_sNumVal.substring(k41_i,k41_i+1).equals("0")) {	//substring 의 결과가 "0"과 같다면 아래 문장을 수행한다.
				if(k41_unitX[k41_j].equals("만")||k41_unitX[k41_j].equals("억")) {	//단위가 "만"이나 "억"이라면 아래 문장을 수행한다.
					k41_sNumVoice = k41_sNumVoice + "" + k41_unitX[k41_j];	// 단위를 읽도록 추가로 넣어준다.
					if(k41_sNumVal.substring(k41_sNumVal.length()-8,k41_sNumVal.length()-4).equals("0000")) {	//천만에서 만 사이에 0밖에 없다면 아래 문장 수행.
						k41_sNumVoice = k41_sNumVoice.replace("만", "");	//"만"을 문자열에서 제거한다.
					}
				} else {
					
				}
			} else {	//숫자를 읽는 문자열에 숫자와 단위를 추가로 넣는다.
				k41_sNumVoice = k41_sNumVoice + 
						k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))] +
						k41_unitX[k41_j];
			}
			k41_i++; k41_j--;	//k41_i 는 다음 숫자로 이동하기 위해 증가.(0번째 -> 1번째 숫자로 이동)
		}	//k41_j는 단위 최대 길이에서 점점 내려오기 때문에 감소. (9번째 단위 -> 8번째 단위로 이동)
		System.out.printf("\n %s[%s]\n",k41_sNumVal,k41_sNumVoice);
		//입력했던 수를 문자열로 출력하고, 한글로 읽은 문자열도 출력한다.
	}

}

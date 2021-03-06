
public class KoreanBlank {
	// #1 한글계산 22.04.21 최수혁
	public static void main(String[] args) {

		System.out.printf("HanBlankForeword[%23s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%17s]\n", HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankBackword[%19s]\n", HanBlankBackword("한글aa", 15));
		System.out.printf("HanBlankBackword[%19s]\n", HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
	}

	// 한글 앞 쪽에 매개변수 수만큼 공백을 생성하는 함수
	public static String HanBlankForeword(String k41_inputString, int k41_num) {
		String k41_blk = ""; // 공백을 넣을 변수
		for (int k41_i = 0; k41_i < k41_num; k41_i++) {
			k41_blk += " ";
			// 매개변수 수만큼 반복해서 공백을 붙인다.
		}
		return k41_blk + k41_inputString;
	}

	// 한글 뒤 쪽에 매개변수 수만큼 공백을 생성하는 함수
	public static String HanBlankBackword(String k41_inputString, int k41_num) {
		String k41_blk = "";
		for (int k41_i = 0; k41_i < k41_num; k41_i++) {
			k41_blk += " "; // 공백을 반복해서 생성.
		}
		return k41_inputString + k41_blk; // 반복 생성한 공백을 뒤쪽에서 더해준다.
	}

	// 문자열 입력 받아, 문자열 내의 한글 수를 반환해주는 함수
	public static int HanCount(String k41_inputString) {
		int k41_cnt = 0;
		for (int k41_i = 0; k41_i < k41_inputString.length(); k41_i++) {
			char k41_ch = k41_inputString.charAt(k41_i);//한 글자 한글자 넣어서 비교
			if (String.valueOf(k41_ch).getBytes().length == 2) {
				k41_cnt++;	//한글은 한 글자의 byte 길이가 2라서 이렇게 하나씩 센다.
			}
		}
		return k41_cnt;
	}

}


public class KoreanBlank {
	//#1 한글계산 22.04.21 최수혁
	public static void main(String[] args) {
		
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd",5));
		
		
	}

	public static String HanBlankForeword(String k41_a, int k41_num) {
		String k41_blk = "";
		for(int k41_i=0; k41_i < k41_num; k41_i++) {
			k41_blk += " ";
		}
		return k41_blk+k41_a;
	}
}

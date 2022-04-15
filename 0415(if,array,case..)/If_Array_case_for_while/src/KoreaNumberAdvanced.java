
public class KoreaNumberAdvanced {
	// #13 숫자읽기(고급) 22.04.15 csh
	public static void main(String[] args) {
		
		int k41_iNumVal = 1001034567;		//한글로 읽기 위한 수 입력.
		String k41_sNumVal = String.valueOf(k41_iNumVal);	//k41_iNumVal를 String으로 형변환
		String k41_sNumVoice ="";	
		System.out.printf("==> %s [%d자리]\n", k41_sNumVal, k41_sNumVal.length());	//
		int k41_i,k41_j;
		String[] k41_units = {"영","일","이","삼","사","오","육","칠","팔","구"};
		String[] k41_unitX = {"","십","백","천","만","십","백","천","억","십"};
		k41_i = 0;
		k41_j = k41_sNumVal.length()-1;
		
		while(true) {
			if(k41_i >= k41_sNumVal.length()) break;
			
			System.out.printf("%s[%s]",
					k41_sNumVal.substring(k41_i,k41_i+1), 
					k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))]);
			
			if(k41_sNumVal.substring(k41_i,k41_i+1).equals("0")) {
				if(k41_unitX[k41_j].equals("만")||k41_unitX[k41_j].equals("억")) {
					k41_sNumVoice = k41_sNumVoice + "" + k41_unitX[k41_j];
				} else {
					
				}
			} else {
				k41_sNumVoice = k41_sNumVoice + 
						k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))] +
						k41_unitX[k41_j];
			}
			k41_i++; k41_j--;
		}
		System.out.printf("\n %s[%s]\n",k41_sNumVal,k41_sNumVoice);
		
	}

}


public class KoreaNumberAdvanced {
	// #13 �����б�(���) 22.04.15 csh
	public static void main(String[] args) {
		
		int k41_iNumVal = 1001034567;		//�ѱ۷� �б� ���� �� �Է�.
		String k41_sNumVal = String.valueOf(k41_iNumVal);	//k41_iNumVal�� String���� ����ȯ
		String k41_sNumVoice ="";	
		System.out.printf("==> %s [%d�ڸ�]\n", k41_sNumVal, k41_sNumVal.length());	//
		int k41_i,k41_j;
		String[] k41_units = {"��","��","��","��","��","��","��","ĥ","��","��"};
		String[] k41_unitX = {"","��","��","õ","��","��","��","õ","��","��"};
		k41_i = 0;
		k41_j = k41_sNumVal.length()-1;
		
		while(true) {
			if(k41_i >= k41_sNumVal.length()) break;
			
			System.out.printf("%s[%s]",
					k41_sNumVal.substring(k41_i,k41_i+1), 
					k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))]);
			
			if(k41_sNumVal.substring(k41_i,k41_i+1).equals("0")) {
				if(k41_unitX[k41_j].equals("��")||k41_unitX[k41_j].equals("��")) {
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

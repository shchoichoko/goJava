
public class KoreanNumberAdvanced {
	// #13 �����б�(���) 22.04.15 csh
	public static void main(String[] args) {
		
		int k41_iNumVal = 1001034567;		//�ѱ۷� �б� ���� �� �Է�.
		String k41_sNumVal = String.valueOf(k41_iNumVal);	//k41_iNumVal�� String���� ����ȯ
		String k41_sNumVoice ="";	// ���� �ѱ۷� ���� ���� ���� �� �ʱ�ȭ.
		System.out.printf("==> %s [%d�ڸ�]\n", k41_sNumVal, k41_sNumVal.length());	//�Է��� ���� ���ڿ��� ���. ���̵� ���.
		int k41_i,k41_j;	//while ������ �ڸ������� ������ ����� ���� ����.
		String[] k41_units = {"��","��","��","��","��","��","��","ĥ","��","��"};	// ���ڸ� �ѱ۷� �б� ���� �迭
		String[] k41_unitX = {"","��","��","õ","��","��","��","õ","��","��"}; //�ʾ� ������ ������ �б� ���� �迭
		k41_i = 0;	//ù���ں��� �ڸ��� ���� 0���� �ʱ�ȭ.
		k41_j = k41_sNumVal.length()-1;	// �迭�� ���� �ҷ��;� �ϱ� ������ ���� -1�� �ʱ�ȭ.
		
		while(true) {	//break�� ������ ������ �ݺ�.
			if(k41_i >= k41_sNumVal.length()) break;	// k41_i�� �Է¹��� ���ڿ��� ���̺��� ���ų� ��ٸ� while���� �����.
			
			System.out.printf("%s[%s]",
					k41_sNumVal.substring(k41_i,k41_i+1), // substring 0��° ���ڿ��� "1"�� ���.
					k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))]); //"1"�� ���� 1�� ����ȯ �Ͽ� �迭�� [1]��° ��, "��"�� ����Ѵ�.
			
			if(k41_sNumVal.substring(k41_i,k41_i+1).equals("0")) {	//substring �� ����� "0"�� ���ٸ� �Ʒ� ������ �����Ѵ�.
				if(k41_unitX[k41_j].equals("��")||k41_unitX[k41_j].equals("��")) {	//������ "��"�̳� "��"�̶�� �Ʒ� ������ �����Ѵ�.
					k41_sNumVoice = k41_sNumVoice + "" + k41_unitX[k41_j];	// ������ �е��� �߰��� �־��ش�.
					if(k41_sNumVal.substring(k41_sNumVal.length()-8,k41_sNumVal.length()-4).equals("0000")) {	//õ������ �� ���̿� 0�ۿ� ���ٸ� �Ʒ� ���� ����.
						k41_sNumVoice = k41_sNumVoice.replace("��", "");	//"��"�� ���ڿ����� �����Ѵ�.
					}
				} else {
					
				}
			} else {	//���ڸ� �д� ���ڿ��� ���ڿ� ������ �߰��� �ִ´�.
				k41_sNumVoice = k41_sNumVoice + 
						k41_units[Integer.parseInt(k41_sNumVal.substring(k41_i,k41_i+1))] +
						k41_unitX[k41_j];
			}
			k41_i++; k41_j--;	//k41_i �� ���� ���ڷ� �̵��ϱ� ���� ����.(0��° -> 1��° ���ڷ� �̵�)
		}	//k41_j�� ���� �ִ� ���̿��� ���� �������� ������ ����. (9��° ���� -> 8��° ������ �̵�)
		System.out.printf("\n %s[%s]\n",k41_sNumVal,k41_sNumVoice);
		//�Է��ߴ� ���� ���ڿ��� ����ϰ�, �ѱ۷� ���� ���ڿ��� ����Ѵ�.
	}

}


public class KoreanBlank {
	//#1 �ѱ۰�� 22.04.21 �ּ���
	public static void main(String[] args) {
		
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd",15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa",15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa",15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa",15));
		System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa"));
	}
	//�ѱ� �� �ʿ� �Ű����� ����ŭ ������ �����ϴ� �Լ�
	public static String HanBlankForeword(String k41_inputString, int k41_num) {
		String k41_blk = "";	//������ ���� ����
		for(int k41_i=0; k41_i < k41_num; k41_i++) {
			k41_blk += " ";	
			//�Ű����� ����ŭ �ݺ��ؼ� ������ ���δ�.
		}	
		return k41_blk+k41_inputString;
	}
	//�ѱ� �� �ʿ� �Ű����� ����ŭ ������ �����ϴ� �Լ�
	public static String HanBlankBackword(String k41_inputString, int k41_num) {
		String k41_blk = "";
		for(int k41_i = 0; k41_i < k41_num; k41_i++) {
			k41_blk += " ";
		}
		return k41_inputString+k41_blk;
	}
	//���ڿ� �Է� �޾�, ���ڿ� ���� �ѱ� ���� ��ȯ���ִ� �Լ�
	public static int HanCount(String k41_inputString) {
		int k41_cnt=0;
		for(int k41_i = 0; k41_i < k41_inputString.length(); k41_i++) {
			char k41_ch ;
			k41_ch = k41_inputString.charAt(k41_i);
			if(String.valueOf(k41_ch).getBytes().length==2) {
				k41_cnt++;
			}
		}
		return k41_cnt;
	}
	
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L07_page9 {

	public static void main(String[] args) throws IOException {
		// #5 ���� �Ⱦ�� ����� 22.04.21 
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\THTSKS010H00.dat");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// ������ ����� ������ �о��ִ� ��ü ����
		int k41_lineCnt = 0;
		// ���� ���� ���� ����.
		int k41_n = -1;
		StringBuffer k41_s = new StringBuffer();
		//	k41_s ��Ʈ�� ���� ����.
		while(true) {
			char[] k41_ch = new char[1000];	//���ڿ� ũ�� 1000 ����.
			k41_n = k41_br.read(k41_ch);
			if(k41_n==-1) {	//read�� ��Ʈ���� �������� �����ϸ� -1�� �������� ������ break�� ���� �ݺ����� ����������.
				break;
			}
			for( char k41_c : k41_ch) {	//���� �ϳ��ϳ� �� �ϱ�.
				if(k41_c == '\n') {	//�ٹٲ��� �ִٸ� �Ʒ� ���� ����.
					System.out.printf("[%s]***\n",k41_s.toString());	//��Ʈ�� ���� k41_s�� ������ ����ϰ� �ٹٲ��ϱ�.
					k41_s.delete(0, k41_s.length());	//0��°���� ���̸�ŭ �����ϱ�.
				} else {
					k41_s.append(k41_c);	// k41_s�� �߰��Ѵ�.
				}
			}
			k41_lineCnt++;	// ���� �а� ���� ī��Ʈ.
		}
		
		System.out.printf("[%s]***\n", k41_s.toString());
		k41_br.close();
	}

}
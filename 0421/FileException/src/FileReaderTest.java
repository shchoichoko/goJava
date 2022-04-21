import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// #1 File Reader 22.04.21 �ּ���
		try {
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\mytest.txt");
		// ������ ���� ��ο� ���缭 mytext.txt�� ������ش�.
		FileWriter k41_fw;
		//������ �ۼ����� ��ü�� �����.
		k41_fw = new FileWriter(k41_f);
		//write()�� ���ϴ� ���ڿ��� �ۼ��Ѵ�.
		k41_fw.write("�ȳ� ����\n");
		k41_fw.write("hello ���\n");
		//�ش� ��ü�� ��� �Ϸ� �� �ݾ��ش�.
		k41_fw.close();
		FileReader k41_fr = new FileReader(k41_f);
		// ������ �о��ִ� ��ü�� �����.
		int k41_n = -1;
		char[] k41_ch;
		
		while (true) {
			k41_ch = new char[100];	// �ִ� 100�� ���� �д´�.
			k41_n = k41_fr.read(k41_ch);
			if (k41_n == -1)	//k41_fr.read(k41_ch)�� ���� -1�϶� �ݺ������� �����.
				//read() �޼ҵ�� ��Ʈ���� ������ �׻� -1�� ��ȯ��.
				break;
			
			
			for (int k41_i = 0; k41_i < k41_n; k41_i++) {
				System.out.printf("%c", k41_ch[k41_i]);
				//���ڸ� �ݺ��ؼ� ����ϴ� ��.
			}
		}
		k41_fr.close();	// ���� ������ �ݾ��ش�.
		System.out.printf("\n FILE READ END");
		}catch(Exception k41_e) {	//���� ó�� �ɰ�� �Ʒ� ���� ����.
			System.out.printf("�� ����[%s]\n",k41_e);
		}
		
		
		
	}

}

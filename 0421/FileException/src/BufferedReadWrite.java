import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWrite {

	public static void FileWrite() throws IOException{
		// #2 File Reader 22.04.21 �ּ���
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\mytest2.txt");
		//��ο��� ������ �����Ѵ�. �ۼ��� ���� ��� ã��
		BufferedWriter k41_bw = new BufferedWriter(new FileWriter(k41_f));
		// �ۼ��� ���� ��ü �����.
		k41_bw.write("�ȳ�����");	//BufferedWriter�� �ۼ��ϱ�
		k41_bw.newLine();	//���� ����.
		k41_bw.write("hello ���");	//BufferedWriter�� �ۼ��ϱ�
		k41_bw.newLine();	//���� ����.
		
		k41_bw.close();
		// �ۼ� �Ϸ� �� �ݾ��ش�.
		
	}

	public static void FileRead() throws IOException{
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\mytest2.txt");
		//��ο��� ������ �����Ѵ�. �б� ���� ��� ã��.
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));	
		//�б⸦ ���� ��ü �����.
		String k41_readtxt;	//���ڿ� ������ ���� ����.
		while((k41_readtxt = k41_br.readLine())!=null) {	//���� ���� null�� �ƴҶ� �ݺ��Ѵ�.
			System.out.printf("%s\n", k41_readtxt);	//���ڿ� ���·� ����Ѵ�.
		}
		k41_br.close();
		// �б� �Ϸ� �� �ݾ��ش�.
	}
	
	
	public static void main(String[] args) throws IOException {
		FileWrite();	//�ۼ��ϴ� �Լ�
		FileRead();		//�д� �Լ�.
	}

}

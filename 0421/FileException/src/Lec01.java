import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec01 {

	public static void main(String[] args) throws IOException {
		// #3 �������Ͽ� ���� 22.04.21 �ּ���
		
		File k41_f = new File
				("C:\\Users\\������\\Desktop\\����\\FileReadTest\\12_04_07_E_���������������_��⵵.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// ������ �б� ���� BufferedReader��ü ����.
		String k41_readtxt;	// ����ִ��� Ȯ���� ���� ���ڿ� ���� ����.
		if((k41_readtxt = k41_br.readLine()) ==null) {	
			//csv������ �о����� null�� �����ٸ� �� �����̶�� ���� ���.
			System.out.println("�� �����Դϴ�.");
			return;
		}
		String[] k41_field_name = k41_readtxt.split(",");	
		//split(",")���� �޸� �������� �迭�� ����. fieldname�� ���� �׸��� ����.
		int k41_lineCnt = 0;
		while((k41_readtxt = k41_br.readLine())!=null) {	
			//���� ���� null�� �ƴҶ� ��� �ݺ��Ѵ�.
			
			String[] k41_field = k41_readtxt.split(",");	
			//split(",")���� �޸� �������� �迭�� ����.
			System.out.printf("**[%d��° �׸�]***********\n",k41_lineCnt+1);
			for(int k41_j = 0; k41_j < k41_field_name.length; k41_j++) {	
				//k41_field_name �迭�� ���̸�ŭ �ݺ�.
				System.out.printf(" %s : %s\n", k41_field_name[k41_j],k41_field[k41_j]);	
			}
			System.out.printf("********************************\n");
			if(k41_lineCnt == 100)break;	//�ִ� ��� ���ڸ� ������.
			k41_lineCnt++;	//�� ��° �׸����� ǥ�����ֱ� ���ؼ� 1�� ������.
			
		}
		//�о��ִ� ��ü �ݾ��ֱ�.
		k41_br.close();
	}

}

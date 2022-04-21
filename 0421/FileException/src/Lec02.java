import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lec02 {

	public static void main(String[] args) throws IOException {
		// #4 �Ÿ���� 22.04.21 �ּ���
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\12_04_07_E_���������������_��⵵_��.txt");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// ������ �о��� ���۸��� ��ü�� ����.
		String k41_readtxt;
		List list = new ArrayList<>();
		if((k41_readtxt = k41_br.readLine())==null) {	//���پ� ���� ���� null���̶�� �������̶�� �����
			System.out.println("�� �����Դϴ�.");
			return;
		}
		String[] k41_field_name = k41_readtxt.split("\t");
		double k41_lat = 37.3860521;	// �д����ձ�� ����
		double k41_lng = 127.1214038;	// �д����ձ��	�浵
		int k41_lineCnt = 0;
		double k41_maxVal = 0; double k41_minVal = 160000000;
		while((k41_readtxt = k41_br.readLine())!=null) {	//���پ� ���� ���� null���� �ƴҶ� �ݺ�
			String[] k41_field = k41_readtxt.replace("\n", " ").split("\t");	//�� �������� ���� ���ڿ��� �ʵ忡 ��������.


			System.out.printf("**[%d��° �׸�]***************\n",k41_lineCnt+2);	// �� ��° �׸����� �˷���.
			System.out.printf(" %s : %s\n", k41_field_name[9], k41_field[9]);	// ���θ� �ּ� ���
			System.out.printf(" %s : %s\n", k41_field_name[12], k41_field[12]);	// ��ȭ��ȣ ���
			System.out.printf(" %s : %s\n", k41_field_name[13], k41_field[13]);	// ���� ���
			System.out.printf(" %s : %s\n", k41_field_name[14], k41_field[14]);	// �浵 ���
			double k41_dist = Math.sqrt(Math.pow(Double.parseDouble(k41_field[13])-k41_lat,2)+
					Math.pow(Double.parseDouble(k41_field[14])-k41_lng, 2)); //�Ÿ��� ���Ѵ�. ��Ÿ��� ����. 
			
			if(k41_maxVal<k41_dist) {
				k41_maxVal = k41_dist;
			}
			
			if(k41_minVal>k41_dist) {
				k41_minVal = k41_dist;
			}
			
			System.out.printf(" ���������� �Ÿ� : �� %.3f km\n", k41_dist*100);
			System.out.printf("*******************************\n");
			k41_lineCnt++;
			
		}
		System.out.printf("�ִ�Ÿ�!!!! : %.3f\n", k41_maxVal*100);
		System.out.printf("�ּҰŸ�@@@@ : %.3f\n",k41_minVal*100);
		
		k41_br.close();
	}


}

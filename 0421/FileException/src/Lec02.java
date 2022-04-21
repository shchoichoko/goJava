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
		
		// ������ ��ġ�� �ִ� ������ �����Ͽ� File ����		
		File k41_f = new File("D:\\DEV\\FileReadTest\\12_04_07_E_���������������_��⵵_��.txt");
		// ������ ������ File�� BufferedReader�� �������� ����
		BufferedReader k41_br = new BufferedReader (new FileReader(k41_f));
		// �ؽ�Ʈ�� �ٲ㰡�鼭 ���� ���ڿ� ���� ����
		String k41_readtxt;
		// ù ���� readtxt�� �Է��ϰ� ���� ���̿��� null�� ������ ������ �޼��� ���
		if((k41_readtxt = k41_br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		// field_name ���ڿ� �迭�� ù���� �� ������ �߶� �Է��Ѵ�.
		String[] k41_field_name = k41_readtxt.split("\t");
		
		// �����ش��� ���� �浵
		double k41_lat = 37.3860521;
		double k41_lng = 127.1214038;
		
		int k41_k41_LineCnt = 1;	// ���� ���°�� ���� �ִ��� Ȯ���� ������ ���� ����
		int k41_maxPointer = 0;	// �ִ밪�� ��ġ�� ���� ���� ����
		int k41_minPointer = 0;	// �ּҰ��� ��ġ�� ���� ���� ����
		double k41_distMax = 0.0;	// �ִ�Ÿ��� ���� ���� ����
		double k41_distMin = 0.0;	// �ּҰŸ��� ���� ���� ����
		
		while((k41_readtxt = k41_br.readLine()) != null) { 	// ���� ���������� ���� while�� �ۼ�
			
			String [] k41_field = k41_readtxt.split("\t");	// ���� ������ �� ������ �߶� field �迭�� �ִ´�.
			System.out.printf("**[%d��° �׸�]***********************\n",k41_k41_LineCnt);	// ���� ���° �׸����� ����Ѵ�.
			System.out.printf(" %s : %s\n", k41_field_name[10], k41_field[10]);	//�����������ּ��� �׸�� ������ ����Ѵ�.
			System.out.printf(" %s : %s\n", k41_field_name[13], k41_field[13]);	//������ ����Ѵ�.
			System.out.printf(" %s : %s\n", k41_field_name[14], k41_field[14]);	//�浵�� ����Ѵ�.

			// �Ÿ� ��� (��Ÿ��� ����) sqrt(������), pow(����), field�� ���� ���������� �ٲ㼭 ������ ������ ��ǥ�� �Ÿ����
			double k41_dist = Math.sqrt(Math.pow(Double.parseDouble(k41_field[13]) - k41_lat,2)
					+ Math.pow(Double.parseDouble(k41_field[14]) -k41_lng, 2));
			// ������ ����� �Ÿ� ���
			System.out.printf(" ���������� �Ÿ� : %f\n", k41_dist);
			System.out.println("************************************");
			// �ִ� �ּ� ���ϴ� if�� ����
			if(k41_k41_LineCnt == 1) {	// ���� ���� ó���϶�
				k41_distMax = k41_dist;	// �ش簪�� �ִ밪 ������ �ֱ�
				k41_distMin = k41_dist;	// �ش� ���� �ּҰ� ������ �ֱ�
				k41_maxPointer = k41_k41_LineCnt;	// �ִ밪�� ��ȣ �ֱ�
				k41_minPointer = k41_k41_LineCnt;	// �ּҰ��� ��ȣ �ֱ�
				
				
			} else {
				if(k41_dist > k41_distMax) {
					k41_distMax = k41_dist;	// �ִ밪�� �����Ѵ�.
					k41_maxPointer = k41_k41_LineCnt;	//�ִ밪�� ��ġ�� �����Ѵ�.
				}
				if(k41_distMin > k41_dist) {
					k41_distMin = k41_dist;	//�ּҰ��� �����Ѵ�.
					k41_minPointer = k41_k41_LineCnt;	// �ּҰ��� ��ġ�� �����Ѵ�.
				}
			}
			
			k41_k41_LineCnt++;	// ���� �� ���ϱ�
		}
		// �ִ�Ÿ� , �ּҰŸ� �� �� ���° ������ ����Ѵ�.
		System.out.printf("[%d��° �׸�] �ִ�Ÿ� : %5.3f KM\n", k41_maxPointer, k41_distMax*100);
		System.out.printf("[%d��° �׸�] �ּҰŸ� : %5.3f KM\n", k41_minPointer, k41_distMin*100);		
		// BufferedReader �ݱ�
		k41_br.close();
	}


}

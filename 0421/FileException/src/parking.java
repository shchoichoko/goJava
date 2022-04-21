import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class parking {

	public static void main(String[] args) throws IOException {
		// pg8 �Ÿ����, ������
	// ������ ��ġ�� �ִ� ������ �����Ͽ� File ����
		File k41_f = new File("D:\\DEV\\FileReadTest\\�ѱ������������_������������������_20191224.txt");
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
		
		//���ձ�� �����浵 
		double k41_lat = 37.3860521;
		double k41_lng = 127.1214038;
		
		int k41_LineCnt = 1;	// ���� ���°�� ���� �ִ��� Ȯ���� ������ ���� ����
		int k41_maxPointer = 0;	// �ִ밪�� ��ġ�� ���� ���� ����
		int k41_minPointer = 0;	// �ּҰ��� ��ġ�� ���� ���� ����
		double k41_distMax = 0.0;	// �ִ�Ÿ��� ���� ���� ����
		double k41_distMin = 0.0;	// �ּҰŸ��� ���� ���� ����

		while((k41_readtxt = k41_br.readLine()) != null) { 	// ���� ���������� ���� while�� �ۼ�
			
			String [] field = k41_readtxt.split("\t");	// ���� ������ �� ������ �߶� field �迭�� �ִ´�.
			System.out.printf("**[%d��° �׸�]***********************\n",k41_LineCnt);	// ���� ���° �׸����� ����Ѵ�.
			System.out.printf(" %s : %s\n", k41_field_name[1], field[1]);	// �ش� ���� ��������� �׸�� ������ ����Ѵ�.
			System.out.printf(" %s : %s\n", k41_field_name[2], field[2]);	// �ش� ���� ���� : ������ ���� ����Ѵ�.
			System.out.printf(" %s : %s\n", k41_field_name[3], field[3]);	// �ش� ���� �浵 : �浵�� ���� ����Ѵ�.
			// �Ÿ� ��� (��Ÿ��� ����) sqrt(������), pow(����), field�� ���� ���������� �ٲ㼭 ������ ������ ��ǥ�� �Ÿ����
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[3]) - k41_lat,2)
					+ Math.pow(Double.parseDouble(field[2]) -k41_lng, 2));
			// ������ ����� �Ÿ� ���
			System.out.printf(" ���������� �Ÿ� : %f\n", dist);
			System.out.println("************************************");
			// �ִ� �ּ� ���ϴ� if�� ����
			if(k41_LineCnt == 1) {
				k41_distMax = dist;	// �ش� ���� �ִ밪 ������ �ֱ�
				k41_distMin = dist;	// �ش� ���� �ּҰ� ������ �ֱ�
				k41_maxPointer = k41_LineCnt;	// �ִ밪�� ��ȣ �ֱ�
				k41_minPointer = k41_LineCnt;	// �ּҰ��� ��ȣ �ֱ�
			} else {
				if(dist > k41_distMax) {
					k41_distMax = dist;	// �ִ밪�� ����
					k41_maxPointer = k41_LineCnt;	//�ִ밪�� ��ġ�� ����
				}
				if(k41_distMin > dist) {
					k41_distMin = dist;	//�ּҰ��� ����
					k41_minPointer = k41_LineCnt;	// �ּҰ��� ��ġ�� ����
				}
			}
			
			k41_LineCnt++;	// ���� �� ���ϱ�
		}
		// �ִ�Ÿ� , �ּҰŸ� �� �� ���° ������ ����Ѵ�.
		System.out.printf("[%d��° �׸�] �ִ�Ÿ� : %.3f KM\n", k41_maxPointer, k41_distMax*100);
		System.out.printf("[%d��° �׸�] �ּҰŸ� : %.3f KM\n", k41_minPointer, k41_distMin*100);		
		// BufferedReader ����
		k41_br.close();
	}

}

package AboutArray;


public class ReportSheet_26p {
	// #page26 ���� �Էµ����� ��� 22.04.20 �ּ���

	public static void main(String[] args) {

		int k41_iPerson = 5;	// ������ �ο� �� ���ϱ�.
		OneRec[] k41_data = new OneRec[k41_iPerson];	//OneRec Ŭ������ �迭�� ����. �迭�� ũ��� �ο� ���� ����.

		for (int k41_i = 0; k41_i < k41_iPerson; k41_i++) {	
			// �ο���ŭ �ݺ��� ���� for��
			String k41_name = String.format("ȫ��%02d", k41_i+1);	
			// �켱 �̸�, ����,����,���� ���� �Է��� ���� ������ �ϳ��� ����.
			int k41_kor = (int)(Math.random()*100);	
			//0~100���� �������� ������. ������ ���� k41_kor�� �����ϱ� ���� int�� ����ȯ ����.
			int k41_eng = (int)(Math.random()*100); 
			//0~100���� �������� ������. ������ ���� k41_eng�� �����ϱ� ���� int�� ����ȯ ����.
			int k41_mat = (int)(Math.random()*100); 
			//0~100���� �������� ������. ������ ���� k41_mat�� �����ϱ� ���� int�� ����ȯ ����.
			// ������ ������ �̸��� ���� ������ �迭�� �����ϴ� OneRec �Լ��� �̿���.
			k41_data[k41_i] = new OneRec(k41_name,k41_kor,k41_eng,k41_mat);
			
			// ���Ŀ� ���缭 ���. k41_data�� �̿��� OneRecŬ������ �Լ��� ����ͼ� ���.
			System.out.printf("��ȣ : %d �̸� : %s ���� : %d ���� : %d ���� : %d �հ� : %d ��� : %.2f\n", 
					k41_i+1, k41_data[k41_i].k41_name(),
					k41_data[k41_i].k41_kor(),k41_data[k41_i].k41_eng(),k41_data[k41_i].
					k41_mat(),k41_data[k41_i].sum(),k41_data[k41_i].ave());
		}
		
		
		
	}
}

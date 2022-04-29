package AboutArray;

import java.util.ArrayList;

public class ReportSheet_31page {

static ArrayList<OneRec_31p> k41_ArrayOncRec = new ArrayList <OneRec_31p>();
	
	static int k41_sumKor = 0;	//������ ����, �����
	static int k41_sumEng = 0;	//������ ����, �����
	static int k41_sumMat = 0;	//������ ����, ���м���
	static int k41_sumSum = 0;	//������ ����, ������
	static int k41_sumAve = 0;	//������ ����, �������
	static final int k41_iPerson = 20;	//�л��� �Է�
	
	public static void main(String[] args) {
		k41_dataSet();	//������ ���� �޼ҵ�
		k41_HeaderPrint();	//�Ӹ��� ��� �޼ҵ�
		// ������ ��� ����Ʈ�� ũ�⸸ŭ ���� for�� �ۼ�
		for(int k41_i = 0; k41_i < k41_ArrayOncRec.size(); k41_i++) {
			k41_ItemPrint(k41_i);	//�� �л��� ������ ����ϴ� �޼ҵ� ����
		}
		k41_TailPrint();	// ������ �� ��� �޼ҵ�
	}

	public static void k41_dataSet() {	//�����͸� �����ϴ� �޼ҵ�
		for(int i = 1; i <= k41_iPerson; i++) {	// 1���� �� �л��� ��ŭ �ݺ��ϴ� for�� �ۼ�
			String k41_name = String.format("ȫ��%02d", i);	// �л��� �̸� �Է�
			int k41_kor = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			int k41_eng = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			int k41_mat = (int)(Math.random()*100);	//�л��� ���� �Է�, ����, 0���� 99���� �����ϴ� �����Լ�
			k41_ArrayOncRec.add(new OneRec_31p(i, k41_name, k41_kor, k41_eng, k41_mat));	
			//�Է��� ������ ��� ����Ʈ�� ��Ŭ���� ���·� �߰��Ѵ�.
		}
	}
	
	public static void k41_HeaderPrint() {	// �Ӹ��� ��� �޼ҵ�
		System.out.println("*************************************");
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","��ȣ","�̸�",
				"����","����","����","�հ�","���");
		System.out.println("*************************************");
	}
	
	public static void k41_ItemPrint(int i) {	//�� �л��� ������ ����ϴ� �޼ҵ�
		OneRec_31p k41_rec;	//Ŭ���� ����
		
		k41_rec = k41_ArrayOncRec.get(i);	//Ŭ���� ����Ʈ�� i��° Ŭ������ ���ܿ´�.
		// ����, �л� id, �̸�, �����, �����, ���м���, �հ�, ��������� ����Ѵ�.
		System.out.printf("%2d %4s %4d %4d %4d   %3d %6.2f\n", k41_rec.getStudentId(), 
				k41_rec.getName(), k41_rec.getKor(),
				k41_rec.getEng(), k41_rec.getMat(), k41_rec.getSum(), k41_rec.getAve());
		//������ ������ ���ϱ����� ������ ������ �����Ѵ�
		k41_sumKor += k41_rec.getKor();	
		k41_sumEng += k41_rec.getEng();
		k41_sumMat += k41_rec.getMat();
		k41_sumSum += k41_rec.getSum();
		k41_sumAve += k41_rec.getAve();
	}
	
	public static void k41_TailPrint() {	//������ ������� ���
		System.out.println("*************************************");
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k41_sumKor, 
				k41_sumKor/(double)k41_ArrayOncRec.size());
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k41_sumEng, 
				k41_sumEng/(double)k41_ArrayOncRec.size());
		// ���� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("�����հ�  %4d    �������: %6.2f\n",k41_sumMat, 
				k41_sumMat/(double)k41_ArrayOncRec.size());
		System.out.println("*************************************");
		// ����� ���� �հ�, ����� ����Ѵ�.
		System.out.printf("������հ� %4d   �����: %6.2f\n",k41_sumAve, 
				k41_sumAve/(double)k41_ArrayOncRec.size());
	}

}

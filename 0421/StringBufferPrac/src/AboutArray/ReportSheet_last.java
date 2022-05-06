package AboutArray;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import javax.xml.crypto.Data;

public class ReportSheet_last {
	//���� ����ǥ ��� 22.04.29 �ּ���
	//���� �Լ����� �̿�ǹǷ� static���� ���� ����.
	static ArrayList<OneRec2> k41_ArrayOneRec = new ArrayList<OneRec2>();
	static int k41_sumkor = 0;	// ���� ������ ��.
	static int k41_sumeng = 0;	// ���� ������ ��.
	static int k41_summat = 0;	// ���� ������ ��.
	static int k41_sumsum = 0;	// ������ ��.
	static int k41_sumave = 0;	// ���.
	static final int k41_iPerson = 5; //�Է��� �ο���
	static final int k41_peoplePerPage = 5;	// �������� ��µǴ� �ο���
	static int k41_page = k41_iPerson / k41_peoplePerPage;	// ������ ��
	static int k41_startNum = k41_page * k41_peoplePerPage;	
	// ������ �������� �����ϴ� ����
	static int k41_presentKorSum = 0;static int k41_presentEngSum = 0;
	static int k41_presentMatSum = 0; //���� �������� ���� ���ϱ� ���� ������.
	
	public static void main(String[] args) {
		dataSet();		//�����͸� arraylist�� �����ϴ� �Լ�.
		dataSort();		//�����͸� ���� �������� �������� �����ϴ� �Լ�.
		for (int k41_pageI = 0; k41_pageI < k41_page; k41_pageI++) {//������ �� ��ŭ �ݺ�.
			HeaderPrint(k41_pageI);	// ��� �κ��� ����ϴ� �Լ�.
			for (int k41_i = 0+(k41_pageI*k41_peoplePerPage);
				k41_i < k41_peoplePerPage+(k41_pageI*k41_peoplePerPage); k41_i++) {
				itemPrint(k41_i);//���������� ���� ����ϴ� ��.
			}
			tailPrint(1,k41_pageI); //���������� �κ��� ����ϴ� �Լ�.
		}
		if(k41_iPerson%k41_peoplePerPage!=0) {//������ �������� ����ϱ� ���� ���ǹ��� ���.
			int k41_lastpage = k41_page; // ������ ������ �����ϴ� ����.
			HeaderPrint(k41_lastpage);	//������ �������� ��� �κ��� ����ϴ� �Լ�.
			for(int k41_i = k41_startNum; k41_i < k41_iPerson; k41_i++) {
				itemPrint(k41_i);	//������ �������� ������ �Ű������� �־ �Լ� ����.
			}
			tailPrint(2,0); //������ �������� ���������� �κ��� ������ִ� �Լ�.
		}
	}
	
	public static void dataSort() { // ������ ������ ���� �Լ�.
		Comparator<OneRec2> k41_com = new Comparator<OneRec2>() {
			//�񱳸� ���� Comparator ����.
			public int compare(OneRec2 k41_a1, OneRec2 k41_a2) {
				//���� �� ���� �Ű������� �ִ´�.
				//������ ������ ���Ѵ�.
				return (k41_a1.sum() - k41_a2.sum());
			}
		};
		Collections.sort(k41_ArrayOneRec, k41_com);	// ������������ ����.
		Collections.reverse(k41_ArrayOneRec);	//������ ����� ���� 
		//������������ �ٽ� ����.

	}
	
	public static void dataSet() {	// �����͸� ������� ArrayList�� �����ϴ� �Լ�.
		for (int k41_i = 0; k41_i < k41_iPerson; k41_i++) {
			String k41_name = String.format("�ּ�%02d", k41_i+1);
			int k41_kor = (int) (Math.random() * 100);	//0~100���� ���� ������ �������� ����.
			int k41_eng = (int) (Math.random() * 100);	//0~100���� ���� ������ �������� ����.
			int k41_mat = (int) (Math.random() * 100);	//0~100���� ���� ������ �������� ����.
			k41_ArrayOneRec.add(new OneRec2(k41_i, k41_name, k41_kor, k41_eng, k41_mat));
			// ��ȣ, �̸�, �������� ������ ���� ������ �����Ѵ�.
		}
	}

	public static void HeaderPrint(int k41_pageI) {	
		//���� ����ǥ, ��������ȣ,������ڸ� ����ϴ� �Լ�
		System.out.println("                  ��������ǥ");
		System.out.println("");
		System.out.printf("PAGE : %d	          ������� : %s\n",k41_pageI+1,getTimeNow());
		System.out.printf("========================================================\n");
		System.out.printf("%2s %5s   %4s %4s %4s %4s  %4s\n", "��ȣ", "�̸�", "����", "����",
				"����", "����", "���");
		System.out.printf("========================================================\n");
	}

	public static void itemPrint(int k41_i) {
		//�׸� ��ġ�� ������������ �հ�� ����� ����ϴ� �Լ�.
		OneRec2 k41_rec;//OneRec2�� �����͸� �ҷ����� ���� ��ü ����.
		k41_rec = k41_ArrayOneRec.get(k41_i);// �ش� ������ ������ ������.
		System.out.printf("%03d   %5s %6d %6d %6d %6d %6.0f\n", k41_rec.k41_student_id() + 1, k41_rec.k41_name(),
				k41_rec.k41_kor(), k41_rec.k41_eng(), k41_rec.k41_mat(), k41_rec.sum(), k41_rec.ave());
		k41_presentKorSum += k41_rec.k41_kor();	//���� �������� ���� �հ踦 �����ϴ� ��.
		k41_presentEngSum += k41_rec.k41_eng();
		k41_presentMatSum += k41_rec.k41_mat();
		int k41_presentSum = k41_presentKorSum + k41_presentEngSum + k41_presentMatSum;
		// ���� �� �հ踦 ������ ����.
		if(k41_i%k41_peoplePerPage==k41_peoplePerPage-1) {
			//�� �������� ������ �κп����� ����ϱ� ���� ������ �ɾ��.
			System.out.printf("========================================================\n");
			System.out.println("����������");
			System.out.printf("�հ� :       %6d %6d %6d %6d  %6d\n",k41_presentKorSum,k41_presentEngSum,k41_presentMatSum,
					k41_presentSum, k41_presentSum/3);
			System.out.printf("��� :       %6.0f %6.0f %6.0f %6.0f  %6.0f\n",k41_presentKorSum/(double)k41_peoplePerPage,k41_presentEngSum/(double)k41_peoplePerPage
					,k41_presentMatSum/(double)k41_peoplePerPage,
					k41_presentKorSum/(double)k41_peoplePerPage+k41_presentEngSum/(double)k41_peoplePerPage+
					k41_presentMatSum/(double)k41_peoplePerPage, 
					(k41_presentKorSum/(double)k41_peoplePerPage+k41_presentEngSum/(double)k41_peoplePerPage+
					k41_presentMatSum/(double)k41_peoplePerPage)/3);
			k41_presentKorSum=0;k41_presentEngSum=0;k41_presentMatSum=0;
			//�� ���� �������� ������ ��ġ�� �ʱ� ���� �ٽ� 0���� �ʱ�ȭ �����ش�.
		}
		if(k41_i==k41_iPerson-1&&k41_iPerson!=k41_peoplePerPage) {
			//������ �������� ���� ������ ����� ���� ������ �ɾ��.
			System.out.printf("========================================================\n");
			System.out.println("����������");
			System.out.printf("�հ� :       %6d %6d %6d %6d  %6d\n",k41_presentKorSum,k41_presentEngSum,
					k41_presentMatSum,k41_presentSum, k41_presentSum/3);
			System.out.printf("��� :       %6.0f %6.0f %6.0f %6.0f  %6.0f\n",k41_presentKorSum/
					(double)(k41_iPerson%k41_peoplePerPage),k41_presentEngSum/(double)(k41_iPerson%k41_peoplePerPage)
					,k41_presentMatSum/(double)(k41_iPerson%k41_peoplePerPage),
					k41_presentKorSum/(double)(k41_iPerson%k41_peoplePerPage)+k41_presentEngSum/
					(double)(k41_iPerson%k41_peoplePerPage)+k41_presentMatSum/(double)(k41_iPerson%k41_peoplePerPage), 
					(k41_presentKorSum/(double)(k41_iPerson%k41_peoplePerPage)+k41_presentEngSum/(double)(k41_iPerson%k41_peoplePerPage)+
					k41_presentMatSum/(double)(k41_iPerson%k41_peoplePerPage))/3);
		}
		// �����հ踦 ���� �ĵ�.
		k41_sumkor += k41_rec.k41_kor();
		k41_sumeng += k41_rec.k41_eng();
		k41_summat += k41_rec.k41_mat();
		k41_sumsum += k41_rec.sum();
		k41_sumave += k41_rec.ave();
	}
	
	public static void tailPrint(int order, int k41_pageI) {//���������� ����� ���� �Լ�.
		int k41_people = k41_peoplePerPage+(k41_pageI*k41_peoplePerPage);
		if(order !=1) {//�Ű����� order ���� 1�� �ƴҶ� ������ �������� ������������ ���.
			k41_people = k41_iPerson;
		}
		System.out.printf("========================================================\n");
		System.out.println("����������");
		System.out.printf("�հ� :       %6d %6d %6d %6d  %6d\n",k41_sumkor,k41_sumeng,
				k41_summat,k41_sumkor+k41_sumeng+k41_summat,
				(k41_sumkor+k41_sumeng+k41_summat)/3);
		System.out.printf("��� :       %6.0f %6.0f %6.0f %6.0f  %6.0f\n",k41_sumkor/(double) k41_people,
				k41_sumeng/(double) k41_people,
				k41_summat/(double) k41_people,k41_sumkor/(double) k41_people+
				k41_sumeng/(double) k41_people+k41_summat/(double) k41_people,
				(k41_sumkor/(double) k41_people+k41_sumeng/(double) k41_people+k41_summat/(double) k41_people)/3);
		System.out.printf("========================================================\n");
		System.out.println("");
	}
	
	public static String getTimeNow() {	// ��½ð��� ��� ���� �Լ�.
		SimpleDateFormat k41_form = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar k41_cal = Calendar.getInstance();
		String k41_now = k41_form.format(k41_cal.getTime());//���� �ð��� �� ���ڿ��� ����.
		return k41_now;	//�ð��� ����� ���ڿ��� ��ȯ���ش�.
	}

	
}

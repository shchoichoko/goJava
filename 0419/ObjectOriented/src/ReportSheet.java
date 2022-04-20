import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet {
	// #19 ���� �Էµ����� ��� 22.04.20 �ּ���
	static int k41_iPerson = 23; // �迭 ũ�⸦ ����. 
	static int k41_printPerson = 4;	//�������� �ο���
	static int k41_totalPageNum = k41_iPerson/k41_printPerson;	//�� ������ ��
	static int k41_lastPeople = k41_iPerson % k41_totalPageNum;	//������ �������� ���� �ο� �� 
	static int k41_startNum = k41_totalPageNum * k41_printPerson;
	static InputData k41_inData = new InputData(k41_iPerson,k41_totalPageNum); // InputData Ŭ������ ��ü ����
	static int k41_korSumArr[] = new int[k41_totalPageNum];
	static int k41_engSumArr[] = new int[k41_totalPageNum];
	static int k41_matSumArr[] = new int[k41_totalPageNum];
	static int k41_lastKorSum = 0;
	static int k41_lastEngSum = 0;
	static int k41_lastMatSum = 0;
	static int k41_lastSum = 0;

	public static void main(String[] args) {// �����Լ�
		if(k41_totalPageNum == 1) {
			k41_lastPeople = k41_iPerson-k41_printPerson;
		}
		inputData(); // ������ �����ϴ� �Լ�.

		printData(); // �������� ������ ����ϴ� �Լ�.

	}

	public static void printHeader(int k41_pageNum) { // ��������ǥ ���κ� ����ϴ� �Լ�
		System.out.printf("                  ��������ǥ\n\n");
		printTime(k41_pageNum);
		System.out.println("==================================================");
		System.out.printf("��ȣ  �̸�    ����   ����   ����  ����  ���\n");
		System.out.println("==================================================");
	}

	// ������ ���� ������ �迭�� ����. 
	public static void inputData() {
		for (int k41_p = 0; k41_p < k41_totalPageNum; k41_p++) {
			
			for (int k41_i = k41_p * k41_printPerson; k41_i < k41_printPerson * (k41_p + 1); k41_i++) {
				String k41_name = String.format("ȫ��%02d", k41_i + 1); // �̸��� �ֱ����� ���� ����.
				int k41_kor = (int) (Math.random() * 100); // ���� ������ �������� ����1~100������ ����.
				int k41_eng = (int) (Math.random() * 100); // ���� ������ �������� ����1~100������ ����.
				int k41_mat = (int) (Math.random() * 100); // ���� ������ �������� ����1~100������ ����.
				k41_inData.SetData(k41_p,k41_i, k41_name, k41_kor, k41_eng, k41_mat);
				// SetData�Լ��� ��ȣ, �̸�, ����, ����, ���� ������ �Ű������� �־� ����.
				k41_korSumArr[k41_p] +=k41_kor; 
				k41_engSumArr[k41_p] +=k41_eng; 
				k41_matSumArr[k41_p] +=k41_mat; 
			}
			
			//������ ������ ����.
			if (k41_lastPeople != 0) {
				for (int k41_l = k41_startNum; k41_l < k41_iPerson; k41_l++) {
					String k41_name = String.format("ȫ��%02d", k41_l + 1); // �̸��� �ֱ����� ���� ����.
					int k41_kor = (int) (Math.random() * 100); // ���� ������ �������� ����1~100������ ����.
					int k41_eng = (int) (Math.random() * 100); // ���� ������ �������� ����1~100������ ����.
					int k41_mat = (int) (Math.random() * 100); 
					k41_inData.SetData(k41_p, k41_l, k41_name, k41_kor, k41_eng, k41_mat);
				}
			}
		}
	}

	// ������ inputData���� �迭�� �����ߴ� ��ġ�� ���.
	public static void printData() {

		for(int k41_p = 0; k41_p < k41_totalPageNum; k41_p++) {
			//System.out.println(k41_inData.k41_korSumArr[k41_p]);
		}
		
		
		keepSaveGrades();
		//������ �� ��ŭ , �ݺ��ϴ� ��
		for (int k41_p = 0; k41_p < k41_totalPageNum; k41_p++) {
			int k41_pageSum = k41_korSumArr[k41_p] + k41_engSumArr[k41_p] + k41_matSumArr[k41_p];
			double k41_totalAvg = (k41_korSumArr[k41_p] + k41_engSumArr[k41_p] + k41_matSumArr[k41_p]) / (double)k41_printPerson;
			double k41_korAvg = k41_korSumArr[k41_p] / (double)k41_printPerson;
			double k41_engAvg = k41_engSumArr[k41_p] / (double)k41_printPerson;
			double k41_matAvg = k41_matSumArr[k41_p] / (double)k41_printPerson;
			double k41_avgSum = k41_korAvg + k41_engAvg + k41_matAvg;
			int k41_accKorSumVal = 0;int k41_accEngSumVal = 0;int k41_accMatSumVal = 0;int k41_accTotalSum = 0;
			double k41_accKorAvg, k41_accEngAvg, k41_accMatAvg; double k41_accAvgTotal;
			
				printHeader(k41_p + 1); // ��������ǥ ���κ� ����ϴ� �Լ�.
				// �ο� �� ��ŭ, �迭 ũ�⸸ŭ �ݺ��ؼ� ����ϴ� ��.
				for (int k41_i = k41_p * k41_printPerson; k41_i < k41_printPerson * (k41_p + 1); k41_i++) {
			
						System.out.printf("%03d   %4s %5d %5d %5d %5d %6.0f\n", k41_inData.k41_num[k41_i] + 1,
								k41_inData.k41_name[k41_i], k41_inData.k41_kor[k41_i], k41_inData.k41_eng[k41_i],
								k41_inData.k41_mat[k41_i], k41_inData.k41_sum[k41_i], k41_inData.k41_avg[k41_i]);
				}
				
				System.out.println("==================================================");
				// ���� �հ�, ��ü �հ踦 ����ϴ� ��.
				System.out.printf("����������\n");
				System.out.printf("�հ�        %6d %5d %5d %5d %6.0f\n", k41_korSumArr[k41_p], k41_engSumArr[k41_p],
						k41_matSumArr[k41_p], k41_pageSum, k41_totalAvg);
				// ���� ���, ��ü ����� ����ϴ� ��.
				System.out.printf("���        %6.0f %5.0f %5.0f %5.0f %6.0f\n", k41_korAvg, k41_engAvg, k41_matAvg, k41_avgSum,
						k41_avgSum / 3.0);
				System.out.println("==================================================");
				for(int k41_r = 0; k41_r < k41_p+1; k41_r++ ) {
					k41_accKorSumVal+= k41_korSumArr[k41_r]; 
					k41_accEngSumVal += k41_engSumArr[k41_r]; 
					k41_accMatSumVal +=k41_matSumArr[k41_r];
					
				}
				k41_accTotalSum = k41_accKorSumVal + k41_accEngSumVal + k41_accMatSumVal;
				k41_accKorAvg = k41_accKorSumVal/(double)k41_printPerson;
				k41_accEngAvg = k41_accEngSumVal/(double)k41_printPerson;
				k41_accMatAvg = k41_accMatSumVal/(double)k41_printPerson;
				k41_accAvgTotal = k41_accKorAvg + k41_accEngAvg + k41_accMatAvg;
				System.out.printf("����������\n");
				System.out.printf("�հ�        %6d %5d %5d %5d %6.0f\n", k41_accKorSumVal, k41_accEngSumVal, k41_accMatSumVal, k41_accTotalSum, k41_accTotalSum/3.0);
				System.out.printf("���        %6.0f %5.0f %5.0f %5.0f %6.0f\n", k41_accKorAvg, k41_accEngAvg, k41_accMatAvg, k41_accAvgTotal,
						k41_accAvgTotal / 3.0);
				System.out.println("==================================================");
		}
		System.out.println("");
		printHeader(k41_totalPageNum + 1);
		printLastPeople();
	}

	//������ ������ �ο� ���
	public static void printLastPeople() {
		//�߰� �ο�
		int lastSum = k41_inData.k41_korSum + k41_inData.k41_engSum + k41_inData.k41_matSum;
		int lastAvgSum = k41_inData.k41_korSum/k41_iPerson + k41_inData.k41_engSum/k41_iPerson + k41_inData.k41_matSum/k41_iPerson;
		if(k41_totalPageNum == 1) {
			k41_lastPeople = k41_iPerson-k41_printPerson;
		}
		if (k41_lastPeople != 0) {
			for (int k41_l = k41_startNum; k41_l < k41_iPerson; k41_l++) {
				System.out.printf("0%d   %4s %5d %5d %5d %5d %6.0f\n", k41_inData.k41_num[k41_l] + 1,
						k41_inData.k41_name[k41_l], k41_inData.k41_kor[k41_l], k41_inData.k41_eng[k41_l],
						k41_inData.k41_mat[k41_l], k41_inData.k41_sum[k41_l], k41_inData.k41_avg[k41_l]);
				k41_lastKorSum += k41_inData.k41_kor[k41_l];
				k41_lastEngSum += k41_inData.k41_eng[k41_l];
				k41_lastMatSum += k41_inData.k41_mat[k41_l];
			}
		}
		k41_lastSum = k41_lastKorSum + k41_lastEngSum + k41_lastMatSum;
		int k41_lastAvgSum = k41_lastKorSum/k41_lastPeople + k41_lastEngSum/k41_lastPeople + k41_lastMatSum/k41_lastPeople;
		System.out.println("==================================================");
		System.out.printf("����������\n");
		System.out.printf("�հ�        %6d %5d %5d %5d %6.0f\n", k41_lastKorSum, k41_lastEngSum,
				k41_lastMatSum, k41_lastSum, k41_lastSum/3.0);
		// ���� ���, ��ü ����� ����ϴ� ��.
		System.out.printf("���        %6d %5d %5d %5d %6.0f\n", (int)(k41_lastKorSum/k41_lastPeople), (int)(k41_lastEngSum/k41_lastPeople), (int)(k41_lastMatSum/k41_lastPeople), k41_lastAvgSum,
				k41_lastAvgSum / 3.0);
		System.out.println("==================================================");
		System.out.printf("����������\n");
		System.out.printf("�հ�        %6d %5d %5d %5d %6.0f\n", k41_inData.k41_korSum, k41_inData.k41_engSum, k41_inData.k41_matSum, lastSum, lastSum/3.0);
		System.out.printf("���        %6d %5d %5d %5d %6.0f\n", k41_inData.k41_korSum/k41_iPerson, k41_inData.k41_engSum/k41_iPerson, k41_inData.k41_matSum/k41_iPerson, lastAvgSum,
				lastAvgSum / 3.0);
		System.out.println("==================================================");
		
	}
	// ���� �հ� ����.
	public static void keepSaveGrades() {
		for(int k41_i = 0; k41_i < k41_totalPageNum; k41_i++) {
			k41_inData.SetData2(k41_i,k41_inData.k41_korSum,k41_inData.k41_engSum,k41_inData.k41_matSum);
		}
	}
	// ���� �ð��� ��� �ϴ� ��.
	public static void printTime(int k41_pageNum) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat time = new SimpleDateFormat("YYYY.M.dd HH:mm:ss");
		System.out.printf("PAGE: %d             ������� : %s\n", k41_pageNum, time.format(cl.getTime()));
	}
}

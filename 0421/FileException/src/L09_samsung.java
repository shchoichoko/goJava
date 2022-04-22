import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L09_samsung {

	public static void main(String[] args) throws IOException {
		// #7 �Ｚ���� �� �����Ͽ� ���� �����ϱ�  22.04.21 
		
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\StockDailyPrice.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//������ �б� ���� BufferedReader�� ��ü ����.
		File k41_f1 = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\20130711.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//���� �ۼ��� ���� BufferedWriter ��ü�� ����.
		SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		//���� �ð� ���� �ۼ�.
		String k41_readtxt;String k41_startTimeStr;String k41_endTimeStr;
		//���پ� �б����� ���ڿ� ����. ���� �� ����ð� ������ ���� ���ڿ�.\
		// ���� �� ���� �ð� ������ ���� ���ڿ�.
		long k41_startTime; long k41_endTime;
		//���� �ð�, �� �ð� ������ ���� ����.
		int k41_cnt = 0; int k41_wcnt = 0;
		k41_startTime =System.currentTimeMillis();//���� �ð� üũ�� ���� ��.
		
		
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			StringBuffer k41_s = new StringBuffer();	//��Ʈ�� ���� k41_s�� ����.
			String[] k41_field = k41_readtxt.split(",");	//�޸� ������ ����.
			//A005930 �Ｚ���� �ֽ� �����ڵ�
			//&&k41_field[1].contains("2015") 3�� ����
			if(k41_field.length>2&&k41_field[1].equals("20130711")) {
				//��¥�� 20130711�� ��ġ�ϴ� �͸� �����ϱ�
				k41_s.append(k41_field[0]);	// ù��° �׸� �߰��ϱ�.
				for(int k41_j = 1; k41_j < k41_field.length; k41_j++) {
				//�� �ڷ� �޸��� �߰��� ä��, �ݺ��ؼ� ���� �߰����ִµ�, ^�� �����ϰ� ���� ���� �����Ѵ�.
					k41_s.append(","+k41_field[k41_j]);
				}
				k41_bw1.write(k41_s.toString());
				k41_bw1.newLine();	//�ٹٲ�
				k41_wcnt++;		//�� �׸� ī��Ʈ
				
			}
			k41_cnt++;	//�� ����� ī��Ʈ.
		}
		k41_br.close();
		k41_bw1.close();
		
		k41_endTime =System.currentTimeMillis();	//���� �ð� üũ�� ���� ��.
		k41_startTimeStr=time.format(new Date(k41_startTime));	//���� ���� �������� �ٲٱ�.
		k41_endTimeStr = time.format(new Date(k41_endTime));	//���� ���� �������� �ٲٱ�.
		System.out.println("���۽� �ð��� " + k41_startTimeStr + "�Դϴ�.");
		System.out.println("����� �ð��� " + k41_endTimeStr + "�Դϴ�.");
		System.out.printf("�ð��� ���̴� ��%.1f���Դϴ�.\n",(k41_endTime-k41_startTime)/1000.0);
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
		
		
	}
}

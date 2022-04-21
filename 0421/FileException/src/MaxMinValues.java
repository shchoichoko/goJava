import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import javax.xml.crypto.Data;

public class MaxMinValues {

	public static void main(String[] args) throws IOException {
		// #8 2015�� ���� ���� �ִ� �ּҰ� ���ϱ�  22.04.21 
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###,###");
		// �޸���� 
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\2015_SamSung.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// ������ �о��� ���۸��� ��ü�� ����.
		SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		//���� �ð� ���� �ۼ�.
		String k41_readtxt;String k41_startTimeStr;String k41_endTimeStr;
		//���پ� �б����� ���ڿ� ����. ���� �� ����ð� ������ ���� ���ڿ�. ���� �� ���� �ð� ������ ���� ���ڿ�.
		long k41_startTime; long k41_endTime;
		//���� �ð�, �� �ð� ������ ���� ����.

		k41_startTime =System.currentTimeMillis();
		if((k41_readtxt = k41_br.readLine())==null) {	//���پ� ���� ���� null���̶�� �������̶�� �����
			System.out.println("�� �����Դϴ�.");
			return;
		}
		int k41_cnt = 0;
		String[] k41_field_name = k41_readtxt.split(",");
		double k41_maxVal = 0; double k41_minVal = 1600000;
		
		while((k41_readtxt = k41_br.readLine())!=null) {	//���پ� ���� ���� null���� �ƴҶ� �ݺ�
			String[] k41_field = k41_readtxt.split(",");	//�� �������� ���� ���ڿ��� �ʵ忡 ��������.
			if(k41_maxVal<Double.parseDouble(k41_field[3])) {
				k41_maxVal = Double.parseDouble(k41_field[3]);
			}
			
			if(k41_minVal>Double.parseDouble(k41_field[3])) {
				k41_minVal = Double.parseDouble(k41_field[3]);
			}
			k41_cnt++;
		}
		
		k41_br.close();
		System.out.printf(" �ִ밪 : %s��\n", k41_df.format(k41_maxVal));
		System.out.printf(" �ּҰ� : %s��\n", k41_df.format(k41_minVal));
		k41_endTime =System.currentTimeMillis();
		k41_startTimeStr=time.format(new Date(k41_startTime));
		k41_endTimeStr = time.format(new Date(k41_endTime));
		System.out.println("���۽� �ð��� " + k41_startTimeStr + "�Դϴ�.");
		System.out.println("����� �ð��� " + k41_endTimeStr + "�Դϴ�.");
		System.out.printf("�ð��� ���̴� %d ���Դϴ�.\n",(k41_endTime-k41_startTime)/1000);
		
	}

}

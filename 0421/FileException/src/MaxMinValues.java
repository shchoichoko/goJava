import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class MaxMinValues {

	public static void main(String[] args) throws IOException {
		// #8 2015�� ���� ���� �ִ� �ּҰ� ���ϱ�  22.04.21 
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###,###");
		// �޸���� 
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\2015_SamSung.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// ������ �о��� ���۸��� ��ü�� ����.
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		//���� �ð� ���� �ۼ�.
		String k41_readtxt;String k41_startTimeStr;String k41_endTimeStr;
		//���پ� �б����� ���ڿ� ����. ���� �� ����ð� ������ ���� ���ڿ�. ���� �� ���� �ð� ������ ���� ���ڿ�.
		long k41_startTime; long k41_endTime;
		//���� �ð�, �� �ð� ������ ���� ����.
		List<String> dateList = new ArrayList<String>();	
		//��¥ üũ�� ���� ����Ʈ ����.
		k41_startTime =System.currentTimeMillis();//���� �ð� üũ�� ���� ��.
		if((k41_readtxt = k41_br.readLine())==null) {	//���پ� ���� ���� null���̶�� �������̶�� �����
			System.out.println("�� �����Դϴ�.");
			return;
		}
		int k41_cnt = 0; 
		int k41_LineCnt = 1;	// ���� ���°�� ���� �ִ��� Ȯ���� ������ ���� ����
		int k41_maxPointer = 0;		// �ִ밪�� ��ġ�� ���� ���� ����
		int k41_minPointer = 0;		// �ּҰ��� ��ġ�� ���� ���� ����
		String[] k41_field_name = k41_readtxt.split(",");	//�޸� �������� ���� ���ڿ��� �ʵ忡 ��������.
		double k41_maxVal = 0; double k41_minVal = 0;
		// �ִ� �ּҸ� ���ϱ� ���� ���� ���� �� �� �ʱ�ȭ
		while((k41_readtxt = k41_br.readLine())!=null) {	//���پ� ���� ���� null���� �ƴҶ� �ݺ�
			String[] k41_field = k41_readtxt.split(",");	//�޸� �������� ���� ���ڿ��� �ʵ忡 ��������.
			
			dateList.add(k41_field[1]);//��¥�� ��� �Է��Ѵ�.
			
			if(k41_LineCnt == 1) {	// ���� ���� ó���϶�
				k41_maxVal = Double.parseDouble(k41_field[3]);	// �ش簪�� �ִ밪 ������ �ֱ�
				k41_minVal = Double.parseDouble(k41_field[3]);	// �ش� ���� �ּҰ� ������ �ֱ�
				k41_maxPointer = k41_LineCnt;	// �ִ밪�� ��ȣ �ֱ�
				k41_minPointer = k41_LineCnt;	// �ּҰ��� ��ȣ �ֱ�
				
			} else {
				if(Double.parseDouble(k41_field[3]) > k41_maxVal) {
					k41_maxVal = Double.parseDouble(k41_field[3]);	// �ִ밪�� �����Ѵ�.
					k41_maxPointer = k41_LineCnt;	//�ִ밪�� ��ġ�� �����Ѵ�.
				}
				if(k41_minVal > Double.parseDouble(k41_field[3])) {
					k41_minVal = Double.parseDouble(k41_field[3]);	//�ּҰ��� �����Ѵ�.
					k41_minPointer = k41_LineCnt;	// �ּҰ��� ��ġ�� �����Ѵ�.
				}
			}
			k41_LineCnt++;	// ���� ī��Ʈ
		}
		
		//Double.parseDouble(k41_field[3])
		k41_br.close();
		System.out.printf("�ִ밪(��������) : %s��\n", k41_df.format(k41_maxVal));
		System.out.printf("�ش� ��¥ : %s\n",dateList.get(k41_maxPointer-1));
		System.out.printf("�ּҰ�(��������) : %s��\n", k41_df.format(k41_minVal));
		System.out.printf("�ش� ��¥ : %s\n",dateList.get(k41_minPointer-1));
		k41_endTime =System.currentTimeMillis();	//���� �ð� üũ�� ���� ��.
		k41_startTimeStr=time.format(new Date(k41_startTime));	//���� ���� �������� �ٲٱ�.
		k41_endTimeStr = time.format(new Date(k41_endTime));	//���� ���� �������� �ٲٱ�.
		System.out.println("���۽� �ð��� " + k41_startTimeStr + "�Դϴ�.");
		System.out.println("����� �ð��� " + k41_endTimeStr + "�Դϴ�.");
		System.out.printf("�ð��� ���̴� %d ���Դϴ�.\n",(k41_endTime-k41_startTime)/1000);
		System.out.printf("Program End[%d]records\n", k41_cnt);
	}

}

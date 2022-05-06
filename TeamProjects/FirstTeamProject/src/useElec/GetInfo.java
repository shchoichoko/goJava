package useElec;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetInfo {

	public static void main(String[] args) throws IOException {
		// #7 �Ｚ���� �� �����Ͽ� ���� �����ϱ�  22.04.21 
		
		File k41_f = new File("C:\\Users\\������\\Desktop\\SooHyeok\\ProjectData\\�ñ����� ���»�뷮(2010��).txt");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//������ �б� ���� BufferedReader�� ��ü ����.
		File k41_f1 = new File("C:\\Users\\������\\Desktop\\SooHyeok\\ProjectData\\2010�ñ�����_���»��_�հ�.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//���� �ۼ��� ���� BufferedWriter ��ü�� ����.
		String k41_readtxt;
		//���پ� �б����� ���ڿ� ����. 
		int k41_cnt = 0; int k41_wcnt = 0;
		DecimalFormat formatCom = new DecimalFormat("###,###,###,###");
		
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			StringBuffer k41_s = new StringBuffer();	//��Ʈ�� ���� k41_s�� ����.
			String[] k41_field = k41_readtxt.split("\t");	//tab ������ ����.
			int sum = 0;
			//ù�� ��¿�
			if((k41_field.length>1&&k41_field[3].equals("������"))) {
				for(int k41_j = 0; k41_j < 5; k41_j++) {
					if(k41_j==4) {
						k41_field[k41_j]=k41_field[k41_j].trim();
						k41_field[k41_j]=k41_field[k41_j].replace("1��", "�հ�");
						k41_s.append(k41_field[k41_j]);
						break;
					}

					k41_s.append(k41_field[k41_j]+",");
				}
				k41_bw1.write(k41_s.toString());
				k41_bw1.newLine();
			}
			if((k41_field.length>1&&k41_field[3].equals("�հ�"))) {
				//�հ踸 ����
				for(int k = 4; k < 16; k++) {
					k41_field[k] = k41_field[k].trim();
					k41_field[k] = k41_field[k].replace(",", "");
				//	sum += (Integer.parseInt(k41_field[k]));
				}
				for(int k41_j = 0; k41_j < 4; k41_j++) {
					String fieldSum = formatCom.format(sum);
					if(k41_j==4) {
						k41_s.append(fieldSum);
						break;
					}
					k41_s.append(k41_field[k41_j]+",");
				}
				k41_bw1.write(k41_s.toString());
				k41_bw1.newLine();	//�ٹٲ�
				k41_wcnt++;		//�� �׸� ī��Ʈ
				
			}
			k41_cnt++;	//�� ����� ī��Ʈ.
		}
		k41_br.close();
		k41_bw1.close();
		
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
		
		
	}
}

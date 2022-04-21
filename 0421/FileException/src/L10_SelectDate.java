import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class L10_SelectDate {

	public static void main(String[] args) throws IOException {
		// #7 Ư�� ��¥ �����ؼ� ��� ���� ���� �����ϱ�  22.04.21 
		
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\StockDailyPrice.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));

		File k41_f1 = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\2015's_Stock3.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		FileWriter k41_fw;
		
		//������ �ۼ����� ��ü�� �����.
		k41_fw = new FileWriter(k41_f1);
		//write()�� ���ϴ� ���ڿ��� �ۼ��Ѵ�.

		//�ش� ��ü�� ��� �Ϸ� �� �ݾ��ش�.
		k41_fw.close();
		//{"�����ڵ�", "��������", "���������ڵ�","����","�ð�","�ְ�","������","���ϴ�� ��ȣ","���� ��� ","���� �����","���� �ŷ���"};
		getTime();
		String k41_readtxt;
	
		int k41_cnt = 0; int k41_wcnt = 0;
		while((k41_readtxt = k41_br.readLine())!=null) {
			StringBuffer k41_s = new StringBuffer();
			String[] k41_field = k41_readtxt.split(",");
			
			//20151119 ������ ��¥
			if(k41_field.length>2&&k41_field[1].contains("2015")) {
				k41_s.append(k41_field[0]);
				for(int k41_j = 1; k41_j < 11; k41_j++) {
					k41_s.append(","+k41_field[k41_j]);
				}
				k41_bw1.write(k41_s.toString());
				k41_bw1.newLine();
				k41_wcnt++;
			}
			k41_cnt++;
		}
		k41_br.close();
		k41_bw1.close();
		getTime();
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
	}
	public static void getTime() {
		Calendar k41_c = Calendar.getInstance();
		SimpleDateFormat k41_form = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(k41_form.format(k41_c.getTime()));
	}

}

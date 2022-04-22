import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class L08_page10 {

	public static void main(String[] args) throws IOException {
		// #6 ���� �����ϱ� 22.04.21 
		
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\THTSKS010H00.dat");
		//������ ����� ������ k41_f�� ����.
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//�ش� ����� ������ BufferedReader�� �б����� ��ü ����.
		File k41_f1 = new File("C:\\Users\\������\\Desktop\\����\\FileReadTest\\StockDailyPrice.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//�ش� ����� ������ BufferedWriter�� �ۼ��ϱ� ���� ��ü ����.
		
		SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		//���� �ð� ���� �ۼ�.
		String k41_readtxt, k41_startTimeStr, k41_endTimeStr;
		//���پ� �б����� ���ڿ� ����. 
		//���� �� ����ð� ������ ���� ���ڿ�. 
		//���� �� ���� �ð� ������ ���� ���ڿ�.
		long k41_startTime; long k41_endTime;
		//���� �ð�, �� �ð� ������ ���� ����.
		
		int k41_cnt = 0; int k41_wcnt = 0;	//���� ī��Ʈ�� ���� ������
		
		k41_startTime =System.currentTimeMillis();	//���� �ð� üũ�� ���� ��.
		
		while((k41_readtxt = k41_br.readLine())!=null) {//���� �� ������ �ݺ��� ����.
			StringBuffer k41_s = new StringBuffer();
			//��Ʈ�� ���� k41_s�� ����.
			String[] k41_field = k41_readtxt.split("%_%");	//%_%�� �����ؼ� �迭�� �ֱ�.
			// ���̰� 2���� �۰�, ���� �����ȣ ���� ^�� ���� �����ϰ�, ù���ڰ� "A"�� ���ǹ��� �����Ҷ�,
			if(k41_field.length>2&&k41_field[2].replace("^","").trim().substring(0,1).equals("A")) {
				//0��° ���ڿ��� ^�� �����ϰ�, ������ �����ؼ� �ֱ�.
				k41_s.append(k41_field[0].replace("^", "").trim());
				//�� �ڷ� �޸��� �߰��� ä��, �ݺ��ؼ� ���� �߰����ִµ�, ^�� �����ϰ� ���� ���� �����Ѵ�.
				for(int k41_j = 1; k41_j < k41_field.length; k41_j++) {
					k41_s.append(","+k41_field[k41_j].replace("^","").trim());
				}
				k41_bw1.write(k41_s.toString());
				//k41_s�� ���ڿ��� �ۼ��ϰ� �ٹٲ��� ���� �� ī��Ʈ �Ѵ�.
				k41_bw1.newLine();
				k41_wcnt++; 
				
			}
			k41_cnt++; //�� ���� ī��Ʈ.
		}
		k41_br.close();	//�о��ִ� ���۸� �ݾ��ش�.
		k41_bw1.close(); // �ۼ��ϴ� ���۸� �ݾ��ش�.
		k41_endTime =System.currentTimeMillis();	//���� �ð� üũ�� ���� ��.
		k41_startTimeStr=time.format(new Date(k41_startTime));	//���� ���� �������� �ٲٱ�.
		k41_endTimeStr = time.format(new Date(k41_endTime));	//���� ���� �������� �ٲٱ�.
		System.out.println("���۽� �ð��� " + k41_startTimeStr + "�Դϴ�.");
		System.out.println("����� �ð��� " + k41_endTimeStr + "�Դϴ�.");
		System.out.printf("�ð��� ���̴� %d ���Դϴ�.\n",(k41_endTime-k41_startTime)/1000);
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
	}

}

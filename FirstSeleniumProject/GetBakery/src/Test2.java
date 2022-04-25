import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// #7 �Ｚ���� �� �����Ͽ� ���� �����ϱ�  22.04.21 
		
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\Data\\SeoulBakery2.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//������ �б� ���� BufferedReader�� ��ü ����.
		File k41_f1 = new File("C:\\Users\\������\\Desktop\\����\\\\Data\\test11.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//���� �ۼ��� ���� BufferedWriter ��ü�� ����.
		String k41_readtxt;
		
		//���پ� �б����� ���ڿ� ����. 
		int k41_cnt = 0; int k41_wcnt = 0;
		List<String> strList = new ArrayList<String>();
		int countSaltBread=0;
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			String[] k41_field = k41_readtxt.split(",");	//�޸� ������ ����
			for(int i = 0; i < k41_field.length; i++) {
				if(k41_field[i].contains("�ұݻ�")) {
				strList.add(k41_field[i]);
				countSaltBread++;
				}
			}
			//A005930 �Ｚ���� �ֽ� �����ڵ�
			//&&k41_field[1].contains("2015") 3�� ����
	/*		if(k41_field.length>2&&k41_field[1].equals("20130711")) {
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
	*/		
			
			for(int i = 0; i < strList.size(); i++) {
				keTest(strList.get(i));
				k41_bw1.write(k41_field[i]);
				k41_bw1.newLine();
			}
			
			k41_cnt++;	//�� ����� ī��Ʈ.
		}
		k41_br.close();
		k41_bw1.close();
		
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
		
		
	}
	public static void keTest(String strToExtrtKwrd)
	{
		KeywordExtractor ke = new KeywordExtractor();
		KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);
		for( int i = 0; i < kl.size(); i++ ) {
			Keyword kwrd = kl.get(i);
			System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
		}
		
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MakeKeyWords {

	public static void main(String[] args) throws IOException {
		// #7 �Ｚ���� �� �����Ͽ� ���� �����ϱ�  22.04.21 
		
		File k41_f = new File("C:\\Users\\������\\Desktop\\����\\Data\\DailyGyeongGiBakery2.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//������ �б� ���� BufferedReader�� ��ü ����.
		File k41_f1 = new File("C:\\Users\\������\\Desktop\\����\\Data\\GyeongGiKeywords.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//���� �ۼ��� ���� BufferedWriter ��ü�� ����.
		String k41_readtxt;
		
		//���پ� �б����� ���ڿ� ����. 
		List<String> strList = new ArrayList<String>();
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			String[] k41_field = k41_readtxt.split(",");	//�޸� ������ ����
			
			System.out.println(k41_field[0]);
			
			KeywordExtractor ke = new KeywordExtractor();
			KeywordList kl = ke.extractKeyword(k41_field[0], true);
			String save = "";
			for( int i = 0; i < kl.size(); i++ ) {
				Keyword kwrd = kl.get(i);
				System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
				save = kwrd.getString() + "," + kwrd.getCnt();
			}
			
			k41_bw1.write(save);
			k41_bw1.newLine();
			
		}
		k41_br.close();
		k41_bw1.close();
		
		
		
	}
	public static void keTest(String strToExtrtKwrd)
	{
		KeywordExtractor ke = new KeywordExtractor();
		KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);
		for( int i = 0; i < kl.size(); i++ ) {
			Keyword kwrd = kl.get(i);
		//	System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
		}
	}
}

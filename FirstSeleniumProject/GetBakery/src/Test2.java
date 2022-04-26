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

public class Test2 {

	public static void main(String[] args) throws IOException {
		// #7 삼성전자 만 추출하여 파일 생성하기  22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\DailySeoulBakery2.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//파일을 읽기 위한 BufferedReader를 객체 생성.
		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\\\Data\\test01.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//파일 작성을 위한 BufferedWriter 객체를 생성.
		String k41_readtxt;
		
		//한줄씩 읽기위한 문자열 생성. 
		int k41_cnt = 0; int k41_wcnt = 0;
		List<String> strList = new ArrayList<String>();
		int countSaltBread=0;
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			String[] k41_field = k41_readtxt.split(",");	//콤마 단위로 저장
			
			System.out.println(k41_field[0]);
			
			/*
			for(int i =0; i < k41_field.length; i++) {
				strList.add(k41_field[i]);
			}
			
			for(int i = 0; i < strList.size(); i++) {
				keTest(strList.get(i));
				k41_bw1.write(k41_field[0]);
				k41_bw1.newLine();
			}
			*/

			//
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
			
			//
			k41_cnt++;	//총 문장수 카운트.
		}
		k41_br.close();
		k41_bw1.close();
		
	//	System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
		
		
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

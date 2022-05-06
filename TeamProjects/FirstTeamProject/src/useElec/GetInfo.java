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
		// #7 삼성전자 만 추출하여 파일 생성하기  22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\ProjectData\\시군구별 전력사용량(2010년).txt");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//파일을 읽기 위한 BufferedReader를 객체 생성.
		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\ProjectData\\2010시군구별_전력사용_합계.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//파일 작성을 위한 BufferedWriter 객체를 생성.
		String k41_readtxt;
		//한줄씩 읽기위한 문자열 생성. 
		int k41_cnt = 0; int k41_wcnt = 0;
		DecimalFormat formatCom = new DecimalFormat("###,###,###,###");
		
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			StringBuffer k41_s = new StringBuffer();	//스트링 버퍼 k41_s을 생성.
			String[] k41_field = k41_readtxt.split("\t");	//tab 단위로 저장.
			int sum = 0;
			//첫줄 출력용
			if((k41_field.length>1&&k41_field[3].equals("업종별"))) {
				for(int k41_j = 0; k41_j < 5; k41_j++) {
					if(k41_j==4) {
						k41_field[k41_j]=k41_field[k41_j].trim();
						k41_field[k41_j]=k41_field[k41_j].replace("1월", "합계");
						k41_s.append(k41_field[k41_j]);
						break;
					}

					k41_s.append(k41_field[k41_j]+",");
				}
				k41_bw1.write(k41_s.toString());
				k41_bw1.newLine();
			}
			if((k41_field.length>1&&k41_field[3].equals("합계"))) {
				//합계만 고르기
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
				k41_bw1.newLine();	//줄바꿈
				k41_wcnt++;		//총 항목 카운트
				
			}
			k41_cnt++;	//총 문장수 카운트.
		}
		k41_br.close();
		k41_bw1.close();
		
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
		
		
	}
}

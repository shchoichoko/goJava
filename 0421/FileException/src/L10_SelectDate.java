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
		// #7 특정 날짜 지정해서 모든 종목 파일 생성하기  22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\StockDailyPrice.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));

		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\2015's_Stock3.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		FileWriter k41_fw;
		
		//파일을 작성해줄 객체를 만든다.
		k41_fw = new FileWriter(k41_f1);
		//write()로 원하는 문자열을 작성한다.

		//해당 객체를 사용 완료 후 닫아준다.
		k41_fw.close();
		//{"종목코드", "영업일자", "단축종목코드","종가","시가","최고가","최저가","전일대비 부호","전일 대비 ","전일 대비율","전일 거래량"};
		getTime();
		String k41_readtxt;
	
		int k41_cnt = 0; int k41_wcnt = 0;
		while((k41_readtxt = k41_br.readLine())!=null) {
			StringBuffer k41_s = new StringBuffer();
			String[] k41_field = k41_readtxt.split(",");
			
			//20151119 지정한 날짜
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

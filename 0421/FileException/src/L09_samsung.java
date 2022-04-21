import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class L09_samsung {

	public static void main(String[] args) throws IOException {
		// #7 삼성전자 만 추출하여 파일 생성하기  22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\StockDailyPrice.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		
		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\2015_SamSung.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		
		String k41_readtxt;
	
		int k41_cnt = 0; int k41_wcnt = 0;
		getTime();
		while((k41_readtxt = k41_br.readLine())!=null) {
			StringBuffer k41_s = new StringBuffer();
			String[] k41_field = k41_readtxt.split(",");
			//A005930 삼성전자 주식 단축코드
			//&&k41_field[1].contains("2015") 3번 문제
			if(k41_field.length>2&&k41_field[2].equals("A005930")) {
				k41_s.append(k41_field[0]);
				for(int k41_j = 1; k41_j < k41_field.length; k41_j++) {
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

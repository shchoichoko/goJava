import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import javax.xml.crypto.Data;

public class MaxMinValues {

	public static void main(String[] args) throws IOException {
		// #8 2015년 종가 기준 최대 최소값 구하기  22.04.21 
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###,###");
		// 콤마찍기 
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\2015_SamSung.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// 파일을 읽어줄 버퍼리더 객체를 생성.
		SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		//현재 시간 포맷 작성.
		String k41_readtxt;String k41_startTimeStr;String k41_endTimeStr;
		//한줄씩 읽기위한 문자열 생성. 시작 시 현재시각 저장을 위한 문자열. 종료 시 현재 시각 저장을 위한 문자열.
		long k41_startTime; long k41_endTime;
		//시작 시간, 끝 시간 저장을 위한 변수.

		k41_startTime =System.currentTimeMillis();
		if((k41_readtxt = k41_br.readLine())==null) {	//한줄씩 읽은 값이 null값이라면 빈파일이라고 출력함
			System.out.println("빈 파일입니다.");
			return;
		}
		int k41_cnt = 0;
		String[] k41_field_name = k41_readtxt.split(",");
		double k41_maxVal = 0; double k41_minVal = 1600000;
		
		while((k41_readtxt = k41_br.readLine())!=null) {	//한줄씩 읽은 값이 null값이 아닐때 반복
			String[] k41_field = k41_readtxt.split(",");	//탭 기준으로 나눈 문자열을 필드에 저장해줌.
			if(k41_maxVal<Double.parseDouble(k41_field[3])) {
				k41_maxVal = Double.parseDouble(k41_field[3]);
			}
			
			if(k41_minVal>Double.parseDouble(k41_field[3])) {
				k41_minVal = Double.parseDouble(k41_field[3]);
			}
			k41_cnt++;
		}
		
		k41_br.close();
		System.out.printf(" 최대값 : %s원\n", k41_df.format(k41_maxVal));
		System.out.printf(" 최소값 : %s원\n", k41_df.format(k41_minVal));
		k41_endTime =System.currentTimeMillis();
		k41_startTimeStr=time.format(new Date(k41_startTime));
		k41_endTimeStr = time.format(new Date(k41_endTime));
		System.out.println("시작시 시간은 " + k41_startTimeStr + "입니다.");
		System.out.println("종료시 시간은 " + k41_endTimeStr + "입니다.");
		System.out.printf("시간의 차이는 %d 초입니다.\n",(k41_endTime-k41_startTime)/1000);
		
	}

}

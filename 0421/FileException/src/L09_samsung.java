import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L09_samsung {

	public static void main(String[] args) throws IOException {
		// #7 삼성전자 만 추출하여 파일 생성하기  22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\StockDailyPrice.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//파일을 읽기 위한 BufferedReader를 객체 생성.
		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\20130711.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//파일 작성을 위한 BufferedWriter 객체를 생성.
		SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		//현재 시간 포맷 작성.
		String k41_readtxt;String k41_startTimeStr;String k41_endTimeStr;
		//한줄씩 읽기위한 문자열 생성. 시작 시 현재시각 저장을 위한 문자열.\
		// 종료 시 현재 시각 저장을 위한 문자열.
		long k41_startTime; long k41_endTime;
		//시작 시간, 끝 시간 저장을 위한 변수.
		int k41_cnt = 0; int k41_wcnt = 0;
		k41_startTime =System.currentTimeMillis();//시작 시간 체크를 위한 식.
		
		
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			StringBuffer k41_s = new StringBuffer();	//스트링 버퍼 k41_s을 생성.
			String[] k41_field = k41_readtxt.split(",");	//콤마 단위로 저장.
			//A005930 삼성전자 주식 단축코드
			//&&k41_field[1].contains("2015") 3번 문제
			if(k41_field.length>2&&k41_field[1].equals("20130711")) {
				//날짜가 20130711랑 일치하는 것만 추출하기
				k41_s.append(k41_field[0]);	// 첫번째 항목 추가하기.
				for(int k41_j = 1; k41_j < k41_field.length; k41_j++) {
				//그 뒤로 콤마를 추가한 채로, 반복해서 값을 추가해주는데, ^는 제거하고 공백 역시 제거한다.
					k41_s.append(","+k41_field[k41_j]);
				}
				k41_bw1.write(k41_s.toString());
				k41_bw1.newLine();	//줄바꿈
				k41_wcnt++;		//총 항목 카운트
				
			}
			k41_cnt++;	//총 문장수 카운트.
		}
		k41_br.close();
		k41_bw1.close();
		
		k41_endTime =System.currentTimeMillis();	//종료 시간 체크를 위한 식.
		k41_startTimeStr=time.format(new Date(k41_startTime));	//보기 좋은 포멧으로 바꾸기.
		k41_endTimeStr = time.format(new Date(k41_endTime));	//보기 좋은 포멧으로 바꾸기.
		System.out.println("시작시 시간은 " + k41_startTimeStr + "입니다.");
		System.out.println("종료시 시간은 " + k41_endTimeStr + "입니다.");
		System.out.printf("시간의 차이는 약%.1f초입니다.\n",(k41_endTime-k41_startTime)/1000.0);
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
		
		
	}
}

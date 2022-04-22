import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class MaxMinValues {

	public static void main(String[] args) throws IOException {
		// #8 2015년 종가 기준 최대 최소값 구하기  22.04.21 
		DecimalFormat k41_df = new DecimalFormat("###,###,###,###,###,###");
		// 콤마찍기 
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\2015_SamSung.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// 파일을 읽어줄 버퍼리더 객체를 생성.
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		//현재 시간 포맷 작성.
		String k41_readtxt;String k41_startTimeStr;String k41_endTimeStr;
		//한줄씩 읽기위한 문자열 생성. 시작 시 현재시각 저장을 위한 문자열. 종료 시 현재 시각 저장을 위한 문자열.
		long k41_startTime; long k41_endTime;
		//시작 시간, 끝 시간 저장을 위한 변수.
		List<String> dateList = new ArrayList<String>();	
		//날짜 체크를 위한 리스트 생성.
		k41_startTime =System.currentTimeMillis();//시작 시간 체크를 위한 식.
		if((k41_readtxt = k41_br.readLine())==null) {	//한줄씩 읽은 값이 null값이라면 빈파일이라고 출력함
			System.out.println("빈 파일입니다.");
			return;
		}
		int k41_cnt = 0; 
		int k41_LineCnt = 1;	// 현재 몇번째를 돌고 있는지 확인할 정수형 변수 선언
		int k41_maxPointer = 0;		// 최대값의 위치를 담을 변수 선언
		int k41_minPointer = 0;		// 최소값의 위치를 담을 변수 선언
		String[] k41_field_name = k41_readtxt.split(",");	//콤마 기준으로 나눈 문자열을 필드에 저장해줌.
		double k41_maxVal = 0; double k41_minVal = 0;
		// 최대 최소를 구하기 위해 변수 선언 및 값 초기화
		while((k41_readtxt = k41_br.readLine())!=null) {	//한줄씩 읽은 값이 null값이 아닐때 반복
			String[] k41_field = k41_readtxt.split(",");	//콤마 기준으로 나눈 문자열을 필드에 저장해줌.
			
			dateList.add(k41_field[1]);//날짜를 계속 입력한다.
			
			if(k41_LineCnt == 1) {	// 지금 값이 처음일때
				k41_maxVal = Double.parseDouble(k41_field[3]);	// 해당값을 최대값 변수에 넣기
				k41_minVal = Double.parseDouble(k41_field[3]);	// 해당 값을 최소값 변수에 넣기
				k41_maxPointer = k41_LineCnt;	// 최대값의 번호 넣기
				k41_minPointer = k41_LineCnt;	// 최소값의 번호 넣기
				
			} else {
				if(Double.parseDouble(k41_field[3]) > k41_maxVal) {
					k41_maxVal = Double.parseDouble(k41_field[3]);	// 최대값을 갱신한다.
					k41_maxPointer = k41_LineCnt;	//최대값의 위치를 갱신한다.
				}
				if(k41_minVal > Double.parseDouble(k41_field[3])) {
					k41_minVal = Double.parseDouble(k41_field[3]);	//최소값을 갱신한다.
					k41_minPointer = k41_LineCnt;	// 최소값의 위치를 갱신한다.
				}
			}
			k41_LineCnt++;	// 한줄 카운트
		}
		
		//Double.parseDouble(k41_field[3])
		k41_br.close();
		System.out.printf("최대값(종가기준) : %s원\n", k41_df.format(k41_maxVal));
		System.out.printf("해당 날짜 : %s\n",dateList.get(k41_maxPointer-1));
		System.out.printf("최소값(종가기준) : %s원\n", k41_df.format(k41_minVal));
		System.out.printf("해당 날짜 : %s\n",dateList.get(k41_minPointer-1));
		k41_endTime =System.currentTimeMillis();	//종료 시간 체크를 위한 식.
		k41_startTimeStr=time.format(new Date(k41_startTime));	//보기 좋은 포멧으로 바꾸기.
		k41_endTimeStr = time.format(new Date(k41_endTime));	//보기 좋은 포멧으로 바꾸기.
		System.out.println("시작시 시간은 " + k41_startTimeStr + "입니다.");
		System.out.println("종료시 시간은 " + k41_endTimeStr + "입니다.");
		System.out.printf("시간의 차이는 %d 초입니다.\n",(k41_endTime-k41_startTime)/1000);
		System.out.printf("Program End[%d]records\n", k41_cnt);
	}

}

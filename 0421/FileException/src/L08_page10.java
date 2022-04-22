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
		// #6 파일 정제하기 22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\THTSKS010H00.dat");
		//지정된 경로의 파일을 k41_f로 선언.
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//해당 경로의 파일을 BufferedReader로 읽기위해 객체 생성.
		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\StockDailyPrice.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//해당 경로의 파일을 BufferedWriter로 작성하기 위해 객체 생성.
		
		SimpleDateFormat time = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		//현재 시간 포맷 작성.
		String k41_readtxt, k41_startTimeStr, k41_endTimeStr;
		//한줄씩 읽기위한 문자열 생성. 
		//시작 시 현재시각 저장을 위한 문자열. 
		//종료 시 현재 시각 저장을 위한 문자열.
		long k41_startTime; long k41_endTime;
		//시작 시간, 끝 시간 저장을 위한 변수.
		
		int k41_cnt = 0; int k41_wcnt = 0;	//개수 카운트를 위한 변수들
		
		k41_startTime =System.currentTimeMillis();	//시작 시간 체크를 위한 식.
		
		while((k41_readtxt = k41_br.readLine())!=null) {//읽을 게 없으면 반복문 종료.
			StringBuffer k41_s = new StringBuffer();
			//스트링 버퍼 k41_s를 선언.
			String[] k41_field = k41_readtxt.split("%_%");	//%_%로 구분해서 배열에 넣기.
			// 길이가 2보다 작고, 단축 종목번호 에서 ^와 공백 제거하고, 첫글자가 "A"인 조건문을 만족할때,
			if(k41_field.length>2&&k41_field[2].replace("^","").trim().substring(0,1).equals("A")) {
				//0번째 문자에서 ^를 제거하고, 공백을 제거해서 넣기.
				k41_s.append(k41_field[0].replace("^", "").trim());
				//그 뒤로 콤마를 추가한 채로, 반복해서 값을 추가해주는데, ^는 제거하고 공백 역시 제거한다.
				for(int k41_j = 1; k41_j < k41_field.length; k41_j++) {
					k41_s.append(","+k41_field[k41_j].replace("^","").trim());
				}
				k41_bw1.write(k41_s.toString());
				//k41_s를 문자열로 작성하고 줄바꿈을 실행 후 카운트 한다.
				k41_bw1.newLine();
				k41_wcnt++; 
				
			}
			k41_cnt++; //총 개수 카운트.
		}
		k41_br.close();	//읽어주는 버퍼를 닫아준다.
		k41_bw1.close(); // 작성하는 버퍼를 닫아준다.
		k41_endTime =System.currentTimeMillis();	//종료 시간 체크를 위한 식.
		k41_startTimeStr=time.format(new Date(k41_startTime));	//보기 좋은 포멧으로 바꾸기.
		k41_endTimeStr = time.format(new Date(k41_endTime));	//보기 좋은 포멧으로 바꾸기.
		System.out.println("시작시 시간은 " + k41_startTimeStr + "입니다.");
		System.out.println("종료시 시간은 " + k41_endTimeStr + "입니다.");
		System.out.printf("시간의 차이는 %d 초입니다.\n",(k41_endTime-k41_startTime)/1000);
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
	}

}

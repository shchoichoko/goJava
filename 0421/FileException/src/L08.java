import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class L08 {

	public static void main(String[] args) throws IOException {
		// #6 파일 정제하기 22.04.21 
		
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\THTSKS010H00.dat");
		//지정된 경로의 파일을 k41_f로 선언.
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		//해당 경로의 파일을 BufferedReader로 읽기위해 객체 생성.
		File k41_f1 = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\StockDailyPrice.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		//해당 경로의 파일을 BufferedWriter로 작성하기 위해 객체 생성.
		
		String k41_readtxt;	//문자열 변수 선언.
		
		
		int k41_cnt = 0; int k41_wcnt = 0;
		while((k41_readtxt = k41_br.readLine())!=null) {
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
		
		System.out.printf("Program End[%d][%d]records\n", k41_cnt, k41_wcnt);
	}

}

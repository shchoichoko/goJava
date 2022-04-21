import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lec02 {

	public static void main(String[] args) throws IOException {
		// #4 거리계산 22.04.21 최수혁
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\12_04_07_E_무료와이파이정보_경기도_탭.txt");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// 파일을 읽어줄 버퍼리더 객체를 생성.
		String k41_readtxt;
		List list = new ArrayList<>();
		if((k41_readtxt = k41_br.readLine())==null) {	//한줄씩 읽은 값이 null값이라면 빈파일이라고 출력함
			System.out.println("빈 파일입니다.");
			return;
		}
		String[] k41_field_name = k41_readtxt.split("\t");
		double k41_lat = 37.3860521;	// 분당융합기술 위도
		double k41_lng = 127.1214038;	// 분당융합기술	경도
		int k41_lineCnt = 0;
		double k41_maxVal = 0; double k41_minVal = 160000000;
		while((k41_readtxt = k41_br.readLine())!=null) {	//한줄씩 읽은 값이 null값이 아닐때 반복
			String[] k41_field = k41_readtxt.replace("\n", " ").split("\t");	//탭 기준으로 나눈 문자열을 필드에 저장해줌.


			System.out.printf("**[%d번째 항목]***************\n",k41_lineCnt+2);	// 몇 번째 항목인지 알려줌.
			System.out.printf(" %s : %s\n", k41_field_name[9], k41_field[9]);	// 도로명 주소 출력
			System.out.printf(" %s : %s\n", k41_field_name[12], k41_field[12]);	// 전화번호 출력
			System.out.printf(" %s : %s\n", k41_field_name[13], k41_field[13]);	// 위도 출력
			System.out.printf(" %s : %s\n", k41_field_name[14], k41_field[14]);	// 경도 출력
			double k41_dist = Math.sqrt(Math.pow(Double.parseDouble(k41_field[13])-k41_lat,2)+
					Math.pow(Double.parseDouble(k41_field[14])-k41_lng, 2)); //거리를 구한다. 피타고라스 정리. 
			
			if(k41_maxVal<k41_dist) {
				k41_maxVal = k41_dist;
			}
			
			if(k41_minVal>k41_dist) {
				k41_minVal = k41_dist;
			}
			
			System.out.printf(" 현재지점과 거리 : 약 %.3f km\n", k41_dist*100);
			System.out.printf("*******************************\n");
			k41_lineCnt++;
			
		}
		System.out.printf("최대거리!!!! : %.3f\n", k41_maxVal*100);
		System.out.printf("최소거리@@@@ : %.3f\n",k41_minVal*100);
		
		k41_br.close();
	}


}

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
		
		// 지정한 위치에 있는 파일을 선택하여 File 선언		
		File k41_f = new File("D:\\DEV\\FileReadTest\\12_04_07_E_무료와이파이정보_경기도_탭.txt");
		// 위에서 선언한 File을 BufferedReader로 읽으려고 선언
		BufferedReader k41_br = new BufferedReader (new FileReader(k41_f));
		// 텍스트를 바꿔가면서 담을 문자열 변수 선언
		String k41_readtxt;
		// 첫 출을 readtxt에 입력하고 만약 빈값이여서 null이 나오면 빈파일 메세지 출력
		if((k41_readtxt = k41_br.readLine()) == null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		// field_name 문자열 배열에 첫줄을 탭 단위로 잘라서 입력한다.
		String[] k41_field_name = k41_readtxt.split("\t");
		
		// 폴리텍대학 위도 경도
		double k41_lat = 37.3860521;
		double k41_lng = 127.1214038;
		
		int k41_k41_LineCnt = 1;	// 현재 몇번째를 돌고 있는지 확인할 정수형 변수 선언
		int k41_maxPointer = 0;	// 최대값의 위치를 담을 변수 선언
		int k41_minPointer = 0;	// 최소값의 위치를 담을 변수 선언
		double k41_distMax = 0.0;	// 최대거리를 구할 변수 선언
		double k41_distMin = 0.0;	// 최소거리를 구할 변수 선언
		
		while((k41_readtxt = k41_br.readLine()) != null) { 	// 값이 없을때까지 도는 while문 작성
			
			String [] k41_field = k41_readtxt.split("\t");	// 다음 내용을 탭 단위로 잘라서 field 배열에 넣는다.
			System.out.printf("**[%d번째 항목]***********************\n",k41_k41_LineCnt);	// 지금 몇번째 항목인지 출력한다.
			System.out.printf(" %s : %s\n", k41_field_name[10], k41_field[10]);	//소재지지번주소의 항목과 내용을 출력한다.
			System.out.printf(" %s : %s\n", k41_field_name[13], k41_field[13]);	//위도를 출력한다.
			System.out.printf(" %s : %s\n", k41_field_name[14], k41_field[14]);	//경도를 출력한다.

			// 거리 계산 (피타고라스 정리) sqrt(제곱근), pow(제곱), field의 값을 더블형으로 바꿔서 폴리텍 대학의 좌표와 거리계산
			double k41_dist = Math.sqrt(Math.pow(Double.parseDouble(k41_field[13]) - k41_lat,2)
					+ Math.pow(Double.parseDouble(k41_field[14]) -k41_lng, 2));
			// 위에서 계산한 거리 출력
			System.out.printf(" 현재지점과 거리 : %f\n", k41_dist);
			System.out.println("************************************");
			// 최대 최소 구하는 if문 선언
			if(k41_k41_LineCnt == 1) {	// 지금 값이 처음일때
				k41_distMax = k41_dist;	// 해당값을 최대값 변수에 넣기
				k41_distMin = k41_dist;	// 해당 값을 최소값 변수에 넣기
				k41_maxPointer = k41_k41_LineCnt;	// 최대값의 번호 넣기
				k41_minPointer = k41_k41_LineCnt;	// 최소값의 번호 넣기
				
				
			} else {
				if(k41_dist > k41_distMax) {
					k41_distMax = k41_dist;	// 최대값을 갱신한다.
					k41_maxPointer = k41_k41_LineCnt;	//최대값의 위치를 갱신한다.
				}
				if(k41_distMin > k41_dist) {
					k41_distMin = k41_dist;	//최소값을 갱신한다.
					k41_minPointer = k41_k41_LineCnt;	// 최소값의 위치를 갱신한다.
				}
			}
			
			k41_k41_LineCnt++;	// 한줄 더 더하기
		}
		// 최대거리 , 최소거리 와 각 몇번째 줄인지 출력한다.
		System.out.printf("[%d번째 항목] 최대거리 : %5.3f KM\n", k41_maxPointer, k41_distMax*100);
		System.out.printf("[%d번째 항목] 최소거리 : %5.3f KM\n", k41_minPointer, k41_distMin*100);		
		// BufferedReader 닫기
		k41_br.close();
	}


}

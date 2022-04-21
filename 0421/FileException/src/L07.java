import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L07 {

	public static void main(String[] args) throws IOException {
		// #5 파일 훑어보고 감잡기 22.04.21 
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\THTSKS010H00.dat");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// 지정된 경로의 파일을 읽어주는 객체 생성
		int k41_lineCnt = 0;
		// 줄을 셀때 사용될 변수.
		int k41_n = -1;
		StringBuffer k41_s = new StringBuffer();
		while(true) {
			char[] k41_ch = new char[1000];	//문자열 크기 1000 선언.
			k41_n = k41_br.read(k41_ch);
			if(k41_n==-1) {	//read는 스트림의 마지막에 도달하면 -1을 내보내기 때문에 break를 통해 반복문을 빠져나간다.
				break;
			}
			for( char k41_c : k41_ch) {
				if(k41_c == '\n') {
					System.out.printf("[%s]***\n",k41_s.toString());
					k41_s.delete(0, k41_s.length());
				} else {
					k41_s.append(k41_c);
				}
			}
			k41_lineCnt++;
		}
		
		System.out.printf("[%s]***\n", k41_s.toString());
		k41_br.close();
	}

}

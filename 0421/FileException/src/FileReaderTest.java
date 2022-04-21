import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// #1 File Reader 22.04.21 최수혁
		try {
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\mytest.txt");
		// 파일을 위의 경로에 맞춰서 mytext.txt를 만들어준다.
		FileWriter k41_fw;
		//파일을 작성해줄 객체를 만든다.
		k41_fw = new FileWriter(k41_f);
		//write()로 원하는 문자열을 작성한다.
		k41_fw.write("안녕 파일\n");
		k41_fw.write("hello 헬로\n");
		//해당 객체를 사용 완료 후 닫아준다.
		k41_fw.close();
		FileReader k41_fr = new FileReader(k41_f);
		// 파일을 읽어주는 객체를 만든다.
		int k41_n = -1;
		char[] k41_ch;
		
		while (true) {
			k41_ch = new char[100];	// 최대 100자 까지 읽는다.
			k41_n = k41_fr.read(k41_ch);
			if (k41_n == -1)	//k41_fr.read(k41_ch)의 값이 -1일때 반복문에서 벗어난다.
				//read() 메소드는 스트림의 끝에서 항상 -1을 반환함.
				break;
			
			
			for (int k41_i = 0; k41_i < k41_n; k41_i++) {
				System.out.printf("%c", k41_ch[k41_i]);
				//문자를 반복해서 출력하는 식.
			}
		}
		k41_fr.close();	// 파일 리더를 닫아준다.
		System.out.printf("\n FILE READ END");
		}catch(Exception k41_e) {	//예외 처리 될경우 아래 문장 수행.
			System.out.printf("나 에러[%s]\n",k41_e);
		}
		
		
		
	}

}

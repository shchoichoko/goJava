import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWrite {

	public static void FileWrite() throws IOException{
		// #2 File Reader 22.04.21 최수혁
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\mytest2.txt");
		//경로에서 파일을 지정한다. 작성을 위한 경로 찾기
		BufferedWriter k41_bw = new BufferedWriter(new FileWriter(k41_f));
		// 작성을 위한 객체 만들기.
		k41_bw.write("안녕파일");	//BufferedWriter로 작성하기
		k41_bw.newLine();	//한줄 띄우기.
		k41_bw.write("hello 헬로");	//BufferedWriter로 작성하기
		k41_bw.newLine();	//한줄 띄우기.
		
		k41_bw.close();
		// 작성 완료 후 닫아준다.
		
	}

	public static void FileRead() throws IOException{
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\mytest2.txt");
		//경로에서 파일을 지정한다. 읽기 위한 경로 찾기.
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));	
		//읽기를 위한 객체 만들기.
		String k41_readtxt;	//문자열 저장을 위해 선언.
		while((k41_readtxt = k41_br.readLine())!=null) {	//읽은 값이 null이 아닐때 반복한다.
			System.out.printf("%s\n", k41_readtxt);	//문자열 형태로 출력한다.
		}
		k41_br.close();
		// 읽기 완료 후 닫아준다.
	}
	
	
	public static void main(String[] args) throws IOException {
		FileWrite();	//작성하는 함수
		FileRead();		//읽는 함수.
	}

}

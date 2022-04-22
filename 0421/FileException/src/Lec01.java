import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lec01 {

	public static void main(String[] args) throws IOException {
		// #3 실제파일에 응용 22.04.21 최수혁
		
		File k41_f = new File
				("C:\\Users\\폴리텍\\Desktop\\수혁\\FileReadTest\\12_04_07_E_무료와이파이정보_경기도.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));
		// 파일을 읽기 위한 BufferedReader객체 생성.
		String k41_readtxt;	// 비어있는지 확인을 위한 문자열 변수 선언.
		if((k41_readtxt = k41_br.readLine()) ==null) {	
			//csv파일을 읽었을때 null이 읽힌다면 빈 파일이라는 문장 출력.
			System.out.println("빈 파일입니다.");
			return;
		}
		String[] k41_field_name = k41_readtxt.split(",");	
		//split(",")으로 콤마 기준으로 배열에 저장. fieldname은 보통 항목을 뜻함.
		int k41_lineCnt = 0;
		while((k41_readtxt = k41_br.readLine())!=null) {	
			//읽은 값이 null이 아닐때 계속 반복한다.
			
			String[] k41_field = k41_readtxt.split(",");	
			//split(",")으로 콤마 기준으로 배열에 저장.
			System.out.printf("**[%d번째 항목]***********\n",k41_lineCnt+1);
			for(int k41_j = 0; k41_j < k41_field_name.length; k41_j++) {	
				//k41_field_name 배열의 길이만큼 반복.
				System.out.printf(" %s : %s\n", k41_field_name[k41_j],k41_field[k41_j]);	
			}
			System.out.printf("********************************\n");
			if(k41_lineCnt == 100)break;	//최대 출력 숫자를 정해줌.
			k41_lineCnt++;	//몇 번째 항목인지 표기해주기 위해서 1씩 더해줌.
			
		}
		//읽어주는 객체 닫아주기.
		k41_br.close();
	}

}

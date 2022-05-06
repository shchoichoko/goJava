package AboutArray;

import java.util.ArrayList;

public class ReportSheet_31page {

static ArrayList<OneRec_31p> k41_ArrayOncRec = new ArrayList <OneRec_31p>();
	
	static int k41_sumKor = 0;	//정수형 변수, 국어성적
	static int k41_sumEng = 0;	//정수형 변수, 영어성적
	static int k41_sumMat = 0;	//정수형 변수, 수학성적
	static int k41_sumSum = 0;	//정수형 변수, 성적합
	static int k41_sumAve = 0;	//정수형 변수, 성적평균
	static final int k41_iPerson = 20;	//학생수 입력
	
	public static void main(String[] args) {
		k41_dataSet();	//데이터 설정 메소드
		k41_HeaderPrint();	//머릿글 출력 메소드
		// 선언한 어레이 리스트의 크기만큼 도는 for문 작성
		for(int k41_i = 0; k41_i < k41_ArrayOncRec.size(); k41_i++) {
			k41_ItemPrint(k41_i);	//한 학생의 성적을 출력하는 메소드 실행
		}
		k41_TailPrint();	// 마지막 줄 출력 메소드
	}

	public static void k41_dataSet() {	//데이터를 설정하는 메소드
		for(int i = 1; i <= k41_iPerson; i++) {	// 1부터 총 학생수 만큼 반복하는 for문 작성
			String k41_name = String.format("홍길%02d", i);	// 학생의 이름 입력
			int k41_kor = (int)(Math.random()*100);	//학생의 성적 입력, 국어, 0부터 99까지 생성하는 랜덤함수
			int k41_eng = (int)(Math.random()*100);	//학생의 성적 입력, 영어, 0부터 99까지 생성하는 랜덤함수
			int k41_mat = (int)(Math.random()*100);	//학생의 성적 입력, 수학, 0부터 99까지 생성하는 랜덤함수
			k41_ArrayOncRec.add(new OneRec_31p(i, k41_name, k41_kor, k41_eng, k41_mat));	
			//입력한 성적을 어레이 리스트에 새클래스 형태로 추가한다.
		}
	}
	
	public static void k41_HeaderPrint() {	// 머리단 출력 메소드
		System.out.println("*************************************");
		System.out.printf("%2s %2s  %2s %2s %2s  %2s  %2s\n","번호","이름",
				"국어","영어","수학","합계","평균");
		System.out.println("*************************************");
	}
	
	public static void k41_ItemPrint(int i) {	//한 학생의 성적을 출력하는 메소드
		OneRec_31p k41_rec;	//클래스 선언
		
		k41_rec = k41_ArrayOncRec.get(i);	//클래스 리스트중 i번째 클래스를 가겨온다.
		// 각가, 학생 id, 이름, 국어성적, 영어성적, 수학성정, 합계, 성적평균을 출력한다.
		System.out.printf("%2d %4s %4d %4d %4d   %3d %6.2f\n", k41_rec.getStudentId(), 
				k41_rec.getName(), k41_rec.getKor(),
				k41_rec.getEng(), k41_rec.getMat(), k41_rec.getSum(), k41_rec.getAve());
		//성적별 총합을 구하기위해 변수에 성적을 누적한다
		k41_sumKor += k41_rec.getKor();	
		k41_sumEng += k41_rec.getEng();
		k41_sumMat += k41_rec.getMat();
		k41_sumSum += k41_rec.getSum();
		k41_sumAve += k41_rec.getAve();
	}
	
	public static void k41_TailPrint() {	//마지막 성적결과 출력
		System.out.println("*************************************");
		// 국어 성적 합계, 평균을 출력한다.
		System.out.printf("국어합계  %4d    국어평균: %6.2f\n",k41_sumKor, 
				k41_sumKor/(double)k41_ArrayOncRec.size());
		// 영어 성적 합계, 평균을 출력한다.
		System.out.printf("영어합계  %4d    영어평균: %6.2f\n",k41_sumEng, 
				k41_sumEng/(double)k41_ArrayOncRec.size());
		// 수학 성적 합계, 평균을 출력한다.
		System.out.printf("수학합계  %4d    수학평균: %6.2f\n",k41_sumMat, 
				k41_sumMat/(double)k41_ArrayOncRec.size());
		System.out.println("*************************************");
		// 반평균 성적 합계, 평균을 출력한다.
		System.out.printf("반평균합계 %4d   반평균: %6.2f\n",k41_sumAve, 
				k41_sumAve/(double)k41_ArrayOncRec.size());
	}

}

package AboutArray;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import javax.xml.crypto.Data;

public class ReportSheet_last {
	//성적 집계표 출력 22.04.29 최수혁
	//여러 함수에서 이용되므로 static으로 변수 선언.
	static ArrayList<OneRec2> k41_ArrayOneRec = new ArrayList<OneRec2>();
	static int k41_sumkor = 0;	// 국어 점수의 합.
	static int k41_sumeng = 0;	// 영어 점수의 합.
	static int k41_summat = 0;	// 수학 점수의 합.
	static int k41_sumsum = 0;	// 점수의 합.
	static int k41_sumave = 0;	// 평균.
	static final int k41_iPerson = 5; //입력할 인원수
	static final int k41_peoplePerPage = 5;	// 페이지당 출력되는 인원수
	static int k41_page = k41_iPerson / k41_peoplePerPage;	// 페이지 수
	static int k41_startNum = k41_page * k41_peoplePerPage;	
	// 마지막 페이지의 시작하는 순번
	static int k41_presentKorSum = 0;static int k41_presentEngSum = 0;
	static int k41_presentMatSum = 0; //현재 페이지의 합을 구하기 위한 변수들.
	
	public static void main(String[] args) {
		dataSet();		//데이터를 arraylist에 저장하는 함수.
		dataSort();		//데이터를 총점 기준으로 내림차순 정렬하는 함수.
		for (int k41_pageI = 0; k41_pageI < k41_page; k41_pageI++) {//페이지 수 만큼 반복.
			HeaderPrint(k41_pageI);	// 헤드 부분을 출력하는 함수.
			for (int k41_i = 0+(k41_pageI*k41_peoplePerPage);
				k41_i < k41_peoplePerPage+(k41_pageI*k41_peoplePerPage); k41_i++) {
				itemPrint(k41_i);//페이지별로 성적 출력하는 식.
			}
			tailPrint(1,k41_pageI); //누적페이지 부분을 출력하는 함수.
		}
		if(k41_iPerson%k41_peoplePerPage!=0) {//마지막 페이지를 출력하기 위해 조건문을 사용.
			int k41_lastpage = k41_page; // 마지막 페이지 저장하는 변수.
			HeaderPrint(k41_lastpage);	//마지막 페이지의 헤드 부분을 출력하는 함수.
			for(int k41_i = k41_startNum; k41_i < k41_iPerson; k41_i++) {
				itemPrint(k41_i);	//마지막 페이지의 순번을 매개변수로 넣어서 함수 실행.
			}
			tailPrint(2,0); //마지막 페이지의 누적페이지 부분을 출력해주는 함수.
		}
	}
	
	public static void dataSort() { // 데이터 정렬을 위한 함수.
		Comparator<OneRec2> k41_com = new Comparator<OneRec2>() {
			//비교를 위해 Comparator 선언.
			public int compare(OneRec2 k41_a1, OneRec2 k41_a2) {
				//비교할 두 값을 매개변수에 넣는다.
				//성적의 총점을 비교한다.
				return (k41_a1.sum() - k41_a2.sum());
			}
		};
		Collections.sort(k41_ArrayOneRec, k41_com);	// 오름차순으로 정렬.
		Collections.reverse(k41_ArrayOneRec);	//성적순 출력을 위해 
		//내림차순으로 다시 정렬.

	}
	
	public static void dataSet() {	// 데이터를 순서대로 ArrayList에 저장하는 함수.
		for (int k41_i = 0; k41_i < k41_iPerson; k41_i++) {
			String k41_name = String.format("최수%02d", k41_i+1);
			int k41_kor = (int) (Math.random() * 100);	//0~100까지 국어 점수를 무작위로 생성.
			int k41_eng = (int) (Math.random() * 100);	//0~100까지 영어 점수를 무작위로 생성.
			int k41_mat = (int) (Math.random() * 100);	//0~100까지 수학 점수를 무작위로 생성.
			k41_ArrayOneRec.add(new OneRec2(k41_i, k41_name, k41_kor, k41_eng, k41_mat));
			// 번호, 이름, 무작위로 생성한 과목별 점수를 저장한다.
		}
	}

	public static void HeaderPrint(int k41_pageI) {	
		//성적 집계표, 페이지번호,출력일자를 출력하는 함수
		System.out.println("                  성적집계표");
		System.out.println("");
		System.out.printf("PAGE : %d	          출력일자 : %s\n",k41_pageI+1,getTimeNow());
		System.out.printf("========================================================\n");
		System.out.printf("%2s %5s   %4s %4s %4s %4s  %4s\n", "번호", "이름", "국어", "영어",
				"수학", "총점", "평균");
		System.out.printf("========================================================\n");
	}

	public static void itemPrint(int k41_i) {
		//항목별 수치와 현재페이지의 합계와 평균을 출력하는 함수.
		OneRec2 k41_rec;//OneRec2의 데이터를 불러오기 위해 객체 선언.
		k41_rec = k41_ArrayOneRec.get(k41_i);// 해당 순번의 정보를 가져옴.
		System.out.printf("%03d   %5s %6d %6d %6d %6d %6.0f\n", k41_rec.k41_student_id() + 1, k41_rec.k41_name(),
				k41_rec.k41_kor(), k41_rec.k41_eng(), k41_rec.k41_mat(), k41_rec.sum(), k41_rec.ave());
		k41_presentKorSum += k41_rec.k41_kor();	//현재 페이지의 과목별 합계를 누적하는 식.
		k41_presentEngSum += k41_rec.k41_eng();
		k41_presentMatSum += k41_rec.k41_mat();
		int k41_presentSum = k41_presentKorSum + k41_presentEngSum + k41_presentMatSum;
		// 과목 별 합계를 저장한 총점.
		if(k41_i%k41_peoplePerPage==k41_peoplePerPage-1) {
			//한 페이지의 마지막 부분에서만 출력하기 위해 조건을 걸어둠.
			System.out.printf("========================================================\n");
			System.out.println("현재페이지");
			System.out.printf("합계 :       %6d %6d %6d %6d  %6d\n",k41_presentKorSum,k41_presentEngSum,k41_presentMatSum,
					k41_presentSum, k41_presentSum/3);
			System.out.printf("평균 :       %6.0f %6.0f %6.0f %6.0f  %6.0f\n",k41_presentKorSum/(double)k41_peoplePerPage,k41_presentEngSum/(double)k41_peoplePerPage
					,k41_presentMatSum/(double)k41_peoplePerPage,
					k41_presentKorSum/(double)k41_peoplePerPage+k41_presentEngSum/(double)k41_peoplePerPage+
					k41_presentMatSum/(double)k41_peoplePerPage, 
					(k41_presentKorSum/(double)k41_peoplePerPage+k41_presentEngSum/(double)k41_peoplePerPage+
					k41_presentMatSum/(double)k41_peoplePerPage)/3);
			k41_presentKorSum=0;k41_presentEngSum=0;k41_presentMatSum=0;
			//그 다음 페이지에 영향을 끼치지 않기 위해 다시 0으로 초기화 시켜준다.
		}
		if(k41_i==k41_iPerson-1&&k41_iPerson!=k41_peoplePerPage) {
			//마지막 페이지의 현재 페이지 출력을 위해 조건을 걸어둠.
			System.out.printf("========================================================\n");
			System.out.println("현재페이지");
			System.out.printf("합계 :       %6d %6d %6d %6d  %6d\n",k41_presentKorSum,k41_presentEngSum,
					k41_presentMatSum,k41_presentSum, k41_presentSum/3);
			System.out.printf("평균 :       %6.0f %6.0f %6.0f %6.0f  %6.0f\n",k41_presentKorSum/
					(double)(k41_iPerson%k41_peoplePerPage),k41_presentEngSum/(double)(k41_iPerson%k41_peoplePerPage)
					,k41_presentMatSum/(double)(k41_iPerson%k41_peoplePerPage),
					k41_presentKorSum/(double)(k41_iPerson%k41_peoplePerPage)+k41_presentEngSum/
					(double)(k41_iPerson%k41_peoplePerPage)+k41_presentMatSum/(double)(k41_iPerson%k41_peoplePerPage), 
					(k41_presentKorSum/(double)(k41_iPerson%k41_peoplePerPage)+k41_presentEngSum/(double)(k41_iPerson%k41_peoplePerPage)+
					k41_presentMatSum/(double)(k41_iPerson%k41_peoplePerPage))/3);
		}
		// 누적합계를 위한 식들.
		k41_sumkor += k41_rec.k41_kor();
		k41_sumeng += k41_rec.k41_eng();
		k41_summat += k41_rec.k41_mat();
		k41_sumsum += k41_rec.sum();
		k41_sumave += k41_rec.ave();
	}
	
	public static void tailPrint(int order, int k41_pageI) {//누적페이지 출력을 위한 함수.
		int k41_people = k41_peoplePerPage+(k41_pageI*k41_peoplePerPage);
		if(order !=1) {//매개변수 order 값이 1이 아닐때 마지막 페이지의 누적페이지를 출력.
			k41_people = k41_iPerson;
		}
		System.out.printf("========================================================\n");
		System.out.println("누적페이지");
		System.out.printf("합계 :       %6d %6d %6d %6d  %6d\n",k41_sumkor,k41_sumeng,
				k41_summat,k41_sumkor+k41_sumeng+k41_summat,
				(k41_sumkor+k41_sumeng+k41_summat)/3);
		System.out.printf("평균 :       %6.0f %6.0f %6.0f %6.0f  %6.0f\n",k41_sumkor/(double) k41_people,
				k41_sumeng/(double) k41_people,
				k41_summat/(double) k41_people,k41_sumkor/(double) k41_people+
				k41_sumeng/(double) k41_people+k41_summat/(double) k41_people,
				(k41_sumkor/(double) k41_people+k41_sumeng/(double) k41_people+k41_summat/(double) k41_people)/3);
		System.out.printf("========================================================\n");
		System.out.println("");
	}
	
	public static String getTimeNow() {	// 출력시간을 얻기 위한 함수.
		SimpleDateFormat k41_form = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar k41_cal = Calendar.getInstance();
		String k41_now = k41_form.format(k41_cal.getTime());//현재 시간을 얻어서 문자열로 저장.
		return k41_now;	//시간이 저장된 문자열을 반환해준다.
	}

	
}

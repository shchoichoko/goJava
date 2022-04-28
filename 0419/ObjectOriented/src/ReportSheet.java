import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet {
	// #19 성적 입력데이터 출력 22.04.20 최수혁
	static int k41_iPerson = 200; // 배열 크기를 설정. 
	static int k41_printPerson = 30;	//페이지당 인원수
	static int k41_totalPageNum = k41_iPerson/k41_printPerson;	//총 페이지 수
	static int k41_lastPeople = k41_iPerson % k41_printPerson;	//마지막 페이지에 남은 인원 수 
	static int k41_startNum = k41_totalPageNum * k41_printPerson;
	static InputData k41_inData = new InputData(k41_iPerson); // InputData 클래스의 객체 생성
	static int k41_korSumArr[] = new int[k41_totalPageNum];	// 페이지 수만큼 크기 지정.
	static int k41_engSumArr[] = new int[k41_totalPageNum]; // 페이지 수만큼 크기 지정.
	static int k41_matSumArr[] = new int[k41_totalPageNum]; // 페이지 수만큼 크기 지정.
	static int k41_lastKorSum = 0;static int k41_lastEngSum = 0;static int k41_lastMatSum = 0;static int k41_lastSum = 0;
	//합계를 위한 과목별 변수 선언 및 초기화
	static int k41_totalKorSum = 0; static int k41_totalEngSum = 0;static int k41_totalMatSum = 0; 
	
	public static void main(String[] args) {// 메인함수
		inputData(); // 데이터 저장하는 함수.
		printData(); // 성적집계 데이터 출력하는 함수.

	}

	public static void printHeader(int k41_pageNum) { // 성적집계표 윗부분 출력하는 함수
		System.out.printf("                  성적집계표\n\n");
		printTime(k41_pageNum);	// 현재 시각 출력
		System.out.println("==================================================");
		System.out.printf("번호  이름    국어   영어   수학  총점  평균\n");
		System.out.println("==================================================");
	}

	// 페이지 별로 데이터 배열로 저장. 
	public static void inputData() {
		for (int k41_p = 0; k41_p < k41_totalPageNum; k41_p++) {// 페이지 수 만큼 반복.
			
			for (int k41_i = k41_p * k41_printPerson; k41_i < k41_printPerson * (k41_p + 1); k41_i++) {
				String k41_name = String.format("홍길%02d", k41_i + 1); // 이름을 넣기위한 변수 생성.
				int k41_kor = (int) (Math.random() * 100); // 국어 점수를 랜덤으로 생성1~100점까지 생성.
				int k41_eng = (int) (Math.random() * 100); // 영어 점수를 랜덤으로 생성1~100점까지 생성.
				int k41_mat = (int) (Math.random() * 100); // 수학 점수를 랜덤으로 생성1~100점까지 생성.
				k41_inData.SetData(k41_p,k41_i, k41_name, k41_kor, k41_eng, k41_mat);
				// SetData함수에 번호, 이름, 국어, 영어, 수학 점수를 매개변수로 넣어 저장.
				// 과목별 합계 저장.
				k41_korSumArr[k41_p] +=k41_kor; 
				k41_engSumArr[k41_p] +=k41_eng; 
				k41_matSumArr[k41_p] +=k41_mat; 
				
			}
			
			//마지막 페이지 저장.
			if (k41_lastPeople != 0) {
				for (int k41_l = k41_startNum; k41_l < k41_iPerson; k41_l++) {
					String k41_name = String.format("홍길%02d", k41_l + 1); // 이름을 넣기위한 변수 생성.
					int k41_kor = (int) (Math.random() * 100); // 국어 점수를 랜덤으로 생성1~100점까지 생성.
					int k41_eng = (int) (Math.random() * 100); // 영어 점수를 랜덤으로 생성1~100점까지 생성.
					int k41_mat = (int) (Math.random() * 100); 
					k41_inData.SetData(k41_p, k41_l, k41_name, k41_kor, k41_eng, k41_mat);
					
				}
			}
		}
	}

	// 위에서 inputData에서 배열에 저장했던 수치들 출력.
	public static void printData() {

		for(int k41_p = 0; k41_p < k41_totalPageNum; k41_p++) {
			//System.out.println(k41_inData.k41_korSumArr[k41_p]);
		}
		
		//페이지 수 만큼 , 반복하는 식
		for (int k41_p = 0; k41_p < k41_totalPageNum; k41_p++) {
			int k41_pageSum = k41_korSumArr[k41_p] + k41_engSumArr[k41_p] + k41_matSumArr[k41_p];
			double k41_totalAvg = (k41_korSumArr[k41_p] + k41_engSumArr[k41_p] + k41_matSumArr[k41_p]) / (double)k41_printPerson;
			double k41_korAvg = k41_korSumArr[k41_p] / (double)k41_printPerson;
			double k41_engAvg = k41_engSumArr[k41_p] / (double)k41_printPerson;
			double k41_matAvg = k41_matSumArr[k41_p] / (double)k41_printPerson;
			double k41_avgSum = k41_korAvg + k41_engAvg + k41_matAvg;
			int k41_accKorSumVal = 0;int k41_accEngSumVal = 0;int k41_accMatSumVal = 0;int k41_accTotalSum = 0;
			// 누적 값 합계 저장을 위한 변수
			double k41_accKorAvg, k41_accEngAvg, k41_accMatAvg; double k41_accAvgTotal;
			// 누적 평균 값을 구하기 위한 변수
			int k41_countPeople = k41_printPerson;	//누적페이지의 평균을 위해 사람 수를 누적해서 세줌.
				printHeader(k41_p + 1); // 성적집계표 윗부분 출력하는 함수.
				// 인원 수 만큼, 배열 크기만큼 반복해서 출력하는 식.
				for (int k41_i = k41_p * k41_printPerson; k41_i < k41_printPerson * (k41_p + 1); k41_i++) {
			
						System.out.printf("%03d   %4s %5d %5d %5d %5d %6.0f\n", k41_inData.k41_num[k41_i] + 1,
								k41_inData.k41_name[k41_i], k41_inData.k41_kor[k41_i], k41_inData.k41_eng[k41_i],
								k41_inData.k41_mat[k41_i], k41_inData.k41_sum[k41_i], k41_inData.k41_avg[k41_i]);
						
						
				}
				k41_countPeople = k41_countPeople * (k41_p+1);
				
				
				System.out.println("==================================================");
				// 과목별 합계, 전체 합계를 출력하는 식.
				System.out.printf("현재페이지\n");
				System.out.printf("합계        %6d %5d %5d %5d %6.0f\n", k41_korSumArr[k41_p], k41_engSumArr[k41_p],
						k41_matSumArr[k41_p], k41_pageSum, k41_totalAvg);
				// 과목별 평균, 전체 평균을 출력하는 식.
				System.out.printf("평균        %6.0f %5.0f %5.0f %5.0f %6.0f\n", k41_korAvg, k41_engAvg, k41_matAvg, k41_avgSum,
						k41_avgSum / 3.0);
				System.out.println("==================================================");
				for(int k41_r = 0; k41_r < k41_p+1; k41_r++ ) {
					// 페이지 수만큼 마지막 페이지 제외한 페이지의 과목별 합을 저장.
					k41_accKorSumVal+= k41_korSumArr[k41_r]; 
					k41_accEngSumVal += k41_engSumArr[k41_r]; 
					k41_accMatSumVal +=k41_matSumArr[k41_r];
					
					
				}
				// 마지막 페이지와 이전까지 누적페이지 합과 평균 구하는 식
				k41_accTotalSum = k41_accKorSumVal + k41_accEngSumVal + k41_accMatSumVal;
				k41_accKorAvg = k41_accKorSumVal/(double)k41_countPeople;
				k41_accEngAvg = k41_accEngSumVal/(double)k41_countPeople;
				k41_accMatAvg = k41_accMatSumVal/(double)k41_countPeople;
				k41_accAvgTotal = k41_accKorAvg + k41_accEngAvg + k41_accMatAvg;
				System.out.printf("누적페이지\n");
				System.out.printf("합계        %6d %5d %5d %5d %6.0f\n", k41_accKorSumVal, 
						k41_accEngSumVal, k41_accMatSumVal, k41_accTotalSum, k41_accTotalSum/3.0);
				System.out.printf("평균        %6.0f %5.0f %5.0f %5.0f %6.0f\n", 
						k41_accKorAvg, k41_accEngAvg, k41_accMatAvg, k41_accAvgTotal,
						k41_accAvgTotal / 3.0);
				System.out.println("==================================================");
				k41_totalKorSum = k41_accKorSumVal;k41_totalEngSum = k41_accEngSumVal;k41_totalMatSum = k41_accMatSumVal;
		}
		System.out.println("");
		
		printHeader(k41_totalPageNum + 1);	// 마지막 페이지 텍스트 부분 출력
		printLastPeople();	//마지막 페이지 인원 출력
	}

	//마지막 페이지 인원 출력
	public static void printLastPeople() {
		//추가 인원
		if(k41_totalPageNum == 1) {	//전체 페이지 수가 1일 경우, 아래 문장 수행.
			k41_lastPeople = k41_iPerson-k41_printPerson;	// 마지막 페이지의 인원 구하는 식.
		}
		if (k41_lastPeople != 0) {	// 마지막 페이지 인원이 있을 경우 출력 하는 식.
			for (int k41_l = k41_startNum; k41_l < k41_iPerson; k41_l++) {
				System.out.printf("%03d   %4s %5d %5d %5d %5d %6.0f\n", k41_inData.k41_num[k41_l] + 1,
						k41_inData.k41_name[k41_l], k41_inData.k41_kor[k41_l], k41_inData.k41_eng[k41_l],
						k41_inData.k41_mat[k41_l], k41_inData.k41_sum[k41_l], k41_inData.k41_avg[k41_l]);
				k41_lastKorSum += k41_inData.k41_kor[k41_l];
				k41_lastEngSum += k41_inData.k41_eng[k41_l];
				k41_lastMatSum += k41_inData.k41_mat[k41_l];
			}
		}
		//마지막 페이지 총 합계 구하는 식.
		k41_lastSum = k41_lastKorSum + k41_lastEngSum + k41_lastMatSum;
		double k41_lastAvgSum = (k41_lastKorSum/k41_lastPeople + k41_lastEngSum/k41_lastPeople +
				k41_lastMatSum/k41_lastPeople);
		System.out.println("==================================================");
		System.out.printf("현재페이지\n");
		System.out.printf("합계        %6d %5d %5d %5d %6.0f\n", k41_lastKorSum, k41_lastEngSum,
				k41_lastMatSum, k41_lastSum, k41_lastSum/3.0);
		// 과목별 평균, 전체 평균을 출력하는 식.
		System.out.printf("평균        %6d %5d %5d %5.0f %6.0f\n", (int)(k41_lastKorSum/k41_lastPeople), 
				(int)(k41_lastEngSum/k41_lastPeople), (int)(k41_lastMatSum/k41_lastPeople), k41_lastAvgSum,
				k41_lastAvgSum / 3.0);
		System.out.println("==================================================");
		int k41_korAll = k41_totalKorSum+k41_lastKorSum;int k41_engAll = k41_totalEngSum+k41_lastEngSum; 
		int k41_matAll=k41_totalMatSum+k41_lastMatSum;
		//여기서부터 문제.
		System.out.printf("누적페이지\n");
		System.out.printf("합계        %6d %5d %5d %5d %6.0f\n",k41_korAll,k41_engAll,k41_matAll,
				k41_korAll+k41_engAll+k41_matAll,
				(k41_korAll+k41_engAll+k41_matAll)/3.0);
		System.out.printf("평균        %6d %5d %5d %5d %6.0f\n",k41_korAll/k41_iPerson,k41_engAll/k41_iPerson,
				k41_matAll/k41_iPerson,(k41_korAll/k41_iPerson+k41_engAll/k41_iPerson+k41_matAll/k41_iPerson),
				(k41_korAll/k41_iPerson+k41_engAll/k41_iPerson+k41_matAll/k41_iPerson)/3.0);
		System.out.println("==================================================");
		
	}
	// 현재 시간을 출력 하는 식.
	public static void printTime(int k41_pageNum) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat time = new SimpleDateFormat("YYYY.M.dd HH:mm:ss");
		System.out.printf("PAGE: %d             출력일자 : %s\n", k41_pageNum, time.format(cl.getTime()));
	}
}

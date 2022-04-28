package AboutArray;


public class ReportSheet_26p {
	// #page26 성적 입력데이터 출력 22.04.20 최수혁

	public static void main(String[] args) {

		int k41_iPerson = 5;	// 생성할 인원 수 정하기.
		OneRec[] k41_data = new OneRec[k41_iPerson];	//OneRec 클래스의 배열을 생성. 배열의 크기는 인원 수로 지정.

		for (int k41_i = 0; k41_i < k41_iPerson; k41_i++) {	
			// 인원만큼 반복을 위한 for문
			String k41_name = String.format("홍길%02d", k41_i+1);	
			// 우선 이름, 국어,영어,수학 점수 입력을 위한 변수를 하나씩 만듬.
			int k41_kor = (int)(Math.random()*100);	
			//0~100까지 랜덤으로 생성함. 정수형 변수 k41_kor에 저장하기 위해 int로 형변환 해줌.
			int k41_eng = (int)(Math.random()*100); 
			//0~100까지 랜덤으로 생성함. 정수형 변수 k41_eng에 저장하기 위해 int로 형변환 해줌.
			int k41_mat = (int)(Math.random()*100); 
			//0~100까지 랜덤으로 생성함. 정수형 변수 k41_mat에 저장하기 위해 int로 형변환 해줌.
			// 위에서 생성한 이름과 과목별 점수를 배열에 저장하는 OneRec 함수를 이용함.
			k41_data[k41_i] = new OneRec(k41_name,k41_kor,k41_eng,k41_mat);
			
			// 형식에 맞춰서 출력. k41_data를 이용해 OneRec클래스의 함수를 끌어와서 사용.
			System.out.printf("번호 : %d 이름 : %s 국어 : %d 영어 : %d 수학 : %d 합계 : %d 평균 : %.2f\n", 
					k41_i+1, k41_data[k41_i].k41_name(),
					k41_data[k41_i].k41_kor(),k41_data[k41_i].k41_eng(),k41_data[k41_i].
					k41_mat(),k41_data[k41_i].sum(),k41_data[k41_i].ave());
		}
		
		
		
	}
}

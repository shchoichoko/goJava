package AboutArray;

//# 성적 입력데이터  22.04.28 최수혁
public class OneRec2 {
	private int k41_student_id;	//번호 저장용 변수
	private String k41_name;	//이름 저장용 변수
	private int k41_kor;	// 국어 점수 저장용 변수
	private int k41_eng;	//영어 점수 저장용 변수
	private int k41_mat;	//수학 점수 저장용 변수

	public OneRec2(int k41_student_id, String k41_name, int k41_kor, 
			int k41_eng, int k41_mat) 
	{	//메개변수 5개를 입력 받는 생성자 식.
		this.k41_student_id = k41_student_id;	//매개변수를 입력받아 학번을 저장.
		this.k41_name = k41_name;//매개변수를 입력받아 이름을 저장.
		this.k41_kor = k41_kor;//매개변수를 입력받아 국어 점수를 저장.
		this.k41_eng = k41_eng;//매개변수를 입력받아 영어 점수를 저장.
		this.k41_mat = k41_mat;//매개변수를 입력받아 수학 점수를 저장.
	}

	public int k41_student_id() {
		return this.k41_student_id;
	}	//입력한 학번을 반환하는 함수

	public String k41_name() {
		return this.k41_name;
	}	//입력한 이름을 반환하는 함수

	public int k41_kor() {
		return this.k41_kor;
	}	//입력한 국어 점수를 반환하는 함수

	public int k41_eng() {
		return this.k41_eng;
	}	//입력한 영어 점수를 반환하는 함수

	public int k41_mat() {
		return this.k41_mat;
	}	//입력한 수학 점수를 반환하는 함수

	public int sum() {
		return this.k41_kor + this.k41_eng + this.k41_mat;
	}	//입력한 국어, 영어, 수학 점수의 합을 구하는 함수

	public double ave() {
		return this.sum() / 3.0;
	}	//구한 합계를 3.0으로 나눠 점수 평균을 구해주는 함수

}

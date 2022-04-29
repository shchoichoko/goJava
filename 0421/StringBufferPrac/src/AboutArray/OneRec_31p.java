package AboutArray;

public class OneRec_31p {
	//ArrayList
	private int k41_studentId; // 정수형 변수 학번 생성
	private String k41_name; // 문자열 변수 이름 생성
	private int k41_kor; // 정수형 변수 국어 생성
	private int k41_eng; // 정수형 변수 영어 생성
	private int k41_mat; // 정수형 변수 수학 생성

	public OneRec_31p(int studentId, String name, int kor, int eng, int mat) {	
		//생성자 만들기 변수 4개(이름, 국어,영어,수학)
				this.k41_studentId = studentId;	//위에서 선언한 변수에 생성자로 받아온 값 입력
				this.k41_name = name;	//위에서 선언한 변수에 생성자로 받아온 값 입력
				this.k41_kor = kor;	//위에서 선언한 변수에 생성자로 받아온 값 입력
				this.k41_eng = eng;	//위에서 선언한 변수에 생성자로 받아온 값 입력
				this.k41_mat = mat;	//위에서 선언한 변수에 생성자로 받아온 값 입력
		}

	public int getStudentId() {
		return this.k41_studentId;
	}; // 입력한 학번을 리턴하는 메소드 생성

	public String getName() {
		return this.k41_name;
	}; // 입력한 이름을 리턴하는 메소드 생성

	public int getKor() {
		return this.k41_kor;
	}; // 입력한 국어성적을 리턴하는 메소드 생성

	public int getEng() {
		return this.k41_eng;
	}; // 입력한 영어성적을 리턴하는 메소드 생성

	public int getMat() {
		return this.k41_mat;
	}; // 입력한 수학성적을 리턴하는 메소드 생성

	public int getSum() {
		return this.k41_kor + this.k41_eng + this.k41_mat;
	}; // 입력한 성적의 합계를 리턴하는 메소드 생성

	public double getAve() {
		return this.getSum() / 3.0;
	}; // 입력한 성적의 평균을 계산하여 리턴하는 메소드 생성
}

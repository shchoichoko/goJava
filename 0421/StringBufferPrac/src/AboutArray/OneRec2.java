package AboutArray;

//#page30 성적 입력데이터 출력 22.04.28 최수혁
public class OneRec2 {
	private int k41_student_id;
	private String k41_name;
	private int k41_kor;
	private int k41_eng;
	private int k41_mat;

	public OneRec2(int k41_student_id, String k41_name, int k41_kor, int k41_eng, int k41_mat) {
		this.k41_student_id = k41_student_id;
		this.k41_name = k41_name;
		this.k41_kor = k41_kor;
		this.k41_eng = k41_eng;
		this.k41_mat = k41_mat;
	}

	public int k41_student_id() {
		return this.k41_student_id;
	}

	public String k41_name() {
		return this.k41_name;
	}

	public int k41_kor() {
		return this.k41_kor;
	}

	public int k41_eng() {
		return this.k41_eng;
	}

	public int k41_mat() {
		return this.k41_mat;
	}

	public int sum() {
		return this.k41_kor + this.k41_eng + this.k41_mat;
	}

	public double ave() {
		return this.sum() / 3.0;
	}

}

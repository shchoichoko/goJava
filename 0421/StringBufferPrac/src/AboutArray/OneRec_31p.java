package AboutArray;

public class OneRec_31p {
	//ArrayList
	private int k41_studentId; // ������ ���� �й� ����
	private String k41_name; // ���ڿ� ���� �̸� ����
	private int k41_kor; // ������ ���� ���� ����
	private int k41_eng; // ������ ���� ���� ����
	private int k41_mat; // ������ ���� ���� ����

	public OneRec_31p(int studentId, String name, int kor, int eng, int mat) {	
		//������ ����� ���� 4��(�̸�, ����,����,����)
				this.k41_studentId = studentId;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
				this.k41_name = name;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
				this.k41_kor = kor;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
				this.k41_eng = eng;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
				this.k41_mat = mat;	//������ ������ ������ �����ڷ� �޾ƿ� �� �Է�
		}

	public int getStudentId() {
		return this.k41_studentId;
	}; // �Է��� �й��� �����ϴ� �޼ҵ� ����

	public String getName() {
		return this.k41_name;
	}; // �Է��� �̸��� �����ϴ� �޼ҵ� ����

	public int getKor() {
		return this.k41_kor;
	}; // �Է��� ������� �����ϴ� �޼ҵ� ����

	public int getEng() {
		return this.k41_eng;
	}; // �Է��� ������� �����ϴ� �޼ҵ� ����

	public int getMat() {
		return this.k41_mat;
	}; // �Է��� ���м����� �����ϴ� �޼ҵ� ����

	public int getSum() {
		return this.k41_kor + this.k41_eng + this.k41_mat;
	}; // �Է��� ������ �հ踦 �����ϴ� �޼ҵ� ����

	public double getAve() {
		return this.getSum() / 3.0;
	}; // �Է��� ������ ����� ����Ͽ� �����ϴ� �޼ҵ� ����
}

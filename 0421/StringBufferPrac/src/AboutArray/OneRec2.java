package AboutArray;

//# ���� �Էµ�����  22.04.28 �ּ���
public class OneRec2 {
	private int k41_student_id;	//��ȣ ����� ����
	private String k41_name;	//�̸� ����� ����
	private int k41_kor;	// ���� ���� ����� ����
	private int k41_eng;	//���� ���� ����� ����
	private int k41_mat;	//���� ���� ����� ����

	public OneRec2(int k41_student_id, String k41_name, int k41_kor, 
			int k41_eng, int k41_mat) 
	{	//�ް����� 5���� �Է� �޴� ������ ��.
		this.k41_student_id = k41_student_id;	//�Ű������� �Է¹޾� �й��� ����.
		this.k41_name = k41_name;//�Ű������� �Է¹޾� �̸��� ����.
		this.k41_kor = k41_kor;//�Ű������� �Է¹޾� ���� ������ ����.
		this.k41_eng = k41_eng;//�Ű������� �Է¹޾� ���� ������ ����.
		this.k41_mat = k41_mat;//�Ű������� �Է¹޾� ���� ������ ����.
	}

	public int k41_student_id() {
		return this.k41_student_id;
	}	//�Է��� �й��� ��ȯ�ϴ� �Լ�

	public String k41_name() {
		return this.k41_name;
	}	//�Է��� �̸��� ��ȯ�ϴ� �Լ�

	public int k41_kor() {
		return this.k41_kor;
	}	//�Է��� ���� ������ ��ȯ�ϴ� �Լ�

	public int k41_eng() {
		return this.k41_eng;
	}	//�Է��� ���� ������ ��ȯ�ϴ� �Լ�

	public int k41_mat() {
		return this.k41_mat;
	}	//�Է��� ���� ������ ��ȯ�ϴ� �Լ�

	public int sum() {
		return this.k41_kor + this.k41_eng + this.k41_mat;
	}	//�Է��� ����, ����, ���� ������ ���� ���ϴ� �Լ�

	public double ave() {
		return this.sum() / 3.0;
	}	//���� �հ踦 3.0���� ���� ���� ����� �����ִ� �Լ�

}


public class InputData {
	// #19 ���� �Էµ����� 22.04.20 �ּ���
	
	public String[] k41_name;	//�̸��� �迭�� ���� ���� ����.
	public int[] k41_kor;	//���� ������ �迭�� ���� ���� ����.
	public int[] k41_eng;	//���� ������ �迭�� ���� ���� ����.
	public int[] k41_mat; 	//���� ������ �迭�� ���� ���� ����.
	public int[] k41_num;	//��ȣ�� �迭�� ���� ���� ����.
	public int[] k41_sum;	//�հ踦 �迭�� ���� ���� ����.
	public double[] k41_avg;	//��������� �迭�� ���� ���� ����.
	
	InputData(int k41_size){	// �Ű������� �迭�� ũ�⸦ �Է� �ޱ�.
		//�迭�� ũ�⸦ k41_size ��ŭ ũ�⸦ �����Ѵ�.
		k41_name = new String[k41_size];	
		k41_kor = new int[k41_size];		
		k41_eng = new int[k41_size];		
		k41_mat = new int[k41_size];		
		k41_num = new int[k41_size];		
		k41_sum = new int[k41_size];		
		k41_avg = new double[k41_size];		

	}
	// ��ȣ, �̸�, ����, ����, ������ ��ȣ��� �����ϰ�, �հ�� ��յ� ���ÿ� ���� ����.
	public void SetData(int k41_totalPageNum,int k41_i, String k41_name, int k41_kor,int k41_eng, int k41_mat) {
		this.k41_num[k41_i] = k41_i; 	// ��ȣ �Է¹޴� �迭
		this.k41_name[k41_i] = k41_name; //�̸� �Է¹޴� �迭
		this.k41_kor[k41_i] = k41_kor; //�������� �Է¹޴� �迭
		this.k41_eng[k41_i] = k41_eng; //�������� �Է¹޴� �迭
		this.k41_mat[k41_i] = k41_mat; //�������� �Է¹޴� �迭
		k41_sum[k41_i] = k41_kor + k41_eng + k41_mat;	//����, ����, ���� ������ �հ踦 �����ϴ� �迭
		k41_avg[k41_i] = (k41_kor + k41_eng + k41_mat)/3; // �� �հ��� ��� ������ �����ϴ� �迭
	}
	
}

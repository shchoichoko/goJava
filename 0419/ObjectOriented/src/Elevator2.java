
public class Elevator2 {
	//#12 ������ ����������2 22.04.20 �ּ���
	public int k41_limit_up_floor;	//�ֻ�����
	public int k41_limit_down_floor;	//������
	public int k41_floor;	//���� ����
	public String k41_help;	//���ڿ� ������ ���� ����.
	
	Elevator2(){
		// �⺻ ����������.
		k41_limit_up_floor = 10;	//�ִ����� 10��.
		k41_limit_down_floor = 1;	//�������� 1��.
		k41_help = "���������� �⺻ �ذ��Ϸ�";
	}
	
	Elevator2(int k41_up_floor, int k41_d_floor, int k41_in_floor){
		//��ü�� ������ ��, �ֻ�����, ������, �������� ������� �־ ������ �� �ִ�.
		k41_limit_up_floor = k41_up_floor;
		k41_limit_down_floor = k41_d_floor;
		k41_help = "���������� ���� �ذ��Ϸ�";
	}
	
	void up() {
		//�ֻ��� ���� ���� ���� ������ ���̶�� �޼�����, 
		//�ƴ� ���� ������ �ϳ� ���ϰ� ���� ���� �˷��ִ� �޽����� help�� ����.
		if(k41_floor == k41_limit_up_floor-1) {
			k41_help = "������ ���Դϴ�";
		} else {
			k41_floor++;
			k41_help = String.format("[%d]���Դϴ�", k41_floor);
		}
	}
	
	void down() {
		//�������� ���� ���� ó�����̶�� �޼�����, 
		//�ƴ� ���� ������ �ϳ� ���� ���� ���� �˷��ִ� �޽����� help�� ����.
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "ó�� ���Դϴ�";
		} else {
			k41_floor--;
			k41_help = String.format("[%d]���Դϴ�", k41_floor);
		}
	}
	
	void up(int k41_u) {
		//�Ű������� ���� ���ڿ� ���� ������ �ö�.
		for(int k41_i = 0; k41_i < k41_u; k41_i++) {
			this.up();
		}
	}
	
	void down(int k41_u) {
		//�Ű������� ���� ���ڿ� ���� ������ ������.
		for(int k41_i = 0; k41_i < k41_u; k41_i++) {
			down();
		}
	}
	
	void msg(String k41_id) {
		//�޼��� ����� ���� ����.
		//�Ű������� ���ڿ��� �ִµ�, ���⼱ ���������� �̸��� ���ȴ�.
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", 
				k41_id, k41_help, k41_limit_up_floor, k41_limit_down_floor, k41_floor);
	}


}
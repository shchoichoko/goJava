
public class Elevator {
	//#4 Ŭ���� ��ü �ν��Ͻ� 22.04.20 �ּ���
	int k41_limit_up_floor = 10; // �ֻ��� ��
	int k41_limit_down_floor = 0;	//������ ��
	int k41_floor = 1;	//���� ��
	String k41_help;	// ���ڿ� ����� ���� ���� ����.
	
	void Up() {	
		//�ֻ��� ���� ���� ���� ������ ���̶�� �޼�����, 
		//�ƴ� ���� ������ �ϳ� ���ϰ� ���� ���� �˷��ִ� �޽����� help�� ����.
		if(k41_floor == k41_limit_up_floor) {
			k41_help = "������ ���Դϴ�.";
		} else {
			k41_floor++;
			k41_help = String.format("%d���Դϴ�.",k41_floor);
		}
	}
	
	void down() {
		//�������� ���� ���� 1���̶�� �޽����� help�� �����ϰ�.
		//�ƴ� ���� ���� �������� 1�� ���ְ�, ���� ������ �˷��ִ� �޽����� help�� ����.
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "1���Դϴ�.";
		} else {
			k41_floor--;
			k41_help = String.format("%d���Դϴ�.", k41_floor);
		}
	}
}
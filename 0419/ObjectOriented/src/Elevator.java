
public class Elevator {
	//#4 Ŭ���� ��ü �ν��Ͻ� 22.04.19 �ּ���
	int k41_limit_up_floor = 10; // �ֻ��� ��
	int k41_limit_down_floor = 0;	//������ ��
	int k41_floor = 1;	//���� ��
	String k41_help;
	
	void Up() {
		if(k41_floor == k41_limit_up_floor) {
			k41_help = "������ ���Դϴ�.";
		} else {
			k41_floor++;
			k41_help = String.format("%d���Դϴ�.",k41_floor);
		}
	}

	void down() {
		if(k41_floor == k41_limit_down_floor) {
			k41_help = "ó�����Դϴ�.";
		} else {
			k41_floor--;
			k41_help = String.format("%d���Դϴ�.", k41_floor);
		}
	}
}

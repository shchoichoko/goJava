
public class Elevator3 extends Elevator2 {
	// #16 ��� ����������3 22.04.20 �ּ���
	void repair() {	// repair �޼ҵ� �߰�.
		k41_help = String.format("�������Դϴ�.");	// �������Դϴ� ��� ���ڿ� ����.
	}
	
	void up() {
		if(k41_floor >= k41_limit_up_floor) {
			k41_help = "������ ���Դϴ�";
		} else {
			k41_floor = k41_floor + 2;
			k41_help = String.format("%d���Դϴ�",k41_floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k41_help);
	}
	
}

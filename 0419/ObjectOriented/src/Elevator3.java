
public class Elevator3 extends Elevator2 {
	// #20 �������̵� ����������3 22.04.20 �ּ���
	Elevator3(){
		k41_help = "����������  �ذ��Ϸ�";
		System.out.println(k41_help);
	}
	void repair() {	// repair �޼ҵ� �߰�.
		k41_help = String.format("�������Դϴ�.");	// �������Դϴ� ��� 
		//���ڿ� ����.
	}
	
	void up() {
		//�ֻ��� ���� ���� ���� ������ ���̶�� �޼�����, 
		//�ƴ� ���� ������ ���� ���ϰ� ���� ���� �˷��ִ� �޽����� help�� ����.
		//�� ���� �ٽ� ��������.
		if(k41_floor >= k41_limit_up_floor) {
			k41_help = "������ ���Դϴ�";
		} else {
			k41_floor = k41_floor + 2;
			k41_help = String.format("%d���Դϴ�",k41_floor);
		}
		this.down();
	}
	
	void down() {	//���������Ͱ� ������.
		super.down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k41_help);
	}
	
}

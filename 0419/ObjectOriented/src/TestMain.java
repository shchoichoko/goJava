
public class TestMain {
	//#5 Ŭ���� ��ü �ν��Ͻ�(2) 22.04.20 �ּ���
	private static int k41_inVal;
	//�������� ����.
	public static void up() {
		k41_inVal++;
		// �ش� �Լ��� �����Լ����� ���Ǿ��� ������ 1�����ϰ�, ������ä�� ���
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k41_inVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k41_inVal = 0;
		Elevator k41_elev;
		k41_elev = new Elevator();	//ElevatorŬ���� ��ä ����.
		up();// ���� �������� �� ��������.
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			k41_elev.Up();	//Elevator Ŭ������ Up�Լ� ���.
			System.out.printf("MSG[%s]\n", k41_elev.k41_help);
		}
		for(int k41_i = 0; k41_i < 10; k41_i ++) {
			k41_elev.down();//Elevator Ŭ������ down�Լ� ���.
			System.out.printf("MSG[%s]\n",k41_elev.k41_help);
		}
		
	}

}


public class TestMain3 {
	// #17 ��� ����������3 �׽�Ʈ 22.04.20 �ּ���
	
	public static void main(String[] args) {
		Elevator3 k41_elev3 = new Elevator3();
		// Elevator3 ��ü�� �����Ѵ�. 
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//��ӹ��� up()�Լ��� �̿��� ������ 10�� �ø���.
			k41_elev3.up();
			System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		}
		
		for(int k41_i = 0; k41_i < 10; k41_i++) {
			//��ӹ��� down()�Լ��� �̿��� ������ 10�� ������.
			k41_elev3.down();
			System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		} 
		//Elevator�� �Լ��� ��� �����ϴ�.
		k41_elev3.repair();
		System.out.printf("MSG k41_elev3[%s]\n", k41_elev3.k41_help);
		
	}

}

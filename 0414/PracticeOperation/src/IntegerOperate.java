
public class IntegerOperate {

	public static void main(String[] args) {
		// #3 ������ ����(����) . 22.04.14 . csh
		int k41_ii = 1000 / 3;	//���� ���ϴ� ��
		System.out.printf("#3-1 : %d\n", k41_ii);
		
		k41_ii = 1000 % 3;	//�������� ���ϴ� �� 
		System.out.printf("#3-2 : %d\n", k41_ii);
		
		//������ �������� ����
		for(int i = 0; i < 20; i++) {	//20���� �ݺ� �ϴ� ��
			System.out.printf("#3-3 : %d\n", i);		
			
			if(i % 5 == 0) {	// 5�� ����϶� ������ ���� ����
				System.out.println("");
			}
		}
	}

}

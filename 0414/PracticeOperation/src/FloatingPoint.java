
public class FloatingPoint {

	public static void main(String[] args) {
		// #5 �Ҽ��� �ڸ��� �ݿø� ���� ó�� 22.04.14 . csh
		int k41_MyVal = 14 / 5;		//������ ������
		System.out.printf("#5-1 : %d\n", k41_MyVal);
		
		double k41_MyValF = 14 / 5;		// double ������ �����θ� ����ؼ� ���ϴ� ���� �ȳ���.
		System.out.printf("#5-2 : %f\n", k41_MyValF);
		
		k41_MyValF = 14.0 / 5;		//�ڿ� .0�� ���� ���·� ����Ͽ� �Ǽ��� ��� ��.
		System.out.printf("#5-3 : %f\n", k41_MyValF);
		
		k41_MyValF = 14.0 / 5 + 0.5;//�ڿ� �Ҽ����� ���� ���·� ����Ͽ� �Ǽ��� ��� ��.
		System.out.printf("#5-4 : %f\n", k41_MyValF);
		
		k41_MyVal = (int)((14.0)/5+0.5); //int�� ����ȯ�� ����� ������ ������ ������ �̿��Ͽ� �� ����.
		System.out.printf("#5-5 : %d\n", k41_MyVal);
	}

}

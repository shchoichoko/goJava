
public class TestMain2 {
	//#9 �޼ҵ� �����ε� ��� �׽�Ʈ 22.04.20 �ּ���
	
	public static void main(String[] args) {
		Calc1 k41_cal = new Calc1();
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", k41_cal.sum(1, 2));
		System.out.printf("3�� ������ ȣ��� [%d]\n", k41_cal.sum(1, 2, 3));
		System.out.printf("4�� ������ ȣ��� [%d]\n", k41_cal.sum(1, 2, 3, 4));
		System.out.printf("������ ������ ȣ��� [%f]\n", k41_cal.sum(1.3, 2.4));
		
	}
}


public class SwitchCasePrac {

	public static void main(String[] args) {
		// #2 switch/case �� 22.04.15 csh 
		String k41_jumin = "123456-1234567";	//�ֹε�� ��ȣ ���� ���� ���� �� �ʱ�ȭ
		switch(k41_jumin.charAt(7)) {			// .charAt(index number)�� k41_jumin�� ù���ڸ� 0��° �ڸ���� ������ 7��° �ڸ� ���� ���Ѵ�.
		case '1' :								// k41_jumin.charAt(7)�� ���� 1�϶� ���� ����. break�� ���� ������ ������ �����Ѵ�.
			System.out.println("20���� �� �¾ ���� ���");
		case '2' :								// k41_jumin.charAt(7)�� ���� 2�϶� ���� �����ϰ� switch���� �����.						
			System.out.println("20���� �� �¾ ���� ���");
			break;
		case '3' :								// k41_jumin.charAt(7)�� ���� 3�϶� ���� �����ϰ� switch���� �����.	
			System.out.println("20���� �� �¾ ���� ���");
			break;
		case '4' :								// k41_jumin.charAt(7)�� ���� 4�϶� ���� �����ϰ� switch���� �����.
			System.out.println("20���� �� �¾ ���� ���");
			break;
		default:								// k41_jumin.charAt(7)�� ���� 1,2,3,4�� ������ ���� �� �����ϰ� switch���� �����.
			System.out.println("���");
			break;
		}

	}

}

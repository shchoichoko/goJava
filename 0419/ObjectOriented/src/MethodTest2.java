
public class MethodTest2 {
	//#2 ������ �޼���2 22.04.19 �ּ���
	static int k41_iStatic;	//���� ������ ����.
	
	public static void add(int k41_i) {
		k41_iStatic++;	// �������� �� 1����.
		k41_i++;	//�Ű����� �� 1����.
		System.out.printf("add�޼ҵ忡��->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("add�޼ҵ忡��->k41_i=[%d]\n",k41_i);	//1������ä�� ���
		
	}
	
	public static int add2(int k41_i) {
		k41_iStatic++; // �������� �� 1����.
		k41_i++; //�Ű����� �� 1����.
		System.out.printf("add�޼ҵ忡��->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("add�޼ҵ忡��->k41_i=[%d]\n",k41_i);
		return k41_i;	//�� ������ä�� ����.
	}
	
	public static void main(String[] args) {

		int k41_iMain;	//������ ���� ����
		k41_iMain = 1;	//1�� �ʱ�ȭ ����.
		k41_iStatic = 1; //�������� �� 1�� �ʱ�ȭ.
		System.out.printf("*************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k41_iMain=[%d]\n",k41_iMain);
		System.out.printf("*************************************\n");
		
		add(k41_iMain);	//�޼ҵ� ���ο��� ���� 1�� ������Ų ä�� ���
		
		System.out.printf("*************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->k41_iMain=[%d]\n",k41_iMain);
		//�Ű������� �־��� ���� ���� ���� �ʾұ� ������ ���� ��ȭ�� ����.
		System.out.printf("*************************************\n");
		
		k41_iMain = add2(k41_iMain);	//���� �޼ҵ带 ���� �����Ǿ� ����.
		System.out.printf("*************************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->k41_iStatic=[%d]\n",k41_iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->k41_iMain=[%d]\n",k41_iMain);
		// ������ä�� ���ϰ��� ���� �Ŀ� ����߱� ������ ���� �����Ǿ� �ִ�.
		System.out.printf("*************************************\n");
		
		
	}
	

	
}


public class Example4 {
	//#9 ��������3 22.04.15 csh
	public static void main(String[] args) {
		
	for(int  k41_i = 1; k41_i<13; k41_i++) {	//1~12������ ����ϱ� ���� ��
		System.out.printf(" %d�� =>", k41_i);	// ������ ǥ���ϱ� ���� ��
		for(int k41_j = 1; k41_j < 32; k41_j++) {	// 1~31�ϱ��� ǥ�� ���� ��
			System.out.printf("%d, ", k41_j);	
			if((k41_i == 4||k41_i==6||k41_i==9||k41_i==11)&&(k41_j==30)) break;	//4,6,9,11������ 30�ϱ����� ǥ���ϰ� break�� ���� �ش� for���� ����������.
			if(k41_i== 2 && k41_j == 28) break;	//2������ 28�ϱ��� ǥ���ϰ� break�� ���� �ش� for���� ����������.
		}
		System.out.printf("\n");	//������ ���� ����ֱ� ���� ��.
	}

	}
}

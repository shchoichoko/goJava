
public class SinGraph {

	public static void main(String[] args) {
		// #15 sin �Լ� �׷��� 22.04.15 csh 
		double k41_fSin;		// double �������� ����.
		for(int k41_i = 0; k41_i < 360; k41_i++) {	//0~ 359������ ���� ���ϰ� �ݺ�.
			k41_fSin = Math.sin(k41_i * 3.141592/180);		// 
			System.out.printf("%d sin ==> %f\n", k41_i, k41_fSin);
		}
		
		for(int k41_i = 0; k41_i < 360; k41_i++) {	//0~ 359������ ���� ���ϰ� �ݺ�.
			k41_fSin = Math.sin(k41_i * 3.141592/180);	// ���� ���� ���ϱ� ���� (���� * PI/180)�� ���ְ�, Math.sin�� ���� �ش� sin���� �����ش�.
			
			int k41_iSpace = (int)((1.0 - k41_fSin) * 50); // ��ĭ�� �ø��� �뵵. �� ���� ���� ���Ҽ��� ���� �о�����.
			for(int k41_j = 0; k41_j < k41_iSpace; k41_j++) {
				System.out.printf(" ");	// ��ĭ�� ����Ѵ�.
			}
			System.out.printf("*[%f][%d]\n", k41_fSin, k41_iSpace);	//sin ���� ������ ���� ��ĭ���� ����Ѵ�.
		}
		
	}

}

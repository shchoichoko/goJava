
public class operateIntString {

	public static void main(String[] args) {
		//#5 ������ ������ �� 22.04.15 csh
		
		int k41_il;	// ������ ���� ����.
		double k41_iD;	// ������ ���� ����.
		k41_il = 10/3;		// ������ ��� �� ����.
		k41_iD = 10/3.0;	// double �� ����� ���� �Ҽ����� �ٿ���.
		if(k41_il==k41_iD) System.out.println("equal\n");	//k41_il�� ���� k41_iD�� ���� ������ equal �̶�� ���.
		else System.out.printf("Not equal[%f][%f]\n",(double)k41_il,k41_iD); //k41_il�� ���� k41_iD�� ���� �ٸ� ��� Not equal�� ���. 
		
		if( k41_iD == 3.333333) System.out.printf("equal\n");	// k41_iD�� ���� 3.333333�� ��ġ�Ҷ� equal�� ���.
		else System.out.printf("Not equal[3.333333][%f]\n",k41_iD);// k41_iD�� ���� 3.333333�� �ٸ� �� Not equal�� ���.
		
		k41_iD = (int)k41_iD;		// int����ȯ���� �Ҽ��� �Ʒ� ���ڸ� ������ k41_iD�� ����.
		if( k41_il == k41_iD) System.out.printf("equal\n");		// ki41_il �� k41_iD ���� ���� �� equal�� ���
		else System.out.printf("Not equal[%f][%f]\n",(double)k41_il,k41_iD); // ki41_il �� k41_iD ���� ���� ���� �� Not equal�� ���
		
		System.out.printf("int�� �μ�[%d][%f]\n", k41_il,k41_iD);	//printf ���� %d�� int�� ���, %f�� Float������ ���.
		System.out.printf("double�� �μ�[%f][%f]\n",(double)k41_il,k41_iD); //�������̾��� k41_il�� double�� ����ȯ �� %f�� Float�� ���.
		char k41_a = 'c';		//������ ���� k41_a ���� �� �ʱ�ȭ. 
		// (' ' ���� ����, " " ���� ���ڿ��� ����.)
		if(k41_a == 'b')System.out.printf("a�� b�̴�\n");	//k41_a �� �ƽ�Ű �ڵ� ���� 'b' ���� ���ٸ� ��¹����� �����Ѵ�.
		if(k41_a == 'c')System.out.printf("a�� c�̴�\n");	//k41_a �� �ƽ�Ű �ڵ� ���� 'c' ���� ���ٸ� ��¹����� �����Ѵ�.
		if(k41_a == 'd')System.out.printf("a�� d�̴�\n");	//k41_a �� �ƽ�Ű �ڵ� ���� 'd' ���� ���ٸ� ��¹����� �����Ѵ�.
		
		String k41_aa = "abcd";			// ���ڿ� ���� k41_aa ���� �� �ʱ�ȭ.
		if(k41_aa.equals("abcd")) System.out.printf("aa�� abcd�̴�\n");		//k41_aa�� ���ڿ��� "abcd"�� ���ٸ� ��¹����� �����Ѵ�.
		else System.out.printf("aa�� abcd�� �ƴϴ�\n");		//k41_aa�� ���ڿ��� "abcd"�� �����ʴٸ� ��¹����� �����Ѵ�.
		boolean k41_bb =true;	// boolean Ÿ�� ���� ���� �� �ʱ�ȭ.
		if(!!k41_bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n"); //!�� �ι� ���� ������ ���� ���� true�̴�. !�� �ѹ��̸� ����.
		else System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n");	// !!k41_bb�� ���̱� ������ ������� �ʴ´�.
		
	}

}

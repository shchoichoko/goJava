package AboutArray;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
	//	# ArrayList �ǽ��ϱ� 22.04.24 �ּ���
		ArrayList k41_iAL = new ArrayList();
		
		k41_iAL.add("abc");
		k41_iAL.add("abcd");
		k41_iAL.add("efga");
		k41_iAL.add("������0");
		k41_iAL.add("1234");
		k41_iAL.add("12rk34");

		System.out.printf("****************************\n");
		System.out.printf(" ���� ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i, k41_iAL.get(k41_i));
		}
		k41_iAL.set(3, "������");
		System.out.printf("****************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n",k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i , k41_iAL.get(k41_i));
		}
		k41_iAL.remove(4);
		System.out.printf("****************************\n");
		System.out.printf(" ��̸���Ʈ ���� ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i , k41_iAL.get(k41_i));
		}
		k41_iAL.sort(null);
		System.out.printf("****************************\n");
		System.out.printf(" ����Ʈ sort ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i, k41_iAL.get(k41_i));
		}
		k41_iAL.clear();
		System.out.printf("****************************\n");
		System.out.printf(" ���� ���� ArraySize %d \n", k41_iAL.size());
		for(int k41_i = 0; k41_i < k41_iAL.size(); k41_i++) {
			System.out.printf(" ArrayList %d = %s\n", k41_i, k41_iAL.get(k41_i));
		}
		
		
	}

}

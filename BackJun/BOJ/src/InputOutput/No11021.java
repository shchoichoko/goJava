package InputOutput;

import java.util.Scanner;

public class No11021 {

	public static void main(String[] args) {
		//�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�.
		//�׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String str  = "";
		int a = 0, b = 0;
		for(int i = 0; i < t; i ++) {
			str = sc.nextLine();
			a = Integer.parseInt(str.substring(0,1));
			b = Integer.parseInt(str.substring(2,3));
			System.out.println("Case #"+(i+1)+": "+(a+b));
		}
	}

}

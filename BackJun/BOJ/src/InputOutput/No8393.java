package InputOutput;

import java.util.Scanner;

public class No8393 {

	public static void main(String[] args) {
		//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        n = sc.nextInt();
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

}

package InputOutput;

import java.util.Scanner;

public class No10818 {

   public static void main(String[] args) {
      //ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] numArr = new int[N];
      int minNum = 1000001;
      int maxNum = -1000001;
      for(int i = 0; i < N; i ++ ) {
         numArr[i] = sc.nextInt();
         if(minNum >= numArr[i]) {
            minNum = numArr[i];
         }
         if(maxNum <= numArr[i]) {
            maxNum = numArr[i];
         }
      }
      System.out.print(minNum+" "+maxNum);

   }

}
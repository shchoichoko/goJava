package InputOutput;

import java.util.Scanner;

public class SumString {

   public static void main(String[] args) {
      //�Է� ���� ���ڿ� ���� ���ڿ��� �Է� �ް� ��� ���信 �°� ����ϼ���.
      Scanner sc = new Scanner(System.in);
      System.out.println("�� ���� ���ڿ��� �Է��Ͻðڽ��ϱ�?");
      int howManyNumbers = Integer.parseInt(sc.nextLine());
      String inputString = "";
      String result = "Hello ";
      for(int i = 0 ;i < howManyNumbers; i++) {
         System.out.println("��ġ�� ���� "+(i+1)+"��° ���ڸ� �Է����ּ���.");
         inputString = sc.nextLine();
         if(howManyNumbers >0) {
            if(i!=0) {
               result += ",";
            }
            result += inputString;
         }
      }
      result += ".";
      System.out.println(result);
   
   }

}

package InputOutput;

import java.util.Scanner;

public class SumString {

   public static void main(String[] args) {
      //입력 받을 문자열 수와 문자열을 입력 받고 출력 포멧에 맞게 출력하세요.
      Scanner sc = new Scanner(System.in);
      System.out.println("몇 개의 문자열을 입력하시겠습니까?");
      int howManyNumbers = Integer.parseInt(sc.nextLine());
      String inputString = "";
      String result = "Hello ";
      for(int i = 0 ;i < howManyNumbers; i++) {
         System.out.println("합치고 싶은 "+(i+1)+"번째 문자를 입력해주세요.");
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

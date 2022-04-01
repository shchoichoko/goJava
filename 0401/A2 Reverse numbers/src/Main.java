import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reverse(num));
    }
    
    public static int reverse(int num){
        int reverseValue=0;
        while(num!=0){
        	reverseValue= reverseValue * 10 + num % 10;
            num = num / 10;
        }
        return reverseValue;
    }
}

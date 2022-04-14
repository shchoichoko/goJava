
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          HelloWorld hw = new HelloWorld();
          hw.print(1);
          double num = sc.nextInt();
          double medianValue = hw.calculator(num);
          System.out.print("Median : "+medianValue);
    }
    public double calculator(double num){
        double sum=0,mean=0,median=0;
        for(double i = num ; i > 0 ; i --){
            System.out.println((int)i);
            sum += i;
        }
        median = (1+num)/2;
        mean = sum / num;
        System.out.print("Mean : " + mean + ", ");
        return median;
        
    }
    public void print(int order){
        if(order == 1){
            System.out.println("Please input a number");
            System.out.print("->");
        }
    }
}

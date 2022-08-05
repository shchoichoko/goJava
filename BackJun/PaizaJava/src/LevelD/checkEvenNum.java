package LevelD;

import java.util.Scanner;

public class checkEvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        if(first%2!=0) {
        	System.out.println("odd");
        } else {
        	System.out.println("even");
        }
	}

}

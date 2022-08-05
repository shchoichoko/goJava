package LevelD;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        if(first<0) {
        	first=first*-1;
        }
        System.out.println(first);
	}

}

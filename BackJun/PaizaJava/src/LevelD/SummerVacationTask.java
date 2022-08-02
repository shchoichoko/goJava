package LevelD;

import java.util.Scanner;

public class SummerVacationTask {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        int result1 = Integer.parseInt(line);
        int result2 = Integer.parseInt(line2);
        int result3 = 500 - result1 - result2;
        System.out.println(result3);
	}

}

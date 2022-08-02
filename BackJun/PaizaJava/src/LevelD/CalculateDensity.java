package LevelD;

import java.util.Scanner;

public class CalculateDensity {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        int lineToInt = Integer.parseInt(line);
        int lineToInt2 = Integer.parseInt(line2);
        int result = lineToInt * lineToInt2;
        System.out.println(result);
	}

}

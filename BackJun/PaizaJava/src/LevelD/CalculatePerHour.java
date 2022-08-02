package LevelD;

import java.util.Scanner;

public class CalculatePerHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        int result = Integer.parseInt(line);
        int result2 = Integer.parseInt(line2);
        int result3 = result * result2;
        System.out.println(result3);
	}

}

package LevelD;

import java.util.Scanner;

public class MinuteAndSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int lineToInt = Integer.parseInt(line);
        int result = lineToInt * 60;
        System.out.println(result);
	}

}

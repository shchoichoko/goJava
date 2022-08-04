package LevelD;

import java.util.Scanner;

public class SumOfTrianglesDegrees {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println(180-Integer.parseInt(line)-Integer.parseInt(line2));
	}

}

package LevelD;

import java.util.Scanner;

public class ElecFee {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int lineToInt = Integer.parseInt(line);
        int result = lineToInt*25*24 ;
        System.out.println(result);
	}

}

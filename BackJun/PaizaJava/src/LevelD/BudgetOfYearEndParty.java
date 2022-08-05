package LevelD;

import java.util.Scanner;

public class BudgetOfYearEndParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineList = line.split(" ");
        int first = Integer.parseInt(lineList[0]);
        int second = Integer.parseInt(lineList[1]);
        System.out.println((first*6000)+(second*4000));
	}

}

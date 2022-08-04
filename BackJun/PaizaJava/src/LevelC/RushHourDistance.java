package LevelC;

import java.util.Scanner;

public class RushHourDistance {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineList = line.split(" ");
        int first = Integer.parseInt(lineList[0]);
        int second = Integer.parseInt(lineList[1]);
        int result = 0;
        for(int i = 0; i < first-1; i++) {
        	String distance = sc.nextLine();
        	if(Integer.parseInt(distance)<=second) {
        		result +=Integer.parseInt(distance);
        	}
        }
        System.out.println(result);
	}

}

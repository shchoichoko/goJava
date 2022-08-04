package LevelC;

import java.util.Scanner;

public class BoarderLine {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int lineLength = line.length();
        for(int i = 0; i < lineLength+2; i++) {
        	System.out.print("+");
        }
        System.out.println();
        System.out.print("+");
        System.out.print(line);
        System.out.println("+");
        for(int i = 0; i < lineLength+2; i++) {
        	System.out.print("+");
        }
	}

}

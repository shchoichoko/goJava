package reviewArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//User inputs a string and assign it into an array

//User inputs a word and assign it into an array

//Count how many are the input words included in the string
//I go to school. Where are you going?
//o
//5
	public static void main(String[] args) {
		String mainStr = " "; 
		String word = " ";
		mainStr = inputString(1);
		word = inputString(2);
		checkString(mainStr,word);
		
	}

	public static void checkString(String mainStr, String word) {
		String[] strArr = mainStr.split(" ");
		int count = 0;
		for( int i = 0; i < strArr.length; i++) {
			if(strArr[i].contains(word)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static String inputString(int order) {
		Scanner sc = new Scanner(System.in);
		String inputString = " ";
		if(order == 1) {
			System.out.println("Please input any sentense");
			inputString = sc.nextLine();
			return inputString;
		} else if(order == 2) {
			System.out.println("Please input the word want to check");
			inputString = sc.nextLine();
			return inputString;
		} else {
			return "Error!";
		}
	}
}

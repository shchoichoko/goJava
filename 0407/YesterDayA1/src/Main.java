import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] nameArr = new String[5];
		String[] scoreArr = new String[5];
		String temp = " ";
		for(int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			nameArr[i] = arr[0];
			scoreArr[i] = arr[1];
		}
		for(int i = 0; i < 4; i++) {
			for(int j = i+1; j < 4; j++)
			if(Integer.parseInt(scoreArr[i])<Integer.parseInt(scoreArr[j])) {
				temp  = scoreArr[i];
				scoreArr[i] = scoreArr[j];
				scoreArr[j] = temp;
				temp  = nameArr[i];
				nameArr[i] = nameArr[j];
				nameArr[j] = temp;
				i = 0;
			}
		}
		System.out.println(Arrays.toString(nameArr));
		System.out.println(Arrays.toString(scoreArr));
		//park 50 lee 70 Kim 60 Choi 75 Yang 30
	}
}

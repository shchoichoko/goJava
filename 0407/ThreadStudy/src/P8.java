import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// inputs a number and the number defines the size of an array
		// User inputs numbers more than the defined size
		// In this case, this program prints ¡°error¡± and starts again from the beginning,
		// Otherwise, assign the numbers into the array, sort and print them
		//5
		//1 3 4 5 7 8
		//error
		//4
		//1 22 6 12
		//1 6 12 22
		int size = inputNum();
		int check = 0;
		String[] numArr = new String[size];
		while (true) {
			try {
				numArr = inputSet().split(" ");
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Error");
				check = 1;
			}
			if (check == 0) {
				break;
			}
		}
		toList(numArr);
	}

	public static int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number for size of array.");
		int inputSize = sc.nextInt();
		return inputSize;
	}
	
	public static String inputSet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a numberset.");
		String numSet = sc.nextLine();
		return numSet;		
	}
	
	public static void toList(String[] str) {
		List<String> list = Arrays.asList(str);
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}

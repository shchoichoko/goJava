import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToNum {

	public static void main(String[] args) {
		// "one4seveneight" �� 1478
		Scanner sc = new Scanner(System.in);
		String s = "one4seveneight";
		s = s.replace("zero", "0");
		s = s.replace("one", "1");
		s = s.replace("two", "2");
		s = s.replace("three", "3");
		s = s.replace("four", "4");
		s = s.replace("five", "5");
		s = s.replace("six", "6");
		s = s.replace("seven", "7");
		s = s.replace("eight", "8");
		s = s.replace("nine", "9");
		System.out.println(Integer.parseInt(s));
	}

}

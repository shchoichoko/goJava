package Review02;

import java.util.Scanner;

public class CalcuateKoreanAges {

	public static void main(String[] args) {
		String currentDate = print(1);
		String birthday = print(2);
		calculateAge(currentDate,birthday);
	}

	public static void calculateAge(String currentDate, String birthday) {
		int internationalAge = Integer.parseInt(currentDate.substring(0,4))
				-Integer.parseInt(birthday.substring(0,4));
		System.out.printf("%d years old in Korean age\n",internationalAge+1);
		if(Integer.parseInt(currentDate.substring(4,8))>=Integer.parseInt(birthday.substring(4,8))) {
			System.out.printf("%d years old in international age\n",internationalAge);
		} else {
			System.out.printf("%d years old in international age\n",internationalAge-1);
		}
	}
	
	public static String print(int order) {
		Scanner sc = new Scanner(System.in);
		String dates = "";
		if(order == 1) {
			System.out.println("Please input the CurrentDate(ex:20200902) : ");
			dates = sc.nextLine();
		} else {
			System.out.println("Please input the BirthDay(ex:20200902) : ");
			dates = sc.nextLine();
		}
		return dates;
	}
	
	
	
}

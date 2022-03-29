import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the year");
		int inputNum = sc.nextInt();
		System.out.println("Please input the month");
		int inputNum2 = sc.nextInt();	
		int year = inputNum;
		int month = inputNum2-1;
		cal.set(year,month,1);

		int startday = cal.get(cal.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("Sun\tMon\tTues\tWed\tThu\tFri\tSat");
		for (int i = 1; i <= lastday; i++) {
			if (i == 1) {
				for (int j = 1; j < startday; j++) {
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t");
			if (startday % 7 == 0) {
				System.out.println();
			}
			startday++;
		}
	}

}

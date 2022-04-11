import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6_Timer {

	public static void main(String[] args) throws InterruptedException {
		print(checkTime(0));
		print(checkTime(waitTime()));
	}
	
	public static String checkTime(int waitSec) throws InterruptedException {
		SimpleDateFormat form = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String currentTime = form.format(time);
		try {
			Thread.sleep(waitSec*1000);
			if(waitSec>1) {
				System.out.print("time is over ");
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return currentTime;
	}
	
	public static void print(String printThis) {
		System.out.println(printThis);
	}
	
	public static int waitTime() {
		Scanner sc = new Scanner(System.in);
		int waitSec = sc.nextInt();
		return waitSec;
	}

	
}

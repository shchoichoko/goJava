import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		System.out.println(date.getMonth());
		System.out.println(date.getHours());
		System.out.println(date.getDay());
		System.out.println(date.getTime());
		System.out.println(date.getTimezoneOffset());
		
	}

}

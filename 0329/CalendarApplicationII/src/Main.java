import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first date");
		String sDate = sc.nextLine();
		System.out.println("Please input the second date");
		String eDate = sc.nextLine();
		Date sFormat = new SimpleDateFormat("yyyyMMdd").parse(sDate);
		Date eFormat = new SimpleDateFormat("yyyyMMdd").parse(eDate);
		
		long diffSec = (eFormat.getTime()-sFormat.getTime())/1000;
		long diffDate = diffSec/(24*60*60);
		System.out.println(diffDate);
	}

}

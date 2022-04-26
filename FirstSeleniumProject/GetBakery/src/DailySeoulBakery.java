import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DailySeoulBakery {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 파일 저장 하는 코드. 파일명 설정 등등
		FileOutputStream output = new FileOutputStream("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\DailySeoulBakery3.csv");
		String startTime = "20210425";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		Date date = df.parse(startTime);
		cal.setTime(date);
		String[] city = { "서울%20빵%20맛집", "부산%20빵%20맛집", "경기%20빵%20맛집" };
		for (int cityCount = 0; cityCount < city.length; cityCount++) {

			for (int daily = 0; daily < 2; daily++) {
				cal.add(Calendar.DATE, 1);
				String dailyStr = df.format(cal.getTime());
				System.out.println(dailyStr);
				driver.get(
						"https://search.naver.com/search.naver?where=view&query=" + city[cityCount] + "&sm=tab_opt&nso=so%3Ar%2Cp%3Afrom"
								+ dailyStr + "to" + dailyStr + "%2Ca%3Aall&mode=normal&main_q=&st_coll=&topic_r_cat=");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String tt = "";
				int i = 1;
				// GET TEXT

				while (true) {
					try {
						tt = driver.findElement(By.xpath(
								"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
										+ i + "]/div/div/a"))
								.getText();
						System.out.println(tt);
						tt = tt.replaceAll(",", "");
						tt = tt + "," + "\n";
						if (i % 10 == 0) {
							// js.executeScript("window.scrollBy(0,500)");
							js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						output.write(tt.getBytes());
						i++;
						if (i == 125) {
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
						break;
					}
				}
			}
		}
	}
}

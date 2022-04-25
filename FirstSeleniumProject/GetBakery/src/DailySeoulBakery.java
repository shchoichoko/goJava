import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		Calendar cal = Calendar.getInstance();
		
		//파일 저장 하는 코드. 파일명 설정 등등
		FileOutputStream output = new FileOutputStream("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\DailySeoulBakery.csv");
		SimpleDateFormat fm = new SimpleDateFormat("yyyyMMdd");
		
		driver.get("https://search.naver.com/search.naver?where=view&query=%EC%84%9C%EC%9A%B8%20%EB%B2%A0%EC%9D%B4%EC%BB%A4%EB%A6%AC&sm=tab_opt&nso=so%3Ar%2Cp%3Afrom20220424to20220424%2Ca%3Aall&mode=normal&main_q=&st_coll=&topic_r_cat=");
		

		try { 
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tt = "";
		int i = 1;
		//GET TEXT
	
		while(true) {
			try {
			tt = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["+i+"]/div[1]/div/a"))
					.getText();
			System.out.println(tt);
			tt = tt.replaceAll(",", "");
			tt = tt + ","+"\n";
			if(i%10==0) {
			//	js.executeScript("window.scrollBy(0,500)");
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			output.write(tt.getBytes());
			i++;
			if(i==125) {
				break;
			}
			} catch(Exception e) { 
				e.printStackTrace();
				break;
			} finally {
				continue;
			}
			
		}
		
	}

}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
*/

public class GetDistance {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver2\\chromedriver.exe";

	public static void main(String[] args) throws FileNotFoundException {

		try {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 파일 저장 하는 코드. 파일명 설정 등등
		//C:\Users\폴리텍\Desktop\SooHyeok\Data
		FileOutputStream output = new FileOutputStream("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\Data\\SeoulBakery0821.csv");
		String[] city = { "서울 베이커리", "부산 베이커리", "경기도 베이커리" };
		int repeat = 0;

		while (repeat < 3) {
			driver.get("https://www.naver.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).click();
			try { // 검색어 커서!
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			//

			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
					.sendKeys(city[repeat]); // 도시별 빵 맛집 입력
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 엔터 누르기
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
					.sendKeys(Keys.ENTER);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/ul/li[2]/a")).click();
			try { // view 누르기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div/div[3]/a")).click();
			try { // 옵션 누르기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[2]/ul/li[3]/div/div[1]/a[8]"))
					.click();
			try { // 1년 누르기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String tt = "";
			int i = 1;
			// GET TEXT
			try {
				while (true) {
					tt = driver.findElement(By.xpath(
							"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
									+ i + "]/div[1]/div/a"))
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
					if (i == 137) {
						break;
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				repeat++;
				continue;
			}
		}
		}
	

}

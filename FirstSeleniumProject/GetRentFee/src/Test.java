import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
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
		
		//파일 저장 하는 코드. 파일명 설정 등등
		FileOutputStream output = new FileOutputStream("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\out.csv");
		
		
		driver.get("https://vibe.naver.com/today");

		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div/div/a[2]"))
				.click();
		try { // POP UP 클릭!
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		driver.findElement(By.xpath(
				"/html/body/div/div/div/header/div[1]/div[2]/span/input"))
				.click();
		try { // 검색어 커서
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"/html/body/div/div/div/header/div[1]/div[2]/span/input"))
		.sendKeys("다비치");
		try { //다비치 입력
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//엔터 누르기
		driver.findElement(By.xpath(
				"/html/body/div/div/div/header/div[1]/div[2]/span/input"))
		.sendKeys(Keys.ENTER);
		
		try { 
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//GET TEXT
		String tt = driver.findElement(By.xpath(
				"/html/body/div/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/div[1]/span[1]/a/span"))
				.getText();
		System.out.println(tt);
		output.write(tt.getBytes());
		
	}

}

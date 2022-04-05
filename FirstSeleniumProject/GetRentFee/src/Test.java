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
		
		//���� ���� �ϴ� �ڵ�. ���ϸ� ���� ���
		FileOutputStream output = new FileOutputStream("C:\\Users\\������\\Desktop\\����\\Data\\out.csv");
		
		
		driver.get("https://vibe.naver.com/today");

		driver.findElement(By.xpath(
				"/html/body/div/div[2]/div/div/a[2]"))
				.click();
		try { // POP UP Ŭ��!
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		driver.findElement(By.xpath(
				"/html/body/div/div/div/header/div[1]/div[2]/span/input"))
				.click();
		try { // �˻��� Ŀ��
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"/html/body/div/div/div/header/div[1]/div[2]/span/input"))
		.sendKeys("�ٺ�ġ");
		try { //�ٺ�ġ �Է�
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//���� ������
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

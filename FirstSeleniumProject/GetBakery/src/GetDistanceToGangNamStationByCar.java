import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetDistanceToGangNamStationByCar {
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver2\\chromedriver.exe";

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
		
		//���� �б�
		//������ �б� ���� BufferedReader�� ��ü ����
		File k41_f = new File("C:\\Users\\������\\Desktop\\SooHyeok\\GetToGangNamStation\\ApartmentAddressTest(departure).csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));

		//���� �ۼ��� ���� BufferedWriter ��ü�� ����.
		File k41_f1 = new File("C:\\Users\\������\\Desktop\\SooHyeok\\GetToGangNamStation\\DistanceToGangNamStationByCar.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));
		
		String k41_readtxt;
		//���پ� �б����� ���ڿ� ����. 
		List<String> strList = new ArrayList<String>();
		while((k41_readtxt = k41_br.readLine())!=null) {	//
			String[] k41_field = k41_readtxt.split(",");	//�޸� ������ ����
			
			System.out.println(k41_field[0]);
			driver.get("https://map.naver.com/v5/?c=14151139.0541014,4492617.0468526,15,0,0,0,dh");

			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[1]/navbar/perfect-scrollbar/div/div[1]/div/ul/li[2]/a")).click();
			try { // ��ã�� ������
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/ul/li[2]/a")).click();
			try { // �ڵ��� ������
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
					.sendKeys("���� " + k41_field[0]); // ����� �Է�
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ���� ������
			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
			.sendKeys("������"); // ������ �Է�
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// ���� ������
			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			////html/body/div[3]/div/div/div/div[2]/div[2]/a[1]
			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[2]/button[3]")).click();
			try { // ��ã�� ������
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.xpath("/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/directions-summary-item-label/div")).click();
			try { // ���� ������
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			String tt = "";
			String tt2 = "";
			// GET TEXT
			try {

					tt = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[2]/directions-details-result/directions-details-summary-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[1]")).getText();
					System.out.println(tt+"��");
					tt2 = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[2]/directions-details-result/directions-details-summary-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance")).getText();
					System.out.println(tt2);
					tt = tt + "��";
					//tt = tt.replaceAll(",", "");
					tt = k41_field[0] + ","+ tt + "," + tt2 + "," + "\n";
					//output.write(tt.getBytes());
					k41_bw1.write(tt);
					//k41_bw1.newLine();

			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		k41_br.close();
		k41_bw1.close();
	}
}

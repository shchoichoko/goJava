import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//URL ���䱳��� ���ǽ��� �ǰŷ���
//http://rt.molit.go.kr/srh/srh.do?menuGubun=E&srhType=LOC&houseType=1&gubunCode=LAND


public class Main {
	// ���� ���� �迭 
	static String[] city = {"11"};
	// ����� ���� �迭   11680,11740,11305,11500,11620,11215,11530
	static String[] gugun = {"680","740"};
	
	// ����� ������ �� �迭  
	static String [] dong = {"10300", "10800", "10600", "11800", "10500"};
	
	// WebDriver
	static WebDriver driver;
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:/chromedriver/chromedriver.exe";
	

	
	public static void main(String[] args) throws IOException {

		// �ڷγ� �յ� 2�� ���� ���ǽ��� ������ �ŷ���. �ڷγ� Ȯ���� �� �� ����. �����ʹ� �ε��� �ǰŷ���.���� ������.

		//���� ���� �ϴ� �ڵ�. ���ϸ� ���� ���
		FileOutputStream output = new FileOutputStream("C:\\Users\\������\\Desktop\\����\\Data\\out.csv");

		// ũ�Ѹ� �� URL
		String base_url;
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

		// Driver SetUp
		driver = new ChromeDriver();
		base_url = "http://rt.molit.go.kr/srh/srh.do?menuGubun=E&srhType=LOC&houseType=1&gubunCode=LAND"; // ���䱳��� ���ǽ��� �ǰŷ��� //
		driver.get(base_url);
		// ��Ӵٿ� �� ���
		Select drpYear = new Select(driver.findElement(By.name("srhYear")));
		Select drpQuater = new Select(driver.findElement(By.name("srhPeriod")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form[1]/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/label[2]/input")).click(); 
		try {	//������ üũ�ڽ� Ŭ��!
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		drpYear.selectByValue("2019");
		try {	//2021 ��� �ٿ� ��ư Ŭ��!
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drpQuater.selectByValue("1");
		try {	//1�б� ��� �ٿ� ��ư Ŭ��!
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��� �ٿ� �ڵ� Ŭ��
		dropDown();
		
	}
	
	public static void dropDown() {
		
		// ��Ӵٿ� �� ���
		Select drpCity = new Select(driver.findElement(By.name("sidoCode")));
		Select drpGu = new Select(driver.findElement(By.name("gugunCode")));
		Select drpDong = new Select(driver.findElement(By.name("dongCode")));
		
		for(int i = 0; i < city.length; i++) {
			for(int j = 0; j < gugun.length; j++) {
				for(int p = 0; p < dong.length; p++) {
					drpCity.selectByValue(city[i]);
					try {	//���� Ư���� ��� �ٿ� ��ư Ŭ��!
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					drpGu.selectByValue(city[i]+gugun[j]);
					try {	//����  ��� �ٿ� ��ư Ŭ��!
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					drpDong.selectByValue(city[i]+gugun[j]+dong[p]);
					try {	//�� ��� �ٿ� ��ư Ŭ��!
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form[1]/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[11]/td/a/img")).click(); 
					try {	//�˻� Ŭ��
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
	}
	
	
}

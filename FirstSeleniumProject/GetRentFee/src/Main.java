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

//URL 국토교통부 오피스텔 실거래가
//http://rt.molit.go.kr/srh/srh.do?menuGubun=E&srhType=LOC&houseType=1&gubunCode=LAND


public class Main {
	// 도시 구군 배열 
	static String[] city = {"11"};
	// 서울시 구군 배열   11680,11740,11305,11500,11620,11215,11530
	static String[] gugun = {"680","740"};
	
	// 서울시 강남구 동 배열  
	static String [] dong = {"10300", "10800", "10600", "11800", "10500"};
	
	// WebDriver
	static WebDriver driver;
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:/chromedriver/chromedriver.exe";
	

	
	public static void main(String[] args) throws IOException {

		// 코로나 앞뒤 2년 따른 오피스텔 전월세 거래량. 코로나 확진자 수 월 별로. 데이터는 부동산 실거래가.전국 데이터.

		//파일 저장 하는 코드. 파일명 설정 등등
		FileOutputStream output = new FileOutputStream("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\out.csv");

		// 크롤링 할 URL
		String base_url;
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

		// Driver SetUp
		driver = new ChromeDriver();
		base_url = "http://rt.molit.go.kr/srh/srh.do?menuGubun=E&srhType=LOC&houseType=1&gubunCode=LAND"; // 국토교통부 오피스텔 실거래가 //
		driver.get(base_url);
		// 드롭다운 할 요소
		Select drpYear = new Select(driver.findElement(By.name("srhYear")));
		Select drpQuater = new Select(driver.findElement(By.name("srhPeriod")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form[1]/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/label[2]/input")).click(); 
		try {	//전월세 체크박스 클릭!
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		drpYear.selectByValue("2019");
		try {	//2021 드랍 다운 버튼 클릭!
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drpQuater.selectByValue("1");
		try {	//1분기 드랍 다운 버튼 클릭!
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 드롭 다운 자동 클릭
		dropDown();
		
	}
	
	public static void dropDown() {
		
		// 드롭다운 할 요소
		Select drpCity = new Select(driver.findElement(By.name("sidoCode")));
		Select drpGu = new Select(driver.findElement(By.name("gugunCode")));
		Select drpDong = new Select(driver.findElement(By.name("dongCode")));
		
		for(int i = 0; i < city.length; i++) {
			for(int j = 0; j < gugun.length; j++) {
				for(int p = 0; p < dong.length; p++) {
					drpCity.selectByValue(city[i]);
					try {	//서울 특별시 드랍 다운 버튼 클릭!
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					drpGu.selectByValue(city[i]+gugun[j]);
					try {	//구군  드랍 다운 버튼 클릭!
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					drpDong.selectByValue(city[i]+gugun[j]+dong[p]);
					try {	//구 드랍 다운 버튼 클릭!
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form[1]/table/tbody/tr/td/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[11]/td/a/img")).click(); 
					try {	//검색 클릭
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

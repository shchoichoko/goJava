import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
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

public class GetDistanceToGangNamStationByPublicTransport {

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

		// 파일 읽기
		// 파일을 읽기 위한 BufferedReader를 객체 생성
		//File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\GetToGangNamStation\\ApartmentAddress(departure).csv");
		File k41_f = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\GetToGangNamStation\\test01.csv");
		BufferedReader k41_br = new BufferedReader(new FileReader(k41_f));

		// 파일 작성을 위한 BufferedWriter 객체를 생성.
		File k41_f1 = new File(
				"C:\\Users\\폴리텍\\Desktop\\SooHyeok\\GetToGangNamStation\\Result.csv");
		BufferedWriter k41_bw1 = new BufferedWriter(new FileWriter(k41_f1));

		String k41_readtxt;
		// 한줄씩 읽기위한 문자열 생성.
		List<String> strList = new ArrayList<String>();
		while ((k41_readtxt = k41_br.readLine()) != null) { //
			String[] k41_field = k41_readtxt.split(","); // 콤마 단위로 저장

			System.out.println(k41_field[0]+" "+k41_field[1]);
			driver.get("https://map.naver.com/v5/?c=14151139.0541014,4492617.0468526,15,0,0,0,dh");

			driver.findElement(
					By.xpath("/html/body/app/layout/div[3]/div[1]/navbar/perfect-scrollbar/div/div[1]/div/ul/li[2]/a"))
					.click();
			try { // 길찾기 누르기
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				continue;
			}

			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[1]/div/div/div[1]/input"))
					.sendKeys(k41_field[0]+" "+k41_field[1]); // 출발지 입력
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 엔터 누르기
			try {
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[2]/button[2]"))
					.sendKeys(Keys.ENTER);
			} catch(Exception e) {
				e.printStackTrace();
				continue;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys("강남역"); // 도착지 입력
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 엔터 누르기
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[2]/button[2]"))
						.click();
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			try { // 길찾기 누르기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 검색 결과 저장용 변수 선언
			String firstResult = "";
			String secondResult = "";
			String thirdResult = "";
			String result = "";
			String minutes = "";
			// GET TEXT
			try {
				firstResult = driver.findElement(By.xpath(
						"html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-pubtransit/div[1]/div/strong/readable-duration/span[1]"))
						.getText();
				firstResult = firstResult.replaceAll(",", "");
				if (Integer.parseInt(firstResult) < 4) {
					minutes = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-pubtransit/div[1]/div/strong/readable-duration/span[3]"))
							.getText();

					firstResult = k41_field[0]+"," + k41_field[1] + "," + firstResult + "시간" + minutes + "분,";
				} else {
					firstResult = k41_field[0]+"," + k41_field[1] + "," + firstResult + ",";
				}
				System.out.println("강남 :" + firstResult);

			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 자동차로 바꾸기!
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[2]/a"))
					.click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// GET TEXT 차량 이동 부분
			String carFirst = "";
			String distance = "";
			try {
				carFirst = driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[1]"))
						.getText();
				carFirst = carFirst.replaceAll(",", "");
				if (Integer.parseInt(carFirst) < 3) {
					// 1시간 넘어갔을 때, 분 구하기
					minutes = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[3]"))
							.getText();

					// 거리 구하기
					distance = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance"))
							.getText();
					carFirst = carFirst + "시간" + minutes + "분," + distance + ",";
				} else {
					distance = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance"))
							.getText();
					carFirst = carFirst + "," + distance + ",";
				}
				System.out.println("강남역(차량이동) 소요시간 및 거리 :" + carFirst);

			} catch (Exception e) {
				e.printStackTrace();
			}
			// 다시 대중교통으로 돌아가기
			/// html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[1]/a
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[1]/a"))
					.click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 도착 검색 부분 누르기
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.click();
			//텍스트 클리어 해주기
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.clear();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 시청역 검색
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys("서울시청역"); // 도착지 입력
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 엔터 누르기
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//// html/body/div[3]/div/div/div/div[2]/div[2]/a[1]
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[2]/button[2]"))
					.click();
			try { // 길찾기 누르기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// GET TEXT
			try {
				secondResult = driver.findElement(By.xpath(
						"html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-pubtransit/div[1]/div/strong/readable-duration/span[1]"))
						.getText();
				secondResult = secondResult.replaceAll(",", "");
				if (Integer.parseInt(secondResult) < 3) {
					minutes = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-pubtransit/div[1]/div/strong/readable-duration/span[3]"))
							.getText();

					secondResult = secondResult + "시간" + minutes + "분,";
				} else {
					secondResult = secondResult + ",";
				}
				System.out.println("시청역 :" + secondResult);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 자동차로 바꾸기!
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[2]/a"))
					.click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// GET TEXT 차량 이동 부분
			String carSecond = "";
			try {
				carSecond = driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[1]"))
						.getText();
				carSecond = carSecond.replaceAll(",", "");
				if (Integer.parseInt(carSecond) < 3) {
					// 1시간 넘어갔을 때, 분 구하기
					minutes = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[3]"))
							.getText();

					// 거리 구하기
					distance = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance"))
							.getText();
					carSecond = carSecond + "시간" + minutes + "분," + distance + ",";
				} else {
					distance = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance"))
							.getText();
					carSecond = carSecond + "," + distance + ",";
				}
				System.out.println("시청역(차량이동) 소요시간 및 거리 :" + carSecond);

			} catch (Exception e) {
				e.printStackTrace();
			}
			// 다시 대중교통으로 돌아가기
			/// html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[1]/a
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[1]/a"))
					.click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 도착 검색 부분 누르기
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.click();
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.clear();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				continue;
			}
			// 광화문역 검색
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys("광화문역"); // 도착지 입력
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 엔터 누르기
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div[1]/directions-search/div[1]/directions-search-box[2]/div/div/div[1]/input"))
					.sendKeys(Keys.ENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//// html/body/div[3]/div/div/div/div[2]/div[2]/a[1]
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/directions-search/div[2]/button[2]"))
					.click();
			try { // 길찾기 누르기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// GET TEXT
			try {
				thirdResult = driver.findElement(By.xpath(
						"html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-pubtransit/div[1]/div/strong/readable-duration/span[1]"))
						.getText();
				thirdResult = thirdResult.replaceAll(",", "");
				if (Integer.parseInt(thirdResult) < 3) {
					minutes = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-pubtransit/div[1]/div/strong/readable-duration/span[3]"))
							.getText();

					thirdResult = thirdResult + "시간" + minutes + "분,";
				} else {
					thirdResult = thirdResult + ",";
				}
				System.out.println("광화문역 : " + thirdResult);

			} catch (Exception e) {
				e.printStackTrace();
			}
			// 자동차로 바꾸기!
			driver.findElement(By.xpath(
					"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/div/ul/li[2]/a"))
					.click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// GET TEXT 차량 이동 부분
			String carThird = "";
			try {
				carThird = driver.findElement(By.xpath(
						"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[1]"))
						.getText();
				carThird = carThird.replaceAll(",", "");
				if (Integer.parseInt(carThird) < 3) {
					// 1시간 넘어갔을 때, 분 구하기
					minutes = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/strong/readable-duration/span[3]"))
							.getText();

					// 거리 구하기
					distance = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance"))
							.getText();
					carThird = carThird + "시간" + minutes + "분," + distance + ",";
				} else {
					distance = driver.findElement(By.xpath(
							"/html/body/app/layout/div[3]/div[2]/shrinkable-layout/div/directions-layout/directions-result/div[1]/directions-summary-list/directions-hover-scroll/div/ul/li[1]/directions-summary-item-car/directions-summary-item-car-card/div[1]/div[1]/span/readable-distance"))
							.getText();
					carThird = carThird + "," + distance + ",";
				}
				System.out.println("광화문역(차량이동) 소요시간 및 거리 :" + carThird);
				result = firstResult + secondResult + thirdResult + carFirst + carSecond + carThird +"\n";
				
				k41_bw1.write(result);
				
				System.out.println(result);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		k41_br.close();
		k41_bw1.close();

		// 파일 저장 하는 코드. 파일명 설정 등등
		// C:\Users\폴리텍\Desktop\SooHyeok\GetToGangNamStation

	}

}

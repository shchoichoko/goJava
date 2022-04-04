package project;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class movie_watcha {

    //WebDriver
    private static WebDriver driver;
    
    //Properties
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "C:/chromedriver/chromedriver.exe";
    
    //Å©·Ñ¸µ ÇÒ URL
    private static String base_url;
   
      
   public static void main(String[] args) throws IOException {

      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

      // Driver SetUp
      driver = new ChromeDriver();
      base_url = "https://pedia.watcha.com/ko-KR"; //¿ÓÃ­ Á¢¼Ó //
      driver.get(base_url);
      
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/button/span")).click(); //ÆË¾÷Ã¢ ´Ý±â//
      try {
         Thread.sleep(3000);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      driver.findElement(By.xpath("/html/body/div/div/div[1]/section/div/section/div[1]/div[2]/div/div[1]/div/div/ul/li[1]/a/div[1]/div[1]/img")).click(); //1À§ Æ÷½ºÅÍ Å¬¸¯//
      try {
         Thread.sleep(3000);	//3sec term
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
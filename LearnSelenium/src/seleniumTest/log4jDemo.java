package seleniumTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4jDemo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(log4jDemo.class);
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		log.info("URL Launched");
		
		
		String title1=driver.getTitle();
		System.out.println("Title is:"+title1);
		log.warn("Check Title");
		
		if(title1.equals("Google"))
		{
			System.out.println("correct title");
			log.info("The url is correct");
		}
		else
		{
			System.out.println("incorrect title");
			log.error("The url is not correct");
		}
		

	}

}

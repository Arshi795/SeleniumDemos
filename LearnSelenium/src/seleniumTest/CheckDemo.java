package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Jar Files\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		boolean checkDisplay=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkDisplay);
		boolean checkEnable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkEnable);
		
		if(checkDisplay&&checkEnable==true)
		{
			driver.findElement(By.id("Email")).sendKeys("arshiyamehaboob9@gmail.com");
		}

	}

}

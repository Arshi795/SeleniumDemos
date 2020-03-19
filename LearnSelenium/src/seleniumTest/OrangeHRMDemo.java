package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class OrangeHRMDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		WebDriverWait Mywait1=new WebDriverWait(driver,10);
		Mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		driver.findElement(By.id("welcome")).click();
		//Thread.sleep(3000);
		
		WebDriverWait Mywait2=new WebDriverWait(driver,10);
		Mywait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));

		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'WebTable')]"));
		driver.findElement(By.xpath("//b[contains(text(),'Performance')]//parent::a//parent::li//preceding-sibling::a//child::b[contains(text(),'Performance')]"));
		

	}

}

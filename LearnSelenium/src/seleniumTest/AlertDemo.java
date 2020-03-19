package seleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert1=driver.switchTo().alert();
		String alert1msg1=driver.switchTo().alert().getText();
		System.out.println(alert1msg1);
		Thread.sleep(3000);
		alert1.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert2=driver.switchTo().alert();
		String alertmsg2=driver.switchTo().alert().getText();
		System.out.println(alertmsg2);
		Thread.sleep(3000);
		alert2.sendKeys("Hi Tester");
		Thread.sleep(3000);
		alert2.accept();
		Thread.sleep(3000);
		
		

		
		
		
		
		

	}

}

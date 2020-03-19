package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Arshiya");
		driver.findElement(By.id("LastName")).sendKeys("Mehaboob");
		driver.findElement(By.id("Email")).sendKeys("arshi@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Demo@07");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Demo@07");
		//driver.findElement(By.id("register-button")).click();
		
		String expectedresult="Demo Web Shop. Register";
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect");
		}
		//driver.findElement(By.linkText("Log out")).click();
		

	}

}

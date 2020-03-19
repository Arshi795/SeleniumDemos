package seleniumTest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		
		/*List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("No.of links:" +links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println("Links are"+links.get(i).getText());
		}
		*/
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No.of iframes are:" +frames.size());
		for(int i=0;i<frames.size();i++)
		{
			System.out.println("iframes are"+frames.get(i).getText());
		}
		
		//int size=driver.findElements(By.tagName("iframe")).size();
		//System.out.println(size);
		
		
		

	}

}

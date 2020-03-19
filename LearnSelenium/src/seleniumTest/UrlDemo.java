package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		String title=driver.getTitle();
		System.out.println(title);
		int titleLength=title.length();
		System.out.println(titleLength);
		
		String actualUrl="http://demowebshop.tricentis.com/login";
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		if(actualUrl.equals(currentUrl))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");

		}
		
		String source=driver.getPageSource();
		int sourcelength=source.length();
		System.out.println(sourcelength);
		
		driver.close();
		
		
		/*String expectedresult="Demo Web Shop. Register";
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect");
		}*/

	}

}

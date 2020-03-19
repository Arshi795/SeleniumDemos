package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationRegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Arshi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Meha");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Golden House,D.No:1-1-29,Burripalem Road,Nazerpet,Tenali");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("arshi@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("8019591208");
		
		
		//driver.findElement(By.xpath("//label[1]//input[1]")).click();
		/*WebElement r1=driver.findElement(By.xpath("//label[1]"));
		WebElement r2=driver.findElement(By.xpath("//label[2]"));
		r1.click();
		r2.click();*/
		
		driver.findElement(By.xpath("//*[@name='radiooptions' and @value='Male']")).click();

		//WebElement check1=driver.findElement(By.id("checkbox1"));
		//WebElement check2=driver.findElement(By.id("checkbox2"));
		//check1.click();
		//check2.click();
		/*driver.findElement(By.id("checkbox3")).click();
		driver.findElement(By.id("checkbox1")).click();*/
		
		//driver.findElement(By.xpath("//*[@id='checkbox1'][@type='checkbox]")).click();
		
		/*List<WebElement> ListOfCheckBoxes = driver.findElements(By.xpath("//input[@id='checkbox']"));
		  System.out.println("Number of check boxes pesent are: "+ListOfCheckBoxes.size());
		  
		  for(int i=0; i< ListOfCheckBoxes.size() ; i++) {
		   if(ListOfCheckBoxes.get(i).getAttribute("id").equalsIgnoreCase("Movies")){
		    ListOfCheckBoxes.get(i).click();
		   }
		       }*/
		
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<elements.size();i++){
		    elements.get(i).click();
		}
		   
		  
		
		
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//section[@id='section']//li[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bulgarian')]")).click();

		
		/*WebElement mySel=driver.findElement(By.xpath("//div[@id='msdd']"));
		Select mySelect=new Select(mySel);
		List<WebElement> opts=mySelect.getOptions();
		for(WebElement opt:opts)
		{
			System.out.println(opt.getText());
		}*/
		
		Select dropdown=new Select(driver.findElement(By.id("Skills")));
		dropdown.selectByVisibleText("Adobe Photoshop");
		
		Select c1=new Select(driver.findElement(By.id("countries")));
		c1.selectByVisibleText("Afghanistan");
		
		//driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		//driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
		//driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();

		//Select con=new Select(driver.findElement(By.xpath("//span[@id='select2-country-container']")));
		//con.selectByIndex(3);		
		
		//List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
		
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.xpath("//div[13]")).click();;
		
		
		Select yr=new Select(driver.findElement(By.id("yearbox")));
		yr.selectByIndex(80);
		
		Select month=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByIndex(9);
		List<WebElement> monthcount=month.getOptions();
		System.out.println(monthcount.size());
		for(int i=0;i<monthcount.size();i++)
		{
			System.out.println(monthcount.get(i).getText());
		}
		
		Select year=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		year.selectByValue("1995");
		List<WebElement> yearcount=year.getOptions();
		System.out.println(yearcount.size());
		for(int i=0;i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText());
		}
		
		Select day=new Select(driver.findElement(By.id("daybox")));
		day.selectByIndex(7);
		List<WebElement>daycount=day.getOptions();
		System.out.println(daycount.size());
		for(int i=0;i<daycount.size();i++)
		{
			System.out.println(daycount.get(i).getText());
		}
		
		
		
		/*Select day=new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		day.selectByIndex(7);
		*/
		
		
		
		
		
		//driver.findElement(By.id("yearbox")).sendKeys("1995");
		//driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("September");
		//driver.findElement(By.id("daybox")).sendKeys("7");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Auto@07");
		driver.findElement(By.id("secondpassword")).sendKeys("Auto@07");
		
		
		//driver.quit();
	}

}

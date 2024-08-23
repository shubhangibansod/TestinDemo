import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SElBasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();  
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		/* System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getPageSource());
		 driver.navigate().to("https://www.geeksforgeeks.org/");
		 driver.findElement(By.linkText("Data Structures")) 
         .click(); 
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();*/
		 
		WebElement name =driver.findElement(By.id("user-message"));
		name.sendKeys("Hello");
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Demo Home")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
	}

}

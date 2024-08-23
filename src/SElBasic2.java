import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SElBasic2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();  
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		 Thread.sleep(1000);
		 WebElement uname = driver.findElement(By.name("username"));
		 System.out.println(uname.getAttribute("name"));
		 uname.sendKeys("Admin");
		 System.out.println(uname.getText());
		 System.out.println(uname.isDisplayed());
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		System.out.println( driver.findElement(By.xpath("//button[@type='submit']")).getText());
		
	}

}

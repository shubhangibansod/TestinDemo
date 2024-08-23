import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		//scrolling
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//send text
		WebElement textbox = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','John')", textbox);
		
		//click action
		
		//WebElement btn = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
		//js.executeScript("arguments[0].click();", btn);
		Thread.sleep(3000);
		
		//Scrolling the page
		//js.executeScript("window.scrollBy(0,250)", "");
		
		//ScrollIntoView
		
		WebElement date = driver.findElement(By.id("datepicker"));
		js.executeScript("arguments[0].scrollIntoView", date);
		
		
	}

}

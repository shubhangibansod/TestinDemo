import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		//scrolling
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement btn = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
		js.executeScript("arguments[0].click();", btn);
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("ParentWindow:"+parentWindow);
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle :handles){
			System.out.println(handle);
			driver.switchTo().window(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			driver.findElement(By.name("search")).sendKeys("Laptop");
		
			//driver.close();
		}
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.id("name")).sendKeys("John");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor js  = (JavascriptExecutor) driver;
//		WebElement btn = driver.findElement(By.id("newWindowBtn"));
//		js.executeScript("arguments[0].scrollIntoView();", btn);
//		btn.click();
//		String parentWindow = driver.getWindowHandle();
//		System.out.println("parentWindow:"+parentWindow);
//		Set<String> handles = driver.getWindowHandles();
//		for (String handle : handles) {
//			
//			if(!parentWindow.equalsIgnoreCase(handle)) {
//				driver.switchTo().window(handle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("Nitesh");
//				driver.findElement(By.id("lastName")).sendKeys("Kumar");
//				driver.close();
//					
//			}
//			
//		}
//		driver.switchTo().window(parentWindow);
//		
//		driver.findElement(By.id("name")).sendKeys("ready");
//		Thread.sleep(2000);

	}

}

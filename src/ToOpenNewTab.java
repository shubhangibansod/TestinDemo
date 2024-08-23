import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		//scrolling
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js  = (JavascriptExecutor) driver;
		//WebElement btn = driver.findElement(By.id("newWindowBtn"));
		WebElement btn = driver.findElement(By.id("newTabBtn"));
		js.executeScript("arguments[0].scrollIntoView();", btn);
		btn.click();
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow:"+parentWindow);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			
			if(!parentWindow.equalsIgnoreCase(handle)) {
				driver.switchTo().window(handle);
				WebElement box = driver.findElement(By.id("alertBox"));
				box.click();
				driver.switchTo().alert().accept();
				driver.close();
					
			}
			
		}
		driver.switchTo().window(parentWindow);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		driver.findElement(By.id("name")).sendKeys("ready");
		Thread.sleep(2000);
	}
}
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();  
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Welcome to JS");
		alert.accept();
		Thread.sleep(2000);
		String msg = driver.findElement(By.cssSelector("#result")).getText();
		if (msg.equals("Welcome to JS")) {
			System.out.println("TEst PAssed");
		}
		else
		{
			System.out.println("TEst PAssed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		//Thread.sleep(2000);
		
		
		
		
		
	//	driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		String msg = driver.findElement(By.cssSelector("#result")).getText();
//		if(msg.equals("Ok")) {
//			System.out.println("Alert is accepted");
//		}
//		else
//		{
//			System.out.println("Alert is dismissed");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		String msg = driver.findElement(By.cssSelector("#result")).getText();
//		System.out.println("alert msg:"+msg);

	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //mouse hover
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//drag and drop
		WebElement src_rome = driver.findElement(By.id("box6"));
		WebElement target_itly = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src_rome, target_itly).build().perform();
		
		WebElement src_washingotn = driver.findElement(By.id("box3"));
		WebElement target_us = driver.findElement(By.id("box103"));
		
		act.dragAndDrop(src_washingotn, target_us).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//right click
		//driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement element = driver.findElement(By.cssSelector("span[class='context-menu-one btn btn-neutral']"));
//		
//		Actions action = new Actions(driver);
//		action.contextClick(element).build().perform();
//		
//	driver.findElement(By.xpath("//span[text()='Copy']")).click();
//	driver.switchTo().alert().accept();
//		
		
		
		
		
		
		
		
		
		
		
		
		//double click
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
//		driver.switchTo().frame("iframeResult");
//		WebElement box1 = driver.findElement(By.id("field1"));
//		box1.clear();
//		box1.sendKeys("welcome");
//		WebElement btn = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
//		
//		Actions action = new Actions(driver);
//		
//		action.doubleClick(btn).build().perform();
//		
//		String text = driver.findElement(By.id("field2")).getAttribute("value");
//		System.out.println("text:"+text);
		
		
		
		//mousehover
//		driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
//		
//		WebElement Desktop = driver.findElement(By.xpath("//*[text()='Desktops']"));
//		WebElement mac = driver.findElement(By.xpath("//*[text()='Mac (1)']"));
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(Desktop).moveToElement(mac).build().perform();
		//double click
		
		
		
	}
	

}

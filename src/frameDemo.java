import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		//scrolling
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement findElement1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
	
		//this is frame1
		driver.switchTo().frame(findElement1);
		WebElement box1 = driver.findElement(By.name("mytext1"));
		box1.sendKeys("this is frame 1");
		driver.switchTo().defaultContent();
		
		//frame 2
		WebElement findElement2= driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
		driver.switchTo().frame(findElement2);
		WebElement box2 = driver.findElement(By.name("mytext2"));
		box2.sendKeys("this is frame 2");
		driver.switchTo().defaultContent();
		
		//nested frame
		WebElement findElement3= driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
		driver.switchTo().frame(findElement3);
		WebElement box3 = driver.findElement(By.name("mytext3"));
		box3.sendKeys("this is frame 3");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector(".vd3tt")).click();
		
		
		
		
	}

}

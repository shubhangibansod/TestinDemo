import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExcutorEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		//scrolling
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement search = driver.findElement(By.id("small-searchterms"));
		js.executeScript("arguments[0].setAttribute('value','laptop')", search);
		
//		WebElement btn = driver.findElement(By.cssSelector(".search-box-button"));
//		js.executeScript("arguments[0].click()", btn);
		//Thread.sleep(2000);
		//scroll down page by pixel
		//js.executeScript("window.scrollBy(0,300)", "");
		
		//WebElement txt = driver.findElement(By.xpath("//*[text()='Community poll']"));
		//js.executeScript("arguments[0].scrollIntoView();", txt);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		WebElement name = driver.findElement(By.id("name"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','John')", name);
//		
//		WebElement btn =driver.findElement(By.id("male"));
//		js.executeScript("arguments[0].scrollIntoView", btn);
//		js.executeScript("arguments[0].click()", btn);
//		
		

	}

}

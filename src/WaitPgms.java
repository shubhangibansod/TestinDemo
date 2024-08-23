import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitPgms {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement uname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		uname.sendKeys("Admin");
		WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		pwd.sendKeys("Admin123");
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		login.click();
		
		  Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)                              
		            .withTimeout(Duration.ofSeconds(10))            
		            .pollingEvery(Duration.ofSeconds(2))            
		            .ignoring(NoSuchElementException.class);  
		  
		    WebElement username = wait1.until(new   
		Function<WebDriver, WebElement>(){      
		        public WebElement apply(WebDriver driver ) {  
		            return driver.findElement(By.name("username"));  
		        }  
		    }); 
		    username.sendKeys("Admin");
		
		//loctors
		
		
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//name
		driver.findElement(By.name("search")).sendKeys("MacBook");
		//id ,to check if logo is displayed
		System.out.println("To check if the logo is displayed on page"+driver.findElement(By.id("logo")).isDisplayed());
		//linktext and partial link text
		
		driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Soft")).click();
		
		List<WebElement> headerlink = driver.findElements(By.className("nav-item"));
		System.out.println("header link:"+headerlink.size());
		
		List<WebElement> link = driver.findElements(By.tagName("img"));
		System.out.println("images sze:"+link.size());
		//css selector
		driver.get("https://demo.nopcommerce.com/");

		//tag id      tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class   tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		
		//tag attribute   tag[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		driver.findElement(By.cssSelector("[placeholder^='Search']")).sendKeys("T-Shirts");
		
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");

	
}}

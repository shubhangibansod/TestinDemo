import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {
	
	static void selectFutureDate(WebDriver driver,String month ,String date,String year) {
		
		//selecting month and year
				while(true) {
				String actuaMonth = driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText();
				String actualYear = driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText();
				
				if(actuaMonth.equals(month) && actualYear.equals(year) ) {
					
					break;
				}
				
				driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
				//driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']")).click();
				
				}
				
				//dates
				
				List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
				
				for(WebElement dt :dates ) {
					
					if(dt.getText().equals(date)) {
						dt.click();
					}
				}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//method 1
		//driver.findElement(By.id("datepicker")).sendKeys("08/21/2024");
		
		driver.findElement(By.id("datepicker")).click();
		
		//method 2
		
		String month = "December";
		String date = "22";
		String year = "2024";
		
		selectFutureDate(driver,month,date,year);

	}

}

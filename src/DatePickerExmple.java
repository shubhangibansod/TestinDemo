import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExmple {

	static void selectFutureDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String currentMonth = driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText(); // actual
																														// month
			String currentYear = driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText(); // actual
																													// year
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			 driver.findElement(By.cssSelector("a[title='Next']")).click();
			//driver.findElement(By.cssSelector("a[title='Prev']")).click();
		}

		// select date

		List<WebElement> dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

		for (WebElement dt : dates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		// method 1
		// driver.findElement(By.id("datepicker")).sendKeys("08/03/2024"); mm/date/yyyy

		// Method2 : using date picker
		driver.findElement(By.id("datepicker")).click();

		String year = "2024";
		String month = "November";
		String date = "21";

		// select future date
		selectFutureDate(driver, year, month, date);

	}

}

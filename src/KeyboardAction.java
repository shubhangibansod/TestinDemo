import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		//scrolling
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement box = driver.findElement(By.id("small-searchterms"));
		Actions ac = new Actions(driver);
		ac.keyDown(box,Keys.SHIFT).sendKeys("laptop").keyUp(Keys.SHIFT).build().perform();
	}

}

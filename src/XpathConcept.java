import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
			//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
	}

}

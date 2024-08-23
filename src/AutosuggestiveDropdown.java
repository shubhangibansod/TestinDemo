import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies(); //deletes all the cookies in your browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");//Search box
		Thread.sleep(5000);
		
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			
		
		System.out.println(list.size());
		
		for(WebElement l : list) {
			System.out.println(l.getText());
			String text = l.getText();
			if(text.equals("selenium")) {
				l.click();
				break;
			}
		}
		

	}

}

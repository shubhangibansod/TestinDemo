import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host ="localhost";
		String port ="3306";
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QAdb", "root", "Root@123");
		Statement S = connection.createStatement();
		ResultSet rs = S.executeQuery("select * from EmpInfo where name='Sam'");
		while(rs.next()) {
			WebDriver driver= new ChromeDriver();

			driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys(rs.getString("name"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("id"));
			driver.findElement(By.id("Login"));
	
		}
	}

}


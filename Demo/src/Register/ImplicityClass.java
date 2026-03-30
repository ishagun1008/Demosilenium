
package Register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
        
        
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		// Implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstName")).sendKeys("test");
		
	}

}
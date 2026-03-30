package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class telecomNeg {

	public telecomNeg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FirefoxDriver driver = new FirefoxDriver();

	        driver.get("https://demo.guru99.com/telecom/addcustomer.php");
	      
	        driver.findElement(By.name("fname")).sendKeys("123456@#$");
	        driver.findElement(By.name("lname")).sendKeys("@#$123455");
	        driver.findElement(By.name("emailid")).sendKeys("Ishagun110011hmail#com");
	        driver.findElement(By.name("addr")).sendKeys("!@#$@#$%^&*(");
	        driver.findElement(By.name("telephoneno")).sendKeys("QWERTYUIOSDFGJKLZXCVBNM<");
	        driver.findElement(By.name("submit")).click();
	}

}

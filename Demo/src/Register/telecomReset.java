package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class telecomReset {

	public telecomReset() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();

	        driver.get("https://demo.guru99.com/telecom/addcustomer.php");
	        driver.findElement(By.xpath("//label[@for='done']")).click();
	        driver.findElement(By.name("fname")).sendKeys("Shagun");
	        driver.findElement(By.name("lname")).sendKeys("Thakur");
	        driver.findElement(By.name("emailid")).sendKeys("Ishagun110011@gmail.com");
	        driver.findElement(By.name("addr")).sendKeys("street143,mohali,punjab,140308,india");
	        driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
	        driver.findElement(By.className("alt")).click();
	}

}

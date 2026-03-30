package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class telecomblankCase {

	public telecomblankCase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver	=new ChromeDriver();

		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
	   driver.findElement(By.name("submit")).click();
	}

	    }


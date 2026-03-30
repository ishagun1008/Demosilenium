package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   FirefoxDriver driver = new FirefoxDriver();
	        
	        driver.get("https://demo.guru99.com/test/newtours/register.php");


	        Select dropdown  = new Select(driver.findElement(By.name("country")));
	        		//dropdown.selectByVisibleText("ALGERIA");
	        dropdown.selectByVisibleText("ARGENTINA");
	    
	}
	
	}
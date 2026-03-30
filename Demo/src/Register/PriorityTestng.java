package Register;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PriorityTestng {

		// TODO Auto-generated constructor stub
		 @Test(priority=0)
		    public void testMethod() {
		  	 FirefoxDriver driver = new FirefoxDriver();

		      driver.get("https://demo.guru99.com/insurance/v1/register.php");

		    }
			
			       	@Test(priority=1)
			       	public void Openbrowser(){
			       		
			       		ChromeDriver driver = new ChromeDriver();
			       		
			       		driver.get("https://www.facebook.com/login.php/");
			       		
			       	}
			       	
					
			       	@Test(priority=2)
			       	public void testMethod1(){
			       		
			       		ChromeDriver driver = new ChromeDriver();
			       		
			       		driver.get("https://www.nike.in/");
			       		
			   
	}
}

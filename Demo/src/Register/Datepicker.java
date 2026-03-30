package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Datepicker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver	= new ChromeDriver();
       
		driver.get("https://demo.guru99.com/test/");
		

		WebElement date = driver.findElement(By.name("bdaytime"));
		date.clear();
		date.sendKeys("06/30/2000");
		date.sendKeys(Keys.TAB);
		date.sendKeys("0424AM");
		
	}

}
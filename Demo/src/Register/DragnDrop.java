
package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.linkText("BANK"));
		 
		WebElement to = driver.findElement(By.id("bank"));	 

		builder.dragAndDrop(from, to).perform();

		Actions Builder1 = new Actions(driver);
		
		WebElement from1=driver.findElement(By.linkText("SALES"));
		
		WebElement to1 =driver.findElement(By.id("loan"));
		
		Builder1.dragAndDrop(from1, to1).perform();

		Actions Builder2 = new Actions(driver);
		WebElement from2 =driver.findElement(By.id("fourth"));
		WebElement to2 =driver.findElement(By.id("amt7"));
		Builder2.dragAndDrop(from2, to2).perform();	
        Actions Builder3 = new Actions(driver);	
		WebElement from3 =driver.findElement(By.id("fourth"));    
		WebElement to3 =driver.findElement(By.id("amt8"));	
		Builder3.dragAndDrop(from3, to3).perform();
	}

}
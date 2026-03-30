package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickCode {

	public RightClickCode() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        Actions action = new Actions(driver);
	        WebElement link = driver.findElement(By.xpath ("/html[1]/body[1]/span[1]"));
	        action.contextClick(link).perform();

	}

}

package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class telecomePosi {
	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	       
	        driver.get("https://demo.guru99.com/telecom/index.html");

	        driver.findElement(By.cssSelector(
	                "#one > div > div.flex-item.left > div:nth-child(1) > h3 > a"
	        )).click();

	        driver.findElement(By.xpath("//label[@for='done']")).click();

	        driver.findElement(By.name("fname")).sendKeys("Shagun");
	        driver.findElement(By.name("lname")).sendKeys("Thakur");
	        driver.findElement(By.name("emailid")).sendKeys("Ishagun110011@gmail.com");
	        driver.findElement(By.name("addr")).sendKeys("Street 143, Mohali, Punjab, 140308, India");
	        driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
	        driver.findElement(By.name("submit")).click();
	        System.out.println("Current URL: " + driver.getCurrentUrl());
	        driver.quit();
	    }
	}

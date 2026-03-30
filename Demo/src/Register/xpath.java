package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

    public static void main(String[] args) {
       
        ChromeDriver driver = new ChromeDriver();
        
       
        driver.get("https://demo.guru99.com/test/newtours/register.php");
      
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("shagun");
    
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("thakur");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
 
    }
}
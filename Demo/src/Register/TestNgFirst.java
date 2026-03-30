package Register;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestNgFirst {

    @Test
    public void testMethod() {
  	  ChromeDriver driver = new ChromeDriver();

      driver.get("https://demo.guru99.com/insurance/v1/register.php");

      driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/input[1]")).sendKeys("shagun");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[1]/input[1]")).sendKeys("thakur");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[2]/input[1]")).sendKeys("1234567890");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[3]/select[1]")).sendKeys("1940");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[4]/input[1]")).click();
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[5]/select[1]")).sendKeys("3");  
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[2]/div[6]/select[1]")).sendKeys("student");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[4]/div[1]/input[1]")).sendKeys("Sec79,Mohali near cp67,Punjab");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[4]/div[2]/input[1]")).sendKeys("Mohali");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[4]/div[3]/input[1]")).sendKeys("INDIA");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[4]/div[4]/input[1]")).sendKeys("140308");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[5]/div[1]/input[1]")).sendKeys("shagt117788@hotmail.com");  
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[5]/div[2]/input[1]")).sendKeys("1234qwertY");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[5]/div[3]/input[1]")).sendKeys("1234qwertY");
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/div[5]/input[2]")).click();
    }
	
	       	@Test
	       	public void Openbrowser(){
	       		
	       		ChromeDriver driver = new ChromeDriver();
	       		
	       		driver.get("https://www.facebook.com/login.php/");

	  }
}
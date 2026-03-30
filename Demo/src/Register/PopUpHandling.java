package Register;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("12345678");
        driver.findElement(By.name("submit")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();   
        alert.dismiss();
       
    }
}
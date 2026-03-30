 package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownpayment {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/payment-gateway/index.php");
        Select quantity = new Select(
        driver.findElement(By.name("quantity")));
        quantity.selectByVisibleText("5");
        driver.findElement(By.cssSelector("input.button.special")).click();
        driver.findElement(By.name("card_nmuber")).sendKeys("1234567890123456");
        Select month = new Select(
        driver.findElement(By.name("month")));
        month.selectByVisibleText("07");
        Select year = new Select(
        driver.findElement(By.name("year")));
        year.selectByVisibleText("2027");
        driver.findElement(By.name("cvv_code")).sendKeys("123");  
    }
}
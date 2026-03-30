package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.partialLinkText("REGI")).click();
        
    }
}
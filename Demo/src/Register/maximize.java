
package Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maximize {

    public static void main(String[] args) {
        // Optional: Set path to GeckoDriver if not in your Environment Variables
        // System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");

        // Use the WebDriver interface for better flexibility
        ChromeDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://www.nike.com/");

        // Print title to console to verify it worked
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser after a few seconds
        // driver.quit(); 
    }
}
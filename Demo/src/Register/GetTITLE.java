
package Register;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTITLE {

	public GetTITLE() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
						  ChromeDriver driver = new ChromeDriver();

					      driver.get("https://www.facebook.com/");
					      String abc = driver.getTitle();
					      System.out.println(abc);
	}

}
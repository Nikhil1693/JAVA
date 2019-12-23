package Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdeno {
	
public static WebDriver driver; 
	

	@Test
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50024558\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		
		
		
	}
}

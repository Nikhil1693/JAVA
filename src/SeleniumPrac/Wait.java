package SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Wait {
	

	WebDriver driver;

	@Test
	public void test1() {
		
		FluentWait wait=new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS); }
}

package SeleniumPrac;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	WebDriver driver;
	JavascriptExecutor js= (JavascriptExecutor) driver;

	public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\50024558\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,500);");
	driver.findElement(By.id("button1")).click();
	}
	
	public static void main(String args[]) throws InterruptedException {
	
     scroll s=new scroll();
     s.test();

}
}
package SeleniumPrac;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WindowHan {

	WebDriver driver;
	JavascriptExecutor js= (JavascriptExecutor) driver;
	@Test
	
	
	void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\50024558\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello");
		//System.out.println("Hello");
		//js.executeScript("arguments[0].click();", 	driver.findElement(By.id("button1")));
		
		//js.executeScript("window.scrollBy(0,250)");
		
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//button[@id='button1']")));
		js.executeScript("arguments[0].click();", 	driver.findElement(By.xpath("//button[@id='button1']")));
		
//		driver.findElement(By.xpath("//button[@id='button1']")).click();
		
		//	driver.findElement(By.id("button1")).click();	
		
	
		
		String parentWindowHandle=driver.getWindowHandle();
			Set<String> handles=driver.getWindowHandles();
		for(String WindowHandle : handles) {
			if(!WindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(WindowHandle);
				driver.manage().window().maximize();
				
				
				
			
				
			}
		}
		
		driver.quit();	
	}

}

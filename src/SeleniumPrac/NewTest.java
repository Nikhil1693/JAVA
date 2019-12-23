package SeleniumPrac;

import org.testng.annotations.Test;

public class NewTest {
  
	@Test(dependsOnMethods="method2")
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("method2");
	}

	@Test
	public void method3() {
		System.out.println("method 3");
	}
}

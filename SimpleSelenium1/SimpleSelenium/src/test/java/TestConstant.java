import java.util.ResourceBundle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestConstant {

	WebDriver driver = new FirefoxDriver();
	ResourceBundle bundle = ResourceBundle.getBundle("values");

	@Before
	public void setUp() throws Exception {
		driver.get("http://www.google.com");
	}

	@Test
	public void testConstant() throws Exception {
		driver.findElement(By.name(Constants.GOOGLE_INPUT_NAME)).sendKeys(
				"Selenium 2.0 WebDriver");
		driver.findElement(By.name(Constants.GOOGLE_INPUT_NAME)).submit();
		System.out.println("Page title is: " + driver.getTitle());

	}

	@Test
	public void testProperties() throws Exception {
		driver.findElement(By.name(bundle.getString("google_search")))
				.sendKeys("Selenium 2.0 WebDriver");
		driver.findElement(By.name(bundle.getString("google_search"))).submit();
		System.out.println("Page title is: " + driver.getTitle());

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}

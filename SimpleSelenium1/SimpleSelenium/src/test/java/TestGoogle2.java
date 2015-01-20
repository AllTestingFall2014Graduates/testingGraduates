import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle2 {
	WebDriver driver = new FirefoxDriver();

	// this will be executed before each test
	@Before
	public void setUp() throws Exception {
		driver.get("http://www.google.com");
	}

	@Test
	public void testAdvancedSearch() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Selenium 2.0 WebDriver");
		driver.findElement(By.name("q")).submit();
		System.out.println("Page title is: " + driver.getTitle());
	}

	@Test
	public void testSimpleSearch() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Simple search");
		driver.findElement(By.name("q")).submit();
		System.out.println("Page title is: " + driver.getTitle());
	}

	// this is not considered a test because the method is not annotated with
	public void testMe() throws Exception {
		System.out.println("Test Me");
	}

	// this will be executed after each test
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}

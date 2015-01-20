import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWaitFor {

	WebDriver driver = new FirefoxDriver();

	@Before
	public void setUp() throws Exception {
		driver.get("http://www.google.com");
	}

	@Test
	public void testWaitFor() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Selenium 2.0 WebDriver");
		driver.findElement(By.name("q")).submit();
		System.out.println("Page title is: " + driver.getTitle());

		// wait for maximum 10 seconds or until the page title starts with selenium
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("selenium");
			}
		});

		System.out.println("Page title is: " + driver.getTitle());
	}

	@Test
	public void testWaitForElementPresent() throws Exception {
		driver.findElement(By.name("q")).sendKeys("Selenium 2.0 WebDriver");
		driver.findElement(By.name("q")).submit();
		System.out.println("Page title is: " + driver.getTitle());

		// wait for maximum 10 seconds or until the page title is selenium
		(new WebDriverWait(driver, 10))
				.until(new ExpectedCondition<WebElement>() {
					public WebElement apply(WebDriver d) {
						return driver.findElement(By.cssSelector("td.cur"));
					}
				});

		System.out.println("Page title is: " + driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}

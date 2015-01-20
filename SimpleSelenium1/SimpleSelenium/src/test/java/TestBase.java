import java.io.File;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBase {
	WebDriver driver;
	
	@Before
	public void setUp() {

		FirefoxProfile profile = new FirefoxProfile();
		driver = new FirefoxDriver(profile);
	}

	

	/**
	 * Waits a specific amout of time
	 * 
	 * @param value
	 *            - integer and represent number of miliseconds
	 */
	public void sleep(int value) {
		try {
			Thread.sleep(value);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@After
	public void tearDown() {
		driver.quit();

	}

}

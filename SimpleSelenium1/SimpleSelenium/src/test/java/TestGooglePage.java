import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestGooglePage extends TestBase{

	public String GOOGLE_URL = "https://www.google.co.uk/";
	public String GOOGLE_TITLE = "Google";

	
	@Test
	public void testCase1() {

		driver.get(GOOGLE_URL);
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		Assert.assertEquals("Ar trebui sa avem linkul" + GOOGLE_URL,
				GOOGLE_URL, currentUrl);
		System.out.println("assert passed 1");
		Assert.assertEquals("titlul paginii ar trebui sa fie " + GOOGLE_TITLE,
				GOOGLE_TITLE, title);
		System.out.println("assert passed 2");
		WebElement googleFrontImage = driver.findElement(By.id("hplogo"));
		Assert.assertTrue("imaginea google ar trebui sa fie prezenta",
				googleFrontImage.isDisplayed());
		System.out.println("assert passed 3");
		String googleText = driver.findElement(By.id("_eEe")).getText();
		Assert.assertEquals("Google.co.uk oferit în: English", googleText);
		System.out.println("assert passed 4");

		// sleep(10000);

	}

	@Test
	public void testCase2() {
		
		
		
	}
	

}

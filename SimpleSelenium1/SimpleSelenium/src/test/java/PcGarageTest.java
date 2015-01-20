

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class PcGarageTest {
		WebDriver driver = new FirefoxDriver();

		@Before
		public void setUp() throws Exception {
			driver.get("http://www.pcgarage.ro");
		}

		@Test
		public void testAdvancedSearch() throws Exception {
			driver.findElement(By.linkText("Contul meu")).click();
			driver.findElement(By.id("Prenume")).sendKeys("Petruta");
			driver.findElement(By.id("Nume")).sendKeys("Bogdan");
			driver.findElement(By.id("Telefon")).sendKeys("0727328780");
			driver.findElement(By.id("E-mail")).sendKeys("bogdanpetruta@Ymail.com");
			driver.findElement(By.id("Parola")).sendKeys("Parola");
			driver.findElement(By.id("Reintroduceti parola")).sendKeys("Parola");
			driver.findElement(By.linkText("Creeaza cont")).click();
			System.out.println("Page title is: " + driver.getTitle());
			
		}

		@After
		public void tearDown() throws Exception {
			//driver.quit();
		}
	}




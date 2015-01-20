import java.util.Random;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestJawbone extends TestBase{
	
	
	@Test
	public void testCase1ValidData(){
		
		driver.get("https://jawbone.com/user/signup");
		WebElement firstNameInputField = driver.findElement(By.id("new-account-first-name"));
		firstNameInputField.clear();
		firstNameInputField.sendKeys("dana");
		WebElement lastNameInputField = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/form/fieldset[2]/input"));
		lastNameInputField.clear();
		lastNameInputField.sendKeys("g");
		WebElement newAccountEmailInputField = driver.findElement(By.name("new-account-email"));
		newAccountEmailInputField.clear();
		//String email = "email"+generateRandomNumber()+"@email.com";
		String email="daniela@yahoo.com";
		newAccountEmailInputField.sendKeys(email);
		WebElement confirmEmailInputField = driver.findElement(By.id("new-account-confirm-email"));
		confirmEmailInputField.clear();
		confirmEmailInputField.sendKeys(email);
		WebElement updatesCheckBox = driver.findElement(By.id("new-account-updates"));
		// deselect updates checkbox
		if (updatesCheckBox.isSelected()){
			updatesCheckBox.click();
		}
		
		WebElement newAccountPasswordInputField = driver.findElement(By.id("new-account-password"));
		newAccountPasswordInputField.clear();
		newAccountPasswordInputField.sendKeys("passs");
		WebElement confirmPasswordInputField = driver.findElement(By.id("new-account-confirm-password"));
		confirmEmailInputField.clear();
		confirmEmailInputField.sendKeys(email);
		confirmPasswordInputField.clear();
		confirmPasswordInputField.sendKeys("passs");
		WebElement createAccountButton = driver.findElement(By.id("jawbone-create-account-button"));
		createAccountButton.click();
		sleep(5000);
		WebElement newAccountCreated=driver.findElement(By.xpath("/html/body/section/nav[1]/ul[2]/li[2]/a/img"));
		newAccountCreated.click();
		sleep(5000);
		WebElement clickSignOut=driver.findElement(By.xpath("/html/body/section/nav[1]/ul[2]/li[2]/ul/li[3]/a"));
		clickSignOut.click();
		sleep(5000);
		WebElement clickSignIn=driver.findElement(By.id("jawbone-login-trigger"));
		clickSignIn.click();
		WebElement emailInputField=driver.findElement(By.id("jawbone-login-email"));
		emailInputField.click();
		emailInputField.sendKeys(email);
		WebElement passInputField=driver.findElement(By.id("jawbone-login-pass"));
		passInputField.click();
		passInputField.sendKeys("passs");
		WebElement signInButton=driver.findElement(By.id("jawbone-login-form-button"));
		signInButton.click();
		sleep(5000);
		
		String bodyText = driver.findElement(By.xpath("/html/body/section/nav[1]/ul[2]/li[1]/a")).getText();
		Assert.assertTrue("Text found!", bodyText.contains("Support"));
		
		WebElement searchCountry=driver.findElement(By.xpath("/html/body/section/nav[1]/ul[2]/li[3]/a"));
		searchCountry.click();
		WebElement selectIreland=driver.findElement(By.xpath("/html/body/section/nav[1]/ul[2]/li[3]/dl/dd/ul/li[13]"));
		selectIreland.click();
		sleep(5000);
		
		
	}
	
	
//	private int generateRandomNumber(){
		
	//	Random random = new Random();
//	int aaa = random.nextInt(1000);
	//	return aaa;
	}



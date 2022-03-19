package testcasemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest_Maven extends BaseClass {
	
	
	@Test
	public void LoginFailiureTest() {
		
		
		WebElement LoginLink = driver.findElement(By.className("login"));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
			
		UserName.sendKeys("123@abc.com");
			Password.sendKeys("Abcd@1234");
			RememberMe.click();
		
			LoginBtn.click();

		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid";
		
		Assert.assertEquals(ActualMsg, ExpMsg);
		
		//if(ActualMsg.equals(ExpMsg)) {
			//System.out.println("TC Passed");
		//}else {
			//System.out.println("TC Failed");
		}
		
	}

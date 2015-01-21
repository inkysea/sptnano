/**
 * 
 */
package com.springframework.nanotrader.selenium.test;

import org.openqa.selenium.WebDriver;

/**
 * @author Ilayaperumal Gopinathan
 * 
 */
public class LoginTest extends TestBase {
	
	public LoginTest(String baseUrl, WebDriver driver){
		super(baseUrl, driver);
	}

	public void register(String username) {
		try {
			driver.get(baseUrl);
			// Click create new registration
			clickElementById(SHOW_REGISTRATION);
			// Fill up registration form
			typeTextById(REG_FULLNAME, "Test User");
			// driver.findElement(By.id(REG_FULLNAME)).sendKeys("Test User");
			typeTextById(REG_USERNAME, username);
			typeTextById(REG_EMAIL, "testuser@vmware.com");
			typeTextById(REG_PWD, "test");
			typeTextById(REG_PWD_CONFIRM, "test");
			typeTextById(REG_OPEN_BALANCE, "100000");
			typeTextById(REG_CC_NUM, "1234567896543456");
			typeTextById(REG_ADDR, "3401 Hillview Ave, Palo Alto CA 94304");
			// Submit the registration form
			clickElementById(REGISTER);
			// Logout
			// Explicit wait for 5 seconds
			logout();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}

package com.scripts;

import org.testng.annotations.Test;
import com.common.AutomationConstants;
import com.common.BaseTest;
import com.generic.Excel;
import com.pages.LoginPage;



public class LoginTest extends BaseTest implements AutomationConstants {
	@Test
	public void ValidLoginTesting() {
		String username = Excel.getCellValue(INPUT_PATH, "Sheet1", 1, 0);
		String password = Excel.getCellValue(INPUT_PATH, "Sheet1", 1, 1);
		LoginPage page=new LoginPage(driver);
		page.clickSigningButton();
		page.setUserName(username);
		page.setPassword(password);
		page.clickSubmit();
		page.closeBrowser();
		

	}
}
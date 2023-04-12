package pagelayerhrm;

import org.openqa.selenium.By;

import baselayer.Baseclass;

public class HRMragisterpage extends Baseclass {
	
	
	public void openabrowser() {
		Baseclass.inilization();
	}
    
	public void loginFunctionality(String userName,String password) {
		
		
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pasword")).sendKeys(password);
		driver.findElement(By.linkText(" login ")).click();
	}
}

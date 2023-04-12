package testlayer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baselayer.Baseclass;


public class PIMpage extends Baseclass {
	@Test (dependsOnGroups = { "Loginpage" })
	public void Pimpagefunctinality() {
		
		driver.findElement(By.xpath("//a[href=\"/web/index.php/pim/viewPimModule\"]")).click();
		
	}

}

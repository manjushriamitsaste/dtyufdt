package testlayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import baselayer.Baseclass;

public class Loginpage extends Baseclass
{
@BeforeTest
public void setup() {
	Baseclass.inilization();
}
@Test
public void Loginpagefunctionality() {
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
@AfterTest
public void teardown() {
	driver.close();
}
}

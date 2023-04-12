package testlayer;

import org.testng.annotations.Test;

import baselayer.Baseclass;

import pagelayerhrm.HRMragisterpage;

public class Ragisterpagetesthrm extends Baseclass {
	
	@Test(priority=1)
	public void openABrowser() {
		Baseclass.inilization();
	}
	@Test(priority=2)
	public void validateRagisterfunctionality() {
		HRMragisterpage obj=new HRMragisterpage();
		obj.loginFunctionality("Admin","admin123");

}}
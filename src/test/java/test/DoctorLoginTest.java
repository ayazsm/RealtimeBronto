package test;


import org.testng.annotations.Test;

import pages.DoctorLoginpage;

import pages.TestBase;

public class DoctorLoginTest extends TestBase {
	
	DoctorLoginpage objLogin;
	
   @Test
	public void test_DoctorProfilePage() {
		
		
		//Create Login Pageobject
		objLogin = new DoctorLoginpage(driver);
		
		//objLogin.logindod();
		//Login to Application
		objLogin.loginToPage(prop.getProperty("uname"),prop.getProperty("pwd"));
		System.out.println("Doctor Entering a Valid EmailId ");
		System.out.println("Doctor Entering a Valid Password");
		
	}	
}

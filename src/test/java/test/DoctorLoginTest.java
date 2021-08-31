package test;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DoctorLoginpage;
import pages.TestBase;

public class DoctorLoginTest extends TestBase {
	
	DoctorLoginpage objLogin;
	
   @Test
	public void test_DoctorProfilePage() throws IOException {
		
		
		//Create Login Pageobject
		objLogin = new DoctorLoginpage(driver);
		
		//objLogin.logindod();
		//Login to Application
		objLogin.loginToPage(prop.getProperty("uname"),prop.getProperty("pwd"));
		
		System.out.println("We are taking a Screenshot for Doctor Login page");
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot1.png\">Screenshot1</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot1.png\"/>");
		System.out.println("Doctor Entering a Valid EmailId");
		System.out.println("Doctor Entering a Valid Password");
		
	}	
}

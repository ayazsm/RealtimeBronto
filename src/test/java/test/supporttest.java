package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.SupportDoctorProfileChecking;
import pages.SupportLogin;
import pages.SupportTicketInformation;
import pages.TestBase;

public class supporttest extends TestBase {

	SupportLogin objsupport;
	SupportTicketInformation objtktinformation;
	SupportDoctorProfileChecking objDoctorprofile;

	@Test(priority=1)
	public void test_supportpage() throws IOException {


		//Create Login Page object
		objsupport = new SupportLogin(driver);

		//Login to Application
		objsupport.accept(prop.getProperty("SupportPersonEmail"), prop.getProperty("SupportPersonPassword"));
		
		
		System.out.println("Support Person Entering a Email and password");
		File src6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src6, new File("screenshots//screenshot6.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot6.png\">Screenshot6</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot6.png\"/>");
		
		System.out.println("Support Entering a Valid EmailId ");
		System.out.println("Support Entering a Valid Password");

	}

	@Test(priority=2)
	public void test_TicketInformation() throws IOException {


		objtktinformation = new SupportTicketInformation(driver);

		objtktinformation.TktInformation();
		
		
		System.out.println("Taking a Screenshot of Bronto Tickets Information");
		File src7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src7, new File("screenshots//screenshot7.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot7.png\">Screenshot7</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot7.png\"/>");


	}
	
	@Test(priority=3)
	public void test_Doctorprofieviewing() throws IOException {
		
		objDoctorprofile = new SupportDoctorProfileChecking(driver);
		
		objDoctorprofile.clickonDoctorprofileButton();
		
		System.out.println("Taking a Screenshot of Bronto Tickets Information");
		File src8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src8, new File("screenshots//screenshot8.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot8.png\">Screenshot8</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot8.png\"/>");
		
		
	}


}

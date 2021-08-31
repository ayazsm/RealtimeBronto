package test;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.AdminLogin;
import pages.AdminRole;
import pages.AdminSupport;
import pages.TestBase;

public class admintest extends TestBase {

	AdminLogin objLogin;
	AdminRole objRole;
	AdminSupport objsupport;


	@Test(priority=1)
	public void test_adminpage() throws IOException {


		//Create Login Pageo bject
		objLogin = new AdminLogin(driver);


		//Login to Application
		objLogin.loggingtoPage(prop.getProperty("uname1"),prop.getProperty("pwd1"));
		System.out.println("Admin Entering a Valid EmailId ");
		System.out.println("Admin Entering a Valid Password");


		//Taking a Screenshot for Adminlogin
		System.out.println("Taking a Screenshot for Adminlogin");
		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("screenshots//screenshot3.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot3.png\">Screenshot3</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot3.png\"/>");

		

	}

	@Test(priority=2)
	public void test_admindashboard() throws IOException {

		objRole = new AdminRole(driver);

		objRole.CreatingRole();
		
		System.out.println("Admin Creating a Role");
		File src4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4, new File("screenshots//screenshot4.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot4.png\">Screenshot4</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot4.png\"/>");
		
		
	}


	@Test(priority=3)
	public void test_adminsupport() throws IOException {

		objsupport = new AdminSupport(driver);

		objsupport.submit(prop.getProperty("Username"), prop.getProperty("supportEmail"), prop.getProperty("PhoneNo"), prop.getProperty("supportPassword"));
		
		File src5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5, new File("screenshots//screenshot5.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot5.png\">Screenshot5</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot5.png\"/>");
		
		System.out.println("Entering Support username");
		System.out.println("Entering Support Email");
		System.out.println("Entering Support PhoneNo");
		System.out.println("Entering Support password");


	}



}

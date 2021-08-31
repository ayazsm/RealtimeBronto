package test;




import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DoctorSignup;
import pages.TestBase;

public class DoctorsignupTest extends TestBase {


	DoctorSignup objSign;


	@Test
	public void test_doctorSignup() throws IOException{


		//Create Doctor Signup Page Object
		objSign = new DoctorSignup(driver);

		//Enter signup Deatails
		objSign.clickSignup(prop.getProperty("Name"),prop.getProperty("Email"),prop.getProperty("Password"),prop.getProperty("Mobile")); 

		System.out.println("Enter Name of the Doctor");
		System.out.println("Entering a mail");
		System.out.println("Entering a Password");
		System.out.println("Entering a Mobilenumber");

		
     //If you want the screenshot will be visible in your emailable report you must import Apache Commons IO >>2.11.0 	 For Importing purpose ctrl+shift+O click automatically it will import packages.	
		
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("screenshots//screenshot2.png"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot2.png\">Screenshot2</a>");
		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot2.png\"/>");

	}
}
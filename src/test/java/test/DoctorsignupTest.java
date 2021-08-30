package test;




import java.io.IOException;

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

		
//      If you want the screenshot will be visible in your emailable report you must import Apache Commons IO >>2.11.0 	 For Importing purpose ctrl+shift+O click automatically it will import packages.	
		
//		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot1.png\">Screenshot1</a>");
//		Reporter.log("<img src=\"C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\screenshots\\screenshot1.png\"/>");

	}
}
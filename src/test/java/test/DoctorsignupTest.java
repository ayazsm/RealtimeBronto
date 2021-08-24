package test;

import org.testng.annotations.Test;

import pages.DoctorSignup;
import pages.TestBase;

public class DoctorsignupTest extends TestBase {

	
	DoctorSignup objSign;
	
	
	 @Test
	   public void test_doctorSignup() {
		   
		 
		 //Create Doctor Signup Page Object
		   objSign = new DoctorSignup(driver);
		   
		 //Enter signup Deatails
		objSign.clickSignup(prop.getProperty("Name"),prop.getProperty("Email"),prop.getProperty("Password"),prop.getProperty("Mobile"));  
		   
	   }
}

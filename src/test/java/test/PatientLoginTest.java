package test;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.PatientLoginPage;
import pages.Searchdoctor_makeappointment;
import pages.TestBase;



public class PatientLoginTest extends TestBase{
	
	PatientLoginPage objpatientlogin;
	Searchdoctor_makeappointment objappointment;
	
	@Test(priority=1)
	public void loginTest() throws IOException{
		
		objpatientlogin=new PatientLoginPage(driver);
		objpatientlogin.loginToPatient(prop.getProperty("email1"),prop.getProperty("pwd"));

	}
	
}	
	

//	
//	@Test(priority=2)
//	public void patientbookappointment() {
//		
//		objappointment = new Searchdoctor_makeappointment(driver);
//		
//		objappointment.bookappointment(prop.getProperty("strenterlocation"),prop.getProperty("strenterdoctorspecialist"),prop.getProperty("strenterconcerns"));
//			
//	}


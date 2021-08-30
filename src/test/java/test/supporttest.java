package test;

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
	public void test_supportpage() {


		//Create Login Pageo bject
		objsupport = new SupportLogin(driver);

		//Login to Application
		objsupport.accept(prop.getProperty("SupportPersonEmail"), prop.getProperty("SupportPersonPassword"));
		System.out.println("Support Entering a Valid EmailId ");
		System.out.println("Support Entering a Valid Password");

	}

	@Test(priority=2)
	public void test_TicketInformation() {


		objtktinformation = new SupportTicketInformation(driver);

		objtktinformation.TktInformation();


	}
	
	@Test(priority=3)
	public void test_Doctorprofieviewing() {
		
		objDoctorprofile = new SupportDoctorProfileChecking(driver);
		
		objDoctorprofile.clickonDoctorprofileButton();
	}


}

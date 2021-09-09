package test;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.PatientLoginPage;

import pages.TestBase;
import pages.patientBookAppointment;
import pages.patientPersonalinformation;
import pages.patientSearchlocationanddoctorname;
import pages.patientSelectDateandconsultationtype;
import pages.patientViewDoctorProfile;



public class PatientLoginTest extends TestBase{

	PatientLoginPage objpatientlogin;
	patientBookAppointment objappointment;
	patientSearchlocationanddoctorname objlocation;
	patientViewDoctorProfile objbookappoin;
	patientSelectDateandconsultationtype objselectdate;
	patientPersonalinformation objpersonal;
	
	
	
	
	@Test(priority=1)
	public void loginTest() throws IOException{

		objpatientlogin=new PatientLoginPage(driver);
		objpatientlogin.loginToPatient(prop.getProperty("email1"),prop.getProperty("pwd"));

	}

	@Test(priority=2)
	public void bookapointment() {

		objappointment = new patientBookAppointment(driver);
		objappointment.bookappointment();


	}

	@Test(priority=3)
	public void searchlocationanddoctorname() {

		objlocation = new patientSearchlocationanddoctorname(driver);
		objlocation.searchlocationanddoctorname(prop.getProperty("strEnterlocation"), prop.getProperty("strEnterdoctorname"));


	}

	@Test(priority=4)
	public void patientBookAppointment() {

		objbookappoin = new patientViewDoctorProfile(driver);
		objbookappoin.viewingandBookinappointmentwithdoctor();


	}
	
	
	@Test(priority=5)
	public void selectDateandconsultationtype() {
		
		objselectdate = new patientSelectDateandconsultationtype(driver);
		objselectdate.clickonBookappointment();
			
	}
	
	@Test(priority=6)
	public void patientspersonalinfomation() {
		
		objpersonal = new patientPersonalinformation(driver);
       objpersonal.patentpersonalinfo(prop.getProperty("strentersymptoms"));
		
	}

}


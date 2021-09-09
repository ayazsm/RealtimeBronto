package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class patientViewDoctorProfile extends TestBase{
	WebDriver driver;


	public patientViewDoctorProfile(WebDriver driver) {

		this.driver=driver;

	}

	
	public void viewingDoctorprofile() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/button[1]/span[1]")).click();
		log.info("Patient viewing Doctor profile by clicking Book Appointmetn....!!!");
		
	}

   
public void viewingandBookinappointmentwithdoctor() {
		
		this.viewingDoctorprofile();
	}

}

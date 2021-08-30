package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupportDoctorProfileChecking  extends TestBase{


	WebDriver driver;

	public SupportDoctorProfileChecking(WebDriver driver) {

		this.driver = driver;

	}


	//Ticket Information Dashboard
	public void doctorProfile(){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr[5]/td[6]/button")).click();
		log.info("Click on Doctor Profile Viewing Button");

	}


	public void clickonDoctorprofileButton() {


		//click on Bronto Plus Ticket Information
		this.doctorProfile();



	}




}

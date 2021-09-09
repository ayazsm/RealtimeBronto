package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class patientSearchlocationanddoctorname extends TestBase{
	WebDriver driver;


	public patientSearchlocationanddoctorname(WebDriver driver) {

		this.driver=driver;

	}


	public void searchlocation(String strEnterlocation) {

		driver.findElement(By.name("location")).sendKeys(strEnterlocation);
		log.info("Enter the which location you want....!!!");

	}

	public void searchdoctorname(String strEnterdoctorname) {

		driver.findElement(By.name("doctorSpecialist")).sendKeys(strEnterdoctorname);
		log.info("Enter the which Doctor name....!!!");

	}
	
	public void searchbutton() {

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]/*[1]")).click();
		log.info("click on  Search Button....!!!");

	}
	

public void searchlocationanddoctorname(String strEnterlocation,String strEnterdoctorname) {
		
		this.searchlocation(strEnterlocation);
		
		this.searchdoctorname(strEnterdoctorname);
		
		this.searchbutton();
		
	}


}

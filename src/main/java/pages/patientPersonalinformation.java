package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class patientPersonalinformation extends TestBase{
	WebDriver driver;


	public patientPersonalinformation(WebDriver driver) {

		this.driver=driver;

	}
	
	public void self() {
		
		driver.findElement(By.name("appointmentFor")).click();
		log.info("click on Self Button .....!!!!");
	}
	
	
	public void enteryourconcerns(String strentersymptoms) {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[10]/div/div/div/textarea")).sendKeys(strentersymptoms);
		log.info("Patient enter his symptoms");
	}
	
	
	
	
	
	
	
	
	
	
	public void clickonpayment() {
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/button/span[1]")).click();
		
		log.info("After Click on payment Appointment is Booked  with the doctor....!!!");
		
	}
	
	
	
	public void patentpersonalinfo(String strentersymptoms) {
		
		
		this.self();
		this.enteryourconcerns(strentersymptoms);
		this.clickonpayment();
		
	}
	

}

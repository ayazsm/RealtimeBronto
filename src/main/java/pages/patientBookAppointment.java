package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class patientBookAppointment extends TestBase{
    WebDriver driver;
    
    
	public patientBookAppointment(WebDriver driver) {
		
		this.driver=driver;

	}
	
	public void bookappointment() {
		
		driver.findElement(By.xpath("//span[contains(text(),'Book Appointment')]")).click();
		log.info("Click on Book Appointment");
			
	}
	
	
	public void clickonBookappointment() {
		
		this.bookappointment();
		
	}
	
	
}